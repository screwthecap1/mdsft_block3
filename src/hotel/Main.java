package hotel;

import hotel.extra.Prices;
import hotel.extra.LuxRoomService;
import hotel.extra.LuxRoomServiceImpl;


public class Main {
    public static void main(String[] args) {
        RoomService<Room> service = new RoomServiceImpl<>();

        Room eco = new EconomyRoom(29, Prices.ECONOMY.getPrice());
        Room lux = new LuxRoom(31, Prices.LUX.getPrice());

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

        // --- Тестируем LuxRoomService ---
        System.out.println("\n--- Testing LuxRoomService ---");
        LuxRoomService<LuxRoom> luxService = new LuxRoomServiceImpl<>();

        LuxRoom luxRoom = new LuxRoom(301, 250);

        luxService.clean(luxRoom);             // чистим комнату
        luxService.foodDelivery(luxRoom);      // доставка еды (комната пока не забронирована)

        luxService.reserve(luxRoom);           // бронируем комнату
        luxService.foodDelivery(luxRoom);      // доставка еды после бронирования

        luxService.free(luxRoom);              // освобождаем комнату
        luxService.foodDelivery(luxRoom);      // доставка еды после освобождения
    }
}
