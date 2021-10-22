import java.util.*;

public class WildCardTest {

   public static void main(String[] args) {
   	ArrayList<?> lista1;
   	//lista1.add("Ciao"); // error: no suitable method found for add(String)
   	//lista1.add(new Object()); // idem, per Object

   	ArrayList<? extends Number> lista2;
   	//lista2.add(new Integer(2)); // error: no suitable method found for add(Integer)
   	Number num = 54;
   	//lista2.add(num); //error: no suitable method found for add(Number)

	ArrayList<Integer> numeri = new ArrayList<Integer>();
	numeri.add(50);   // autoboxing
	numeri.add(23);
	System.out.println(sum(numeri));

	ArrayList<Number> numeri2 = new ArrayList<Number>();
	numeri2.add(num);
	numeri2.add(num);
	System.out.println(sum(numeri2));
   }

   public static Number sum(ArrayList< ? extends Number > lista) {
	   double tot = 0;
	   for (Number el : lista) {
		   tot = tot+el.doubleValue();
	   }
	   return tot;
   }
}


