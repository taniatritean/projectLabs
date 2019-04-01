package org.fasttrackit.lab6;

/**
 * @author ttritean
 * @since 4/1/2019
 */
public class Triunghi extends FiguraGeometrica {

    private int lungimeLatura1;
    private int lungimeLatura2;
    private int lungimeLatura3;

    @Override
    public int arie() {
        System.out.println("arie triunghi");
        return 10;
    }

    @Override
    public int perimetru() {
        return lungimeLatura1+
                lungimeLatura2+
                lungimeLatura3;
    }
}
