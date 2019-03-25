package org.fasttrackit.lab5;

/**
 * @author ttritean
 * @since 3/25/2019
 */
public class Camion extends Car {

    private String bena;

    private int tonaj;


    public Camion() {
        super();
        bena = "bena";

    }

    public Camion(String name, String model) {
        super(name, model);
    }

    public void transportMarfa() {

        System.out.println("Sunt camion: Transport marfa ");

    }
}
