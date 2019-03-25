package org.fasttrackit.lab5;

/**
 * @author ttritean
 * @since 3/25/2019
 */
public class CarApplication {

    public static void main(String[] args) {

        Car carMercedes = new Car();
        carMercedes.setName("Mercedes");
        carMercedes.setModel("G class");


        Car carFord = new Car();
        carFord.setName("Ford");
        carFord.setModel("F150");

        Car carAudi = new Car();
        carAudi.setName("Audi");
        carAudi.setModel("Q7");

        Car volvo = new Car("volvo", "s90");
        carMercedes.run();
        carFord.run();
        carAudi.run();
        volvo.run();

        Autobuz myBus = new Autobuz();
        myBus.setModel("bus model");
        myBus.setName("bus name");

        myBus.composteazaBilet();

        Camion myTruck = new Camion();
        myTruck.setModel("MAN");
        myTruck.setName("name MAN");
        myTruck.transportMarfa();


        Camion myTruck2 = new Camion("nume","model");

        System.out.println("WE have created " + Car.nrOfCars + " cars");
//        System.out.println("WE have created " + carFord.nrOfCars + " cars" );

    }

}
