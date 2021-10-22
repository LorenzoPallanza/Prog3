/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liliana
 */
public class SenzaGenerici {
    public static void printArray(Integer[] ar) {
        for (Integer element : ar) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }
    public static void printArray(Double[] ar) {
        for (Double element : ar) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] elenco1 = {1,2,3,4,5,6};
        Double[] elenco2 = {1.1, 2.2, 3.3, 4.4};

        printArray(elenco1);
        printArray(elenco2);
    }
}
