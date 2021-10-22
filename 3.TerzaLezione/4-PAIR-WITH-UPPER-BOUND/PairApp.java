
public class PairApp {
   public static void main(String[] args) {
	   Pair<MioTipo> coppia1 = new Pair<>(new MioTipo("Ciao "), new MioTipo("mondo"));
	   System.out.println(coppia1);
	   Pair<SottoTipo> coppia2 = new Pair<>(new SottoTipo("Ciao "), new SottoTipo("mondo2"));
	   System.out.println(coppia2);
	   //Pair<String> coppiaWrong = new Pair<String>("Ciao ", "mondo"); // error: type argument String is not within bounds of type-variable T
	   Pair<MioTipo> coppia3;
	   Pair<SottoTipo> coppia4;
	   //coppia3 = coppia4; // error: incompatible types: Pair<SottoTipo> cannot be converted to Pair<MioTipo>
	   //coppia4 = coppia3;   // error: incompatible types: Pair<MioTipo> cannot be converted to Pair<SottoTipo>
	   Pair<MioTipo>coppia5 = new Pair<>(new SottoTipo("Prova "), new SottoTipo("upcasting"));
	   coppia1 = coppia5;
	   System.out.println(coppia1);
   }
}


class MioTipo {
	private String x;
	public MioTipo(String x) {
		this.x = x;
	}
	public String toString() {
		return x;
	}
}

class SottoTipo extends MioTipo {
	public SottoTipo(String x) {
		super(x);
	}
}


class Pair <T extends MioTipo> {
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
}

