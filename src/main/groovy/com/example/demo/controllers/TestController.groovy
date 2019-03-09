package com.example.demo.controllers

import com.example.demo.beans.Employee
import com.example.demo.documents.Inventory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Example
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.http.ResponseEntity
import org.springframework.http.HttpStatus

import com.example.demo.repositories.InventoryRepository
import com.example.demo.repositories.AccountRepository
import com.example.demo.repositories.OrderRepository

import com.example.demo.documents.Account
import com.example.demo.documents.Order

@RestController
@RequestMapping(value = "/ecart-test")
@CrossOrigin(origins = "http://localhost:3000")

class TestController {

    //For testing purpose only
    //private static boolean isFirstRequest = true

    @Autowired
    InventoryRepository inventoryRepository

    @Autowired
    AccountRepository accountRepository

    @Autowired
    OrderRepository orderRepository


    @RequestMapping(value = "/get", method = RequestMethod.GET)
    def get() {
        return inventoryRepository.findAll()
    }

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    synchronized def order(@RequestBody(required = true) Order order) {
        // The below comment is for testing simultaneous request for orders.
        /*if(first) {
            Thread.sleep(5000)
        } else {
            Thread.sleep(1000)
        }*/
        try {
            Account account = accountRepository.findByName(order.getAccountName())
            List<Inventory> items = new ArrayList<>()
            if (account != null) {
                for (Map item : order.getItems()) {
                    Inventory inventory = inventoryRepository.findByName(item.get("name"))
                    try {
                        updateInventory(inventory, item)
                    } catch(Exception e) {
                        e.printStackTrace()
                        return new ResponseEntity<>(HttpStatus.PRECONDITION_FAILED);
                    }
                    items.add(inventory)
                    item.put("totalPrice", inventory.getPrice() * Integer.parseInt(item.get("quantity")))
                }
                for (Inventory inv : items) {
                    inventoryRepository.save(inv)
                }
                orderRepository.save(order)
            } else {
                throw new Exception("Invalid Account Name!")
            }
        } catch(Exception e) {
            e.printStackTrace()
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private void updateInventory(Inventory inventory, Map item) {
        //Update Quantity. Need to check if enough qty is there.
        if(inventory.getQuantity() < Integer.parseInt(item.get("quantity"))) {
            throw new Exception("Not enought quantity!")
        }
        inventory.setQuantity(inventory.getQuantity() - Integer.parseInt(item.get("quantity")))
    }
}