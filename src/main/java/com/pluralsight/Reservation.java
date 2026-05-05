package com.pluralsight;

public class Reservation {

    private String roomType;
    private int numberOfNights;
    private double price;
    private boolean isWeekend;
    private double reservationTotal;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {

        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;

        setRoomType(roomType);

    }

    public String getRoomType() {

        return roomType;
    }

    public void setRoomType(String roomType) {

        this.roomType = roomType;

        if (roomType.equalsIgnoreCase("King")) {
            this.price = 139.00;
        } else if (roomType.equalsIgnoreCase("Double")) {
            this.price = 124.00;
        }
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double getPrice() {



        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal() {

        double upcharge = 0.1;

        reservationTotal = price * numberOfNights;

        if (isWeekend) {

            reservationTotal = reservationTotal + (reservationTotal * upcharge);
        }



        return reservationTotal;
    }

    public void setReservationTotal(double reservationTotal) {

        this.reservationTotal = reservationTotal;

    }
}
