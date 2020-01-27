package dp.decorator;

public class Decorator {
    public static void main(String[] args) {
        Pizza cheese = new CheesePizza(new DoughPizza());
        Pizza pep = new PepperoniPizza(cheese);
        System.out.println(pep.makePizza());
    }

    interface Pizza {
        String makePizza();
    }

    static class DoughPizza implements Pizza {
        @Override
        public String makePizza() {
            return "with ";
        }
    }

    static class PepperoniPizza implements Pizza {
        private Pizza pizza;

        public PepperoniPizza(Pizza pizza) {
            this.pizza = pizza;
        }

        @Override
        public String makePizza() {
            return pizza.makePizza() + "Pepperoni ";
        }
    }

    static class CheesePizza implements Pizza {
        private Pizza pizza;

        public CheesePizza(Pizza pizza) {
            this.pizza = pizza;
        }

        @Override
        public String makePizza() {
            return pizza.makePizza() + "Cheese ";
        }
    }
}
