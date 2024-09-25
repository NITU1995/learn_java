package practice.classandobjects;
class Hotel {
    String hotelName = "dark";
    boolean isBookingAvailable = false;
    private int noOfRooms = 20;
    int noOfStaff = 100;
    double googleRating = 4.5;

    Hotel() {
        System.out.println("Welcome to Hotel.");
    }

    Hotel(String hotelName) {
        this.hotelName = hotelName;
        System.out.println("Constructor overloading with 1 param.");
        System.out.println("hotelName set to " + hotelName);
    }

    Hotel(String hotelName, boolean isBookingAvailable) {
        this.hotelName = hotelName;
        this.isBookingAvailable = isBookingAvailable;
        System.out.println("Constructor overloading with 2 param.");
        System.out.println("Hotel Name is " + hotelName);
        System.out.println("Is booking available:  " + this.isBookingAvailable);
    }

    int getNoOfRooms() {
        return this.noOfRooms;
    }

    String bookRooms(int rooms) {
        if (rooms <= this.noOfRooms) {
            this.noOfRooms -= rooms;
            return "Your room is booked successfully.";
        } else {
            return "We don't have " + rooms + " rooms available.";
        }
    }

    void changeGoogleRating(double rating) {
        this.googleRating = rating;
        System.out.println("Google rating changed to " + this.googleRating);
    }

    String callRoomService(int roomNo) {
        return "Room service will be available in 5 minutes to Room No: " + roomNo;
    }

    void checkIn(int roomNo, String date) {
        System.out.println("Checked in to Room No: " + roomNo + " on " + date);
    }

    void checkOut(int roomNo, String date) {
        System.out.println("Checked out from Room No: " + roomNo + " on " + date);
    }

    public static void main(String[] agrs) {
        Hotel obj = new Hotel();
        System.out.println(obj.getNoOfRooms());
        System.out.println(obj.bookRooms(3));
        obj.changeGoogleRating(4.0);
    }
}
