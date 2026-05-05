package com.pluralsight;

public class HotelApplication {

    public static void main(String[] args) {

        Employee employee = new Employee(1, "John", "Doe", "HR", 100, 45);


        System.out.println(employee.getFullName()+ "'s Total PAY is " + employee.getTotalPay());

        Room room = new Room(2, 100, true, false, false);
        //System.out.println(room.isAvailable());
        Reservation reservation = new Reservation("King", 1, false);

        if (room.isAvailable()) {
            System.out.println("Room is reserved  for " + employee.getFullName() + " successfully");
            System.out.printf("Reservation total is $%.2f", reservation.getReservationTotal());
        }

    }

}
