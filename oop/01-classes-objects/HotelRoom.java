public class HotelRoom {

    int roomNumber;
    String roomType;
    double pricePerNight;
    boolean available;

    void bookRoom() {

        if (available) {
            available = false;
            System.out.println("Room " + roomNumber + " booked successfully.");
        } else {
            System.out.println("Room " + roomNumber + " already booked.");
        }
    }

    void cancelBooking() {

        available = true;
        System.out.println("Booking cancelled for room " + roomNumber);
    }
}