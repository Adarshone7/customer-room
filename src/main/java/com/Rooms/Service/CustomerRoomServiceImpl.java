package com.Rooms.Service;

import com.Rooms.Entity.Customer;
import com.Rooms.Entity.CustomerRoom;
import com.Rooms.Entity.Room;
import com.Rooms.Repository.CustomerRepository;
import com.Rooms.Repository.CustomerRoomRepository;
import com.Rooms.Repository.RoomRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CustomerRoomServiceImpl implements CustomerRoomService {

    private CustomerRoomRepository customerRoomRepository;
    private RoomRepository roomRepository;
    private CustomerRepository customerRepository;


    public CustomerRoomServiceImpl(CustomerRoomRepository customerRoomRepository, RoomRepository roomRepository, CustomerRepository customerRepository) {
        this.customerRoomRepository = customerRoomRepository;
        this.roomRepository = roomRepository;
        this.customerRepository = customerRepository;
    }


    @Override
    public CustomerRoom getCustomer(long customerId,
                                    long roomId) {
        Customer customer = customerRepository.findById(customerId).get();
        {
            Room room = roomRepository.findById(roomId).get();

            CustomerRoom customerRoom = new CustomerRoom();

            customerRoom.setCustomer(customer);
            customerRoom.setRoom(room);

            CustomerRoom saved = customerRoomRepository.save(customerRoom);
            return saved;


        }
    }
}
