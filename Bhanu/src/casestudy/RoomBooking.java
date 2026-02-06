package casestudy;

import java.util.Scanner;

public class RoomBooking extends Room {

    static int[] bookedRooms = new int[20];
    static int count = 0;

    static boolean isRoomAlreadyBooked(int roomNo) {
        for (int i = 0; i < count; i++) {
            if (bookedRooms[i] == roomNo) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void bookRoom() {
        if (isRoomAlreadyBooked(roomNo)) {
            System.out.println("Room No " + roomNo + " already booked. Choose another.");
        } else {
            bookedRooms[count++] = roomNo;
            super.bookRoom();  
            displayRoomDetails();
        }
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 2; i++) {
            RoomBooking booking = new RoomBooking();
            System.out.println("Welcome to Hotel Booking System");
            System.out.print("Enter Guest Name: ");
            String guestName = sc.nextLine();
            System.out.println("Choose Room Type:");
            System.out.println("1. Standard (2000)");
            System.out.println("2. Deluxe (3500)");
            int choice = sc.nextInt();
            String roomType;
            double roomPrice;
            if (choice == 1) {
                roomType = "Standard";
                roomPrice = 2000;
            } else if (choice == 2) {
                roomType = "Deluxe";
                roomPrice = 3500;
            } else {
                System.out.println("Invalid Choice");
                return;
            }
            System.out.print("Enter Room Number: ");
            int roomNo = sc.nextInt();
            sc.nextLine();
            booking.setRoomDetails(roomNo, guestName, roomType, roomPrice);
            booking.bookRoom();
            sc.close();
        }
        
    }
}
