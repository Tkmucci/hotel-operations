package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room( int numberOfBeds, boolean isAvailable, boolean isDirty, boolean isOccupied) {

        this.numberOfBeds = numberOfBeds;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;

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


        if (isDirty)        {
            isAvailable = false;
            System.out.println("Needs tidying up, not available");
        }
        else if (isOccupied) {
            isAvailable = false;
            System.out.println("Not available, Guests still in");
        }
        else {
            isAvailable = true;
            System.out.println("Room is available");
        }


     return isAvailable;
    }

    public void setAvailable(boolean available) {

        isAvailable = available;

    }
}
