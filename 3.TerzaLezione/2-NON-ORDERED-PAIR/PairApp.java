import java.util.*;

public class PairApp {
   public static void main(String[] args) {
	   Pair<Integer> c1 = new Pair<>(45, 30); //autoboxing
	   Pair<Integer> c2 = new Pair<>(30, 45); //autoboxing

	   System.out.println("Pair: <" + c1.getPrimo() + ", " + c1.getSecondo() + ">");
	   System.out.println("Pair: <" + c2.getPrimo() + ", " + c2.getSecondo() + ">");
	   System.out.println("Uguali? " + c1.equals(c2));
	   System.out.println();

	   NonOrderedPair<Integer> c3 = new NonOrderedPair<>(45, 30); //autoboxing
	   NonOrderedPair<Integer> c4 = new NonOrderedPair<>(30, 45); //autoboxing

	   System.out.println("NonOrderedPair: <" + c3.getPrimo() + ", " + c3.getSecondo() + ">");
	   System.out.println("NonOrderedPair: <" + c4.getPrimo() + ", " + c4.getSecondo() + ">");
	   System.out.println("Uguali? " + c3.equals(c4));


   }
}

class NonOrderedPair<T> extends Pair<T> {

   public NonOrderedPair(T uno, T due) {
	   super(uno, due);
   }

   public boolean equals(Object o) {
	   if (o==null || (this.getClass()!=o.getClass())) return false;
	   else {
		   	NonOrderedPair<T> coppia;
		   	coppia = (NonOrderedPair<T>)o;
	   		return ((this.getPrimo().equals(coppia.getPrimo()) && this.getSecondo().equals(coppia.getSecondo())) ||
	   		   		(this.getSecondo().equals(coppia.getPrimo()) && this.getPrimo().equals(coppia.getSecondo())));
		}
   }
}


class Pair<T> {
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

   public String toString() {
	   return "primo: " + primo.toString() + "\n" +
	   		  "secondo: " + secondo.toString();
   }

   public boolean equals(Object o) {
	   if (o==null || (this.getClass()!=o.getClass()))
	   		return false;
	   else {
	   		Pair<T> coppia;
	   		coppia = (Pair<T>)o;
	   		return (primo.equals(coppia.primo) && secondo.equals(coppia.secondo));
		}
   }
}


