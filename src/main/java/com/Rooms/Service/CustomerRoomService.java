package com.Rooms.Service;

import com.Rooms.Entity.CustomerRoom;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface CustomerRoomService {
    CustomerRoom getCustomer(
             long customerId,
             long roomId);
}
