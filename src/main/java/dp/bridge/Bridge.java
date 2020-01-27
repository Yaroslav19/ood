package dp.bridge;

public class Bridge {
    public static void main(String[] args) {
        Vehicle mitsubi = new Car(new Mitsubi());
        mitsubi.drive();

        Vehicle man = new Track(new Man());
        man.drive();
    }

    interface Model {
        void drive(String modelStr);
    }

    static abstract class Vehicle {
        protected Model model;

        public Vehicle(Model model) {
            this.model = model;
        }

        abstract void drive();
    }

    static class Car extends Vehicle {
        public Car(Model model) {
            super(model);
        }

        @Override
        void drive() {
            model.drive("drive car");
        }
    }

    static class Track extends Vehicle {
        public Track(Model model) {
            super(model);
        }

        @Override
        void drive() {
            model.drive("drive track");
        }
    }

    static class Mitsubi implements Model {
        @Override
        public void drive(String modelStr) {
            System.out.println(modelStr + " Mitsubi");
        }
    }

    static class Man implements Model {
        @Override
        public void drive(String modelStr) {
            System.out.println(modelStr + " MAN");
        }
    }
}
