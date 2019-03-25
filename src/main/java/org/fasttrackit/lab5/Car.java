package org.fasttrackit.lab5;

/**
 * @author ttritean
 * @since 3/25/2019
 */
public class Car {

    public static int nrOfCars = 0;

    private String name;

    private String model;

    private int power;

    private Roata roataSpateStanga = new Roata();

    private Roata roataSpateDreapta;

    private Roata roataFataStanga;

    private Roata roataFataDreapta;


    private int nrOfWeels;
    private int nrOfChairs;

    public Car() {
        System.out.println("Constructor called");
        nrOfCars++;
        roataFataDreapta = new Roata();
        roataSpateDreapta = new Roata();
        roataFataStanga = new Roata();
       // nrOfCars = nrOfCars+1;
    }

    public Car(String name, String model){
        this();
        this.name = name;
        this.model = model;
        //nrOfCars++;
    }

    public void run() {
        System.out.println("The car " + name + " is running!");
    }

    public void transportPeople() {
        System.out.println("I am a car. I can carry people:) ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
