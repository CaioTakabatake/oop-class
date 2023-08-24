package activityClasses;

public class Room {
    private int numChairs;
    private int numTables;
    private int roomNumber;
    private boolean hasProjector;
    private int numComputers;

    public Room(int numChairs, int numTables, int roomNumber, boolean hasProjector, int numComputers) {
        this.numChairs = numChairs;
        this.numTables = numTables;
        this.roomNumber = roomNumber;
        this.hasProjector = hasProjector;
        this.numComputers = numComputers;
    }

    public int getNumChairs() {
        return numChairs;
    }

    public void setNumChairs(int numChairs) {
        this.numChairs = numChairs;
    }

    public int getNumTables() {
        return numTables;
    }

    public void setNumTables(int numTables) {
        this.numTables = numTables;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isHasProjector() {
        return hasProjector;
    }

    public void setHasProjector(boolean hasProjector) {
        this.hasProjector = hasProjector;
    }

    public int getNumComputers() {
        return numComputers;
    }

    public void setNumComputers(int numComputers) {
        this.numComputers = numComputers;
    }

    @Override
    public String toString() {
        return "Room{" +
                "numChairs=" + numChairs +
                ", numTables=" + numTables +
                ", roomNumber=" + roomNumber +
                ", hasProjector=" + hasProjector +
                ", numComputers=" + numComputers +
                '}';
    }

    public static void main(String[] args) {
        Room room1 = new Room(30, 15, 1, true, 20);
        Room room2 = new Room(25, 12, 2, false, 15);
        Room room3 = new Room(40, 20, 3, true, 30);

        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);
    }
}

