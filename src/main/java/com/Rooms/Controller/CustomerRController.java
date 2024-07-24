package com.Rooms.Controller;

import com.Rooms.Entity.CustomerRoom;
import com.Rooms.Service.CustomerRoomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/CustomerRoom")
public class CustomerRController {

    private CustomerRoomService customerRoomService;

    public CustomerRController(CustomerRoomService customerRoomService) {
        this.customerRoomService = customerRoomService;

    }

    @PostMapping
    public ResponseEntity<CustomerRoom> getCustomer( @RequestParam long customerId,
                                                     @RequestParam long roomId)
    {
        CustomerRoom customer = customerRoomService.getCustomer(customerId, roomId);
        return  new ResponseEntity<>(customer, HttpStatus.CREATED);

    }
}
