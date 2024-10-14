class Vehicle {
    // @Override
    public void go() {

    }
}

class Car1 extends Vehicle {
    // @Override
    public void go() {
        System.out.println("*The Car Is Moving Fastt!!!!*");
    }
}

class Bike extends Vehicle {
    // @Override
    public void go() {
        System.out.println("*The Bike is on the fire!!!!*");
    }
}

class Helicopter extends Vehicle {
    // @Override
    public void go() {
        System.out.println("*The Helicopter is flying in the skies!!!*");
    }
}

public class PolymorphismIsEasy {
    public static void main(String args[]) {
        Car1 car = new Car1();
        Bike bike = new Bike();
        Helicopter helicopter = new Helicopter();
        Vehicle[] vehicles = { car, bike, helicopter };

        for (Vehicle x : vehicles) {
            x.go();
        }
    }
}