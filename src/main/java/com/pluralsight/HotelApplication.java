package com.pluralsight;

import java.util.Scanner;

public class HotelApplication {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        Employee employee = new Employee(1, "Elton", "John", "HR", 100, 45);


        System.out.println(employee.getFullName()+ "'s Total PAY is " + employee.getTotalPay());

        Room room = new Room(2, true, false, false);
        //System.out.println(room.isAvailable());
        Reservation reservation = new Reservation("King", 7, true);

        System.out.println("Room 1");
        System.out.println("Room type: " + reservation.getRoomType());
        System.out.print("Availability: ");
        if (room.isAvailable()) {

            System.out.println("Would you like to book this room?");
            System.out.print("Enter Y or N: ");
            String response = userInput.nextLine();

            if (response.equalsIgnoreCase("Y")) {

                System.out.print("First Name: ");
                String firstName = userInput.nextLine();
                employee.setFirstName(firstName);
                System.out.print("Last Name: ");
                String lastName = userInput.nextLine();
                employee.setLastName(lastName);
                System.out.print("Number of beds needed: ");
                int numBeds = userInput.nextInt();
                room.setNumberOfBeds(numBeds);
                System.out.print("Number of nights: ");
                int numNights = userInput.nextInt();
                reservation.setNumberOfNights(numNights);

                System.out.println("Booking room for " + employee.getFullName() + " for " + reservation.getNumberOfNights() + " nights");
                System.out.println("Total cost: " + reservation.getPrice() * reservation.getNumberOfNights());

                room.setAvailable(false);
                System.out.println("Room booked successfully");
            } else {
                System.out.println("Room booking cancelled");
            }

        }
    }

}
