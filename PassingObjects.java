public class PassingObjects {
    public static void main(String[] args) {

        Garage garrage = new Garage();
        Car car = new Car("Ferrari");
        Bus bus = new Bus("Komban");

        garrage.parkCars(car);
        garrage.parkBus(bus);

    }
}

class Garage {

    void parkCars(Car car) {
        System.out.println("The "+car.Name+" is parked..!");
    }

    void parkBus(Bus bus) {
        System.out.println("The "+bus.nameOfBus+" is parked..!");
    }

}

class Car {
    String Name;

    Car(String Name) {
        this.Name = Name;
    }

}

class Bus {
    String nameOfBus;
    Bus(String nameOfBus){
        this.nameOfBus = nameOfBus;
    }
}