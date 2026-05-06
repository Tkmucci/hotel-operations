package com.pluralsight;

import java.util.Scanner;
import java.time.LocalTime;

public class Main {

    static String userChoice;
    static int roomNum;
    static int numBeds;
    //my scanner for user input
    static Scanner userInput = new Scanner(System.in);
     static Employee employee = new Employee(1, "Elton", "John", "Janitor", 100, 45);
     static Room room = new Room(2, false, false);
     static Reservation reservation = new Reservation("King", 7, true);

     static Hotel hotel = new Hotel("HolidayInn",17, 45);
     static Hotel hotel2 = new Hotel("Hilton",20, 35,2,5);

    //my main method
    public static void main(String[] args) throws InterruptedException {

        LocalTime now = LocalTime.now();

        //my time variables
        int timeIn = now.getHour(), timeOut = 18;

        //printing out the employee's name and punch in time
        System.out.println("Employee " + employee.getFullName() + " punched in at " + timeIn );

        //nice welcome message
        System.out.println("\nWelcome to Mucci Hotel Reservation System");

        //asking the user to choose between 1 or 2 for the hotel they would like to book
        System.out.print("""
                \nPlease select choose between 1 or 2 for the hotel you would like to book:
                1. Holiday Inn
                2. Hilton
                Enter your choice:\s""");
        userChoice = userInput.nextLine();

        //validating the user's choice and asking for the number of rooms they would like to book
        if (userChoice.equalsIgnoreCase("1")){

            System.out.println("\nHotel: " + hotel.getName());
            System.out.println("Available Basic Rooms: " + hotel.getAvailableRooms());
            System.out.println("Available Suites: " + hotel.getAvailableSuites());
            System.out.print("""
                    \n
                    1. Basic Room
                    2. Suite
                    Enter your choice:\s""");
            userChoice = userInput.nextLine();

            if (userChoice.equalsIgnoreCase("1")){

                System.out.print("How many rooms would you like to book?: ");
                roomNum = userInput.nextInt();
                userInput.nextLine();

                reservation.setRoomType("Basic Room");

                hotel.bookRoom(roomNum, false);
            }
            else if (userChoice.equalsIgnoreCase("2")){

                do {
                    reservation.setRoomType("Suite");
                    System.out.print("How many suites would you like to book?: ");
                    roomNum = userInput.nextInt();
                    userInput.nextLine();

                    //checking if there are enough suites available
                    if (hotel.getAvailableSuites() < roomNum) {
                        System.out.println("Not enough suites available, please try again");
                    }
                } while (hotel.getAvailableSuites() < roomNum);

                //booking the suites if there are enough available
                hotel.bookRoom(roomNum, true);
            }
            else {

                System.out.println("Invalid choice, please try again");
                return;
            }
        }
        else if (userChoice.equalsIgnoreCase("2")){

            System.out.println("\nHotel: " + hotel2.getName());
            System.out.println("Available Basic Rooms: " + hotel2.getAvailableRooms());
            System.out.println("Available Suites: " + hotel2.getAvailableSuites());
        }
        else {

            System.out.println("Invalid choice, please try again");
            return;
        }



        //printing out the room details and asking if the user wants to book the room
        System.out.println("\nRoom 1");
        System.out.println("Room type: " + reservation.getRoomType());
        System.out.print("Availability: ");

        //if the room is available, ask the user if they want to book the room
        if (room.isAvailable()) {

            System.out.println("\nWould you like to book this room?");
            System.out.print("Enter Y or N: ");
            String response = userInput.nextLine();

            //if the user responds with Y, ask for the room details and book the room, otherwise cancel the booking
            if (response.equalsIgnoreCase("Y")) {



                System.out.print("First Name: ");
                String firstName = userInput.nextLine();


                System.out.print("Last Name: ");
                String lastName = userInput.nextLine();


                System.out.print("""
                        Bed type:
                        1. King
                        2. Double
                        Enter your choice:\s""");
                numBeds = userInput.nextInt();
                userInput.nextLine();
                String bedType = "";
                if (numBeds == 1){
                    bedType = "King";
                } else if (numBeds == 2){
                    bedType = "Double";
                }


                System.out.print("Number of nights: ");
                int numNights = userInput.nextInt();
                reservation.setNumberOfNights(numNights);

                //printing out the booking details and total cost for confirmation
                System.out.println("Booking room for " + firstName + " " + lastName + " for " + reservation.getNumberOfNights() + " night(s) with " + bedType + " beds");
                System.out.println("Total cost: " + reservation.getReservationTotal());

                System.out.println("Room booked successfully");
                room.checkIn();

                for (int numOfNights = numNights; numOfNights >= 1 ; numOfNights--) {

                    //Thread.sleep(1000);
                    System.out.println(numOfNights + " night(s) remaining");
                    Thread.sleep(1000);

                    if (numOfNights == 1){
                        room.checkOut();
                    }

                }

            } else {
                System.out.println("Room booking cancelled");
            }

        }

        //printing out the employee's name and punch out time, then calculating the total pay for the employee
        System.out.println("\nEmployee " + employee.getFullName() + " punched out at " + timeOut);
        System.out.println(employee.getFullName()+ "'s Total PAY is " + employee.getTotalPay());

        employee.punchTimeCard(timeIn, timeOut);

        System.out.println(employee.getFullName()+ "'s Total PAY is " + employee.getTotalPay());
        System.out.println("Total hours worked this pay period: " + employee.getHoursWorked() + " hours");


        //printing out the hotel details and available rooms and suites for both hotels
        //hotel1


    }


}
