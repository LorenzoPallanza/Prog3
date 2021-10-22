public class ConMetodiGenerici {
    public static <E> void printArray(E[] ar) {
        for (E element : ar) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }

    public static <E> E getElement(E[] ar, int index) {
        E ris = ar[index];
        return ris;
    }

    public static void main(String[] args) {
        Integer[] elenco1 = {1,2,3,4,5,6};
        Double[] elenco2 = {1.1, 2.2, 3.3, 4.4};
        String[] elenco3 = {"aa", "bb", "cc"};

        printArray(elenco1);
        printArray(elenco2);
        printArray(elenco3);

        Integer intero = getElement(elenco1, 0);
        System.out.println(intero);
        System.out.println(getElement(elenco3, 0));
    }
}
