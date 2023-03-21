public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCare();

        Car targa = new Car();
        targa.setMake("Dodoche");
        targa.setModel("DX");
        targa.setDoors(5);
        targa.setConvertible(true);
        targa.setColor("blue");
        targa.describeCare();
    }
}
