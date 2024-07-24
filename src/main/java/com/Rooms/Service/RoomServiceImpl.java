package com.Rooms.Service;

import com.Rooms.Entity.Room;
import com.Rooms.Repository.RoomRepository;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService{

    private RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public Room addRoom(Room room) {
        Room saved = roomRepository.save(room);
        return saved;
    }



}
