package com.Rooms.Repository;

import com.Rooms.Entity.CustomerRoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRoomRepository extends JpaRepository<CustomerRoom, Long> {
}