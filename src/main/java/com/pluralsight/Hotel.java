package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {

        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;

    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {

        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }



    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {

        if (isSuite) {

            // Check if enough suites available
            if (this.getAvailableSuites() >= numberOfRooms) {

                bookedSuites += numberOfRooms;
                System.out.println("Suites booked: " + numberOfRooms);

                return true;
            }
        } else {

            // Check if enough basic rooms available
            if (this.getAvailableRooms() >= numberOfRooms) {

                bookedBasicRooms += numberOfRooms;
                System.out.println("Basic rooms booked: " + numberOfRooms);
                return true;
            }
        }
        return false;
    }

    public int getAvailableRooms() {

        return numberOfRooms - bookedBasicRooms;
    }

    public int getAvailableSuites() {

        return numberOfSuites - bookedSuites;
    }

}
