package org.fasttrackit.lab6;

/**
 * @author ttritean
 * @since 4/1/2019
 */
public abstract class FiguraGeometrica {

    protected String name;


    public void setName(String name) {
        this.name = name;
    }

    public void deseneaza() {
        System.out.println("Am desenat " + name);
    }
    public abstract int arie();

    public int perimetru(){
        return 0;
    }
}
