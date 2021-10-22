
public class PairApp {
   public static void main(String[] args) {
	   //Pair<Integer, Integer > v = new Pair<String, Integer>("Mario Rossi", 30); //illegale, rilevato dal compilatore
	   Pair<String, Integer> voto = new Pair<String, Integer>("Mario Rossi", 30); //autoboxing
	   System.out.println(voto.getPrimo() + ": " + voto.getSecondo());
	   Pair<Integer, Integer> numeri = new Pair<>(25, 48); // autoboxing + Diamond operator
	   System.out.println("Le due coppie sono istanze della stessa classe? " + (voto.getClass() == numeri.getClass()));
	   System.out.println("A quale classe appartengono? " + voto.getClass() + "; "+ numeri.getClass());
	   System.out.println(voto.equals(numeri));
	   Pair<String, Integer> voto2 = new Pair<String, Integer>("Mario Rossi", 30);
	   System.out.println(voto.equals(voto2));
   }
}

class Pair<T1,T2> {
   private T1 primo;
   private T2 secondo;

   public Pair(T1 uno, T2 due) {
	   primo = uno;
	   secondo = due;

   }

   public T1 getPrimo() {
	   return primo;
   }

   public T2 getSecondo() {
	   return secondo;
   }

   public String toString() {
	   return "primo: " + primo.toString() + "\n" +
	   		  "secondo: " + secondo.toString();
   }

   // overloads equals() di Object
   public boolean equals(Pair<T1,T2> coppia) {
   	   if (coppia==null)
   	   		return false;
   	   //Pair<T1, T2> coppia = (Pair<T1, T2>)o;
   	   return (primo.equals(coppia.primo) && secondo.equals(coppia.secondo));
   }

   // overrides equals() di Object
   public boolean equals(Object o) {
   	   if (o==null)
   	   		return false;
   	   if (this.getClass()!=o.getClass())
   	   		return false;
   	   Pair<T1, T2> coppia = (Pair<T1, T2>)o;
   	   return (primo.equals(coppia.primo) && secondo.equals(coppia.secondo));
   }

}

