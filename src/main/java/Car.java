public class Car {

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public void describeCare() {
        System.out.println(doors + "-Door "
                + color + " "
                + make + " "
                + model + " "
                + (convertible ? "Convertible" : ""));
    }

    //test
}
