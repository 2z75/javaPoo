public class Hangar {

    public static void main(String[] args) {

        Car car = new Car("BMW", 18000);
        Boat boat = new Boat("Bateau à voile", 750);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}
