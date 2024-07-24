package com.Rooms.Controller;

import com.Rooms.Entity.Room;
import com.Rooms.Service.RoomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/V1/Room")
public class RoomController {

    private RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping
    public ResponseEntity<Room> addRoom(@RequestBody Room room) {

        Room rm = roomService.addRoom(room);
        return new ResponseEntity<>(rm, HttpStatus.CREATED);


    }
}
