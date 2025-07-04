package hotel;

public class RoomServiceImpl<T extends Room> implements RoomService<T> {
    @Override
    public void clean(Room room) {
        System.out.println("Cleaning " + room);
    }

    @Override
    public void reserve(Room room) throws RoomAlreadyReservedException {
        if (room.isReserved()) {
            throw new RoomAlreadyReservedException("Room " + room.getRmNum() + " is already reserved.");
        }
        room.setReserved(true);
        System.out.println("Room " + room.getRmNum() + " has been reserved for you.");
    }

    @Override
    public void free(Room room) {
        room.setReserved(false);
        System.out.println("Room " + room.getRmNum() + " is new free.");
    }
}
