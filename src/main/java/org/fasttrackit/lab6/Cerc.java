package org.fasttrackit.lab6;

/**
 * @author ttritean
 * @since 4/1/2019
 */
public class Cerc  extends FiguraGeometrica {
    private int raza;

    public void setRaza(int raza) {
        this.raza = raza;
    }

    @Override
    public int arie() {
        long rounded =
                Math.round(raza*raza*Math.PI);
        System.out.println("Rounded " +rounded);
        System.out.println("Cast to int : "+
                ((int)(raza*raza*Math.PI)));

        return
                (int)(raza*raza*Math.PI);
    }

    @Override
    public int perimetru() {
        return (int)(2*Math.PI*raza);
    }
}
