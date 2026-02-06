package casestudy;

public class Room {

    protected int roomNo;
    protected String guestName;
    protected String roomType;
    protected double roomPrice;
    protected boolean isBooked;

    public void setRoomDetails(int roomNo, String guestName,
                               String roomType, double roomPrice) {
        this.roomNo = roomNo;
        this.guestName = guestName;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
    }

    public void bookRoom() {
        if (isBooked) {
            System.out.println("Room already booked!");
        } else {
            isBooked = true;
            System.out.println("Room booked successfully.");
        }
    }

    public void displayRoomDetails() {
        System.out.println("Room No   : " + roomNo);
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type : " + roomType);
        System.out.println("Price     : " + roomPrice);
    }
}
