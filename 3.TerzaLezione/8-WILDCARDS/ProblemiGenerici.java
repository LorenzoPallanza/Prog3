import java.util.*;

public class ProblemiGenerici {

	static void printCollection(ArrayList<Object> c) {
	   for(Object ob : c)
	      System.out.println(ob);
	}

    public static void main(String[] args) {
   	   ArrayList<String> lista = new ArrayList<>();
	   //printCollection(lista); //error: incompatible types: ArrayList<String> cannot be converted to ArrayList<Object>
	   ArrayList<Object> lista1 = new ArrayList<>();
	   String s = "ciao";
	   lista1.add(s); lista1.add(s);
	   printCollection(lista1);
   }
}

