package org.fasttrackit.lab4Work;

import java.util.Scanner;

/**
 * @author ttritean
 * @since 3/18/2019
 */
public class MedieAritmeticaSir {

    public static void main(String args[]){

        float aritmetica = medieAritmeticaIDE();
        System.out.println("Media aritmetica" +
                " este: "+aritmetica);
    }

    private static float medieAritmeticaIDE() {
        Scanner scan = new Scanner(System.in);
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            suma += scan.nextInt();
        }
        return (float) suma / 3;
    }


    private static float computeMedieAritmetica() {
        Scanner scan = new Scanner(System.in);
        int suma = 0;
        for(int i=0;i<3;i++) {
            suma += scan.nextInt();
        }
        float aritmetica = (float)suma/3;
return aritmetica;
    }

}
