package org.fasttrackit.lab6main;

import org.fasttrackit.lab6.Cerc;
import org.fasttrackit.lab6.FiguraGeometrica;
import org.fasttrackit.lab6.Patrat;

import javax.sound.midi.Soundbank;
import java.util.*;

/**
 * @author ttritean
 * @since 4/1/2019
 */
public class Lab6Main {

    public static void  main(String args[]) {


        Patrat patrat1 = new Patrat(4);
        System.out.println("Arie Patrat1 : " + patrat1.arie());
        System.out.println("Perimetru Patrat1 : " + patrat1.perimetru());
        patrat1.deseneaza();

        FiguraGeometrica patratFiguraGeometrica = new Patrat(6);


        System.out.println("Arie patratFiguraGeometrica : " +
                patratFiguraGeometrica.arie());
        System.out.println("Perimetru patratFiguraGeometrica : " +
                patratFiguraGeometrica.perimetru());
        patratFiguraGeometrica.deseneaza();

        FiguraGeometrica cerc = new Cerc();

        Cerc castedCerc = (Cerc) cerc;
        castedCerc.setRaza(3);

        ((Cerc)cerc).setRaza(3);
        cerc.perimetru();
        cerc.arie();
        cerc.deseneaza();


        Cerc cerc2 = new Cerc();
        cerc2.setRaza(3);
        cerc2.perimetru();
        cerc2.arie();
        cerc2.deseneaza();


        Set<FiguraGeometrica> figuriGeometriceSet = new HashSet();

        figuriGeometriceSet.add(cerc);
        figuriGeometriceSet.add(patrat1);
        figuriGeometriceSet.add(cerc2);
        figuriGeometriceSet.add(patratFiguraGeometrica);

        for(FiguraGeometrica fg: figuriGeometriceSet) {
            System.out.println("--  in for--------------------------");
            fg.deseneaza();
            System.out.println("arie:" + fg.arie());
        }


        List<FiguraGeometrica> arrayListTest = new LinkedList<FiguraGeometrica>();
        arrayListTest.add(cerc);
        arrayListTest.add(patrat1);
        arrayListTest.add(cerc2);
        arrayListTest.add(0, patratFiguraGeometrica);

        for(FiguraGeometrica fg: arrayListTest) {
            System.out.println("---------arraylits-------------");
            fg.deseneaza();
        }



    }
}
