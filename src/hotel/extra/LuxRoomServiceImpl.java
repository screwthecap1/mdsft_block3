package hotel.extra;

import hotel.LuxRoom;
import hotel.Room;
import hotel.RoomAlreadyReservedException;

public class LuxRoomServiceImpl<T extends LuxRoom> implements LuxRoomService<T> {

    @Override
    public void clean(T room) {
        System.out.println("Cleaning (luxury)" + room);
    }

    @Override
    public void reserve(T room) throws RoomAlreadyReservedException {
        if (room.isReserved()) {
            throw new RoomAlreadyReservedException("Lux room " + room.getRmNum() + " is already reserved.");
        }
        room.setReserved(true);
        System.out.println("Lux room " + room.getRmNum() + " has been reserved for you.");
    }

    @Override
    public void free(T room) {
        room.setReserved(false);
        System.out.println("Room " + room.getRmNum() + " is now free.");
    }

    @Override
    public void foodDelivery(T room) {
        if(!room.isReserved()) {
            System.out.println("cannot deliver food: Lux room " + room.getRmNum() + " is not reserved.");
            return;
        }
        System.out.println("Food has been delivered to Lux room " + room.getRmNum() + ".");
    }


}
