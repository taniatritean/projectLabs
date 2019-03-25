package org.fasttrackit.lab5magazin;

/**
 * @author ttritean
 * @since 3/25/2019
 */
public class MagazinApplication {

    public static void main(String[] args){

        CatalogDeProduse catalog = new CatalogDeProduse();
        Produs productOne = new Produs();
        productOne.setName("Lapte");

        Produs lapte2 = new Produs();
        lapte2.setName("Lapte");

        Produs productTwo = new Produs();
        productTwo.setName("Paine");

        catalog.addProduct(productOne);
        catalog.addProduct(productTwo);
        catalog.addProduct(lapte2);

        System.out.println("Magazinul are acest numar de produse: "+
                catalog.getNumberOfProducts());
    }
}
