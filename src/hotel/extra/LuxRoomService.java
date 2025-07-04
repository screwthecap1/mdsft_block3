package hotel.extra;

import hotel.LuxRoom;
import hotel.RoomService;

public interface LuxRoomService<T extends LuxRoom> extends RoomService<T> {
    void foodDelivery(T room);
}
