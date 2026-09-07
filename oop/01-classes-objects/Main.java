public class Main {

    public static void main(String[] args) {

        HotelRoom room101 = new HotelRoom();

        room101.roomNumber = 101;
        room101.roomType = "Deluxe";
        room101.pricePerNight = 4500;
        room101.available = true;

        room101.bookRoom();

        System.out.println("Room Type: " + room101.roomType);
        System.out.println("Price: " + room101.pricePerNight);
        System.out.println("Available: " + room101.available);
    }
}