package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room( int numberOfBeds, double price, boolean isAvailable, boolean isDirty, boolean isOccupied) {

        this.numberOfBeds = numberOfBeds;
        this.price = price;
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
            System.out.println("Room is dirty, not available");
        }
        else if (isOccupied) {
            isAvailable = false;
            System.out.println("Room is occupied, not available");
        }
        else {
            isAvailable = true;
            System.out.println("Room is clean and unoccupied, available");
        }


     return isAvailable;
    }

    public void setAvailable(boolean available) {

        isAvailable = available;

    }
}
