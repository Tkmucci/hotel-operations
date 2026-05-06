package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void getCheckIn_should_set_isOccupied_to_true() {

        //Arrange
        Room room = new Room(2, false, false);

        //Act
        room.checkIn();

        //Assert
        assertTrue(room.isOccupied());
    }

    @Test
    public void getCheckIn_should_set_isDirty_to_true() {

        //Arrange
        Room room = new Room(2, false, false);

        //Act
        room.checkIn();

        //Assert
        assertTrue(room.isDirty());
    }

    @Test
    public void getCheckOut_should_set_isOccupied_to_false() throws InterruptedException {

        //Arrange
        Room room = new Room(2, false, true);

        //Act
        room.checkOut();

        //Assert
        assertFalse(room.isOccupied());

    }

    @Test
    public void isDirty_false_after_cleanRoom(){

        //Arrange
        Room room = new Room(2, true, false);

        //Act
        room.cleanRoom();

        //Assert
        assertFalse(room.isDirty());

    }

}