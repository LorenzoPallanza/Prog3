
public class PairApp {
   public static void main(String[] args) {
	   Pair<Integer> coppia = new Pair<>(45, 300); //autoboxing
	   System.out.println(coppia);
	   System.out.println("Max: "+ coppia.getMassimo());
   }
}

//class Pair<T> {
class Pair <T extends Comparable<T>> {
   private T primo;
   private T secondo;

   public Pair(T uno, T due) {
	   primo = uno;
	   secondo = due;

   }

   public T getPrimo() {
	   return primo;
   }

   public T getSecondo() {
	   return secondo;
   }

   public T getMassimo() {
	   if (primo.compareTo(secondo) >=0) return primo;
	   else return secondo;
   }

   public String toString() {
	   return "primo: " + primo.toString() + "\n" +
	   		  "secondo: " + secondo.toString();
   }
}

