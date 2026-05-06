package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(int numberOfBeds, boolean isDirty, boolean isOccupied) {

        this.numberOfBeds = numberOfBeds;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;

    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        this.isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        this.isDirty = dirty;
    }


    public boolean isAvailable() {


        if (isDirty) {

            isAvailable = false;
//            System.out.println("Needs tidying up, not available");
        } else if (isOccupied) {
            isAvailable = false;
//            System.out.println("Not available, Guests still in");
        } else {
            isAvailable = true;
            System.out.println("Room is available");
        }


        return isAvailable;
    }

    public void setAvailable(boolean available) {

        isAvailable = available;

    }

    public void checkIn() {

        if (isAvailable()) {

            isOccupied = true;
            isDirty = true;
            //System.out.println("Guest checked in, room is now occupied and dirty");
        } else {
            //System.out.println("Cannot check in, room is not available");
        }
    }

    public void checkOut() throws InterruptedException {

            isOccupied = false;
            //System.out.println("Guest checked out, room needs cleaning");

        for (int i = 5; i >= 1 ; i--) {

            //Thread.sleep(1000);
            if (i == 5){

                //System.out.println("CLEANING ROOM");

            }

            Thread.sleep(1000);

            if (i == 1){
                cleanRoom();
            }

        }


    }

    public void cleanRoom() {

            isDirty = false;
            System.out.println("Room cleaned, Ready for next guest");

    }
}
