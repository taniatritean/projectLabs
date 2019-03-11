import java.util.Scanner;

/**
 * @author ttritean
 * @since 3/11/2019
 */
public class CarsGame {



    public static void main(String[] args) {

        String car1 = "Ford";
        String car2 = "Skoda";
        String car3 = "Mecedes";

        String[] myCars = new String[3];
        myCars[0] = car1;
        myCars[1] = car2;
        myCars[2] = car3;

        for(int i = 0;i<3;i++) {
            System.out.println("Masina: " + myCars[i]);
        }

        for(String masina: myCars) {
            System.out.println("Masina for each: " + masina);
        }

        int i = 0;
        while(i<myCars.length && myCars[i].charAt(0)!= 'b' &&
                myCars[i].charAt(0) != 'B'  ) {
            System.out.println("Cu while masina este:" +myCars[i]);
            i++;
        }

        int indexDo = 0;
        do {
            System.out.println("DO: " + myCars[indexDo]);
            indexDo++;
        }while (indexDo<myCars.length);

    }
}
