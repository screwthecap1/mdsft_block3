package hotel;

public class Main {
    public static void main(String[] args) {
        RoomService<Room> service = new RoomServiceImpl<>();

        Room eco = new EconomyRoom(29, 100);
        Room lux = new LuxRoom(31, 250);

        service.clean(eco);
        service.clean(lux);

        service.reserve(eco);
        service.free(eco);

        service.reserve(lux);

        try {
            service.reserve(lux);
        } catch (RoomAlreadyReservedException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

    }
}
