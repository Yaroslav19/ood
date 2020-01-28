package dp.facade;

public class Facade {
    public static void main(String[] args) {
        new LivingRoom().startWork();
    }

    static class Light {
        void switchOnLignt() {
            System.out.println("Switched on light..");
        }
    }

    static class Laptop {
        void switchOnLaptop() {
            System.out.println("Opened laptop..");
        }
    }

    static class RoomFacade {
        private Light light = new Light();
        private Laptop laptop = new Laptop();

        void startWork() {
            light.switchOnLignt();
            laptop.switchOnLaptop();
        }
    }

    static class LivingRoom {
        private RoomFacade roomFacade = new RoomFacade();
        void startWork() {
            roomFacade.startWork();
        }
    }

    // BedRoom..
}
