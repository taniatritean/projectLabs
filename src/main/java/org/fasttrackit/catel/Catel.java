package org.fasttrackit.catel;

/**
 * @author ttritean
 * @since 3/11/2019
 */
public class Catel {

    private String name;

    private int greutate;

    private int varsta;


    public void setName(String wantedName) {
        name = wantedName;
    }

    public int getVarsta() {
        return varsta;
    }

    public void latra() {
        System.out.println("Ham");

    }

    public void mananca() {
        greutate++;

        if (greutate >= 10) {
            varsta++;
        }

    }


    public String getName() {
        return name;
    }
}
