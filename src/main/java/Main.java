public class Main {

    public static void main(String[] args) {

        Car car = new Car();
    //    car.make = "Porshe";
    //   car.model = "Carrera";
     //   car.color = "blue";
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCare();
    }
}
