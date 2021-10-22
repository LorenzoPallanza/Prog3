import java.util.*;

public class GenericiArrayListTest {

   public static void main(String[] args) {
   	ArrayList<Classe> arrayClasse;
	ArrayList<ClasseDue> arrayClasseDue;
	arrayClasseDue = new ArrayList<ClasseDue>();
	arrayClasseDue.add(new ClasseDue()); //OK (ho inserito oggetto del tipo degli elementi della lista)
	//arrayClasseDue.add(new Classe()); // NO: argument mismatch; ClasseUno cannot be converted to ClasseDue

	arrayClasse = arrayClasseDue; // errore di compilazione - i due arraylist sono considerati incompatibili
				// incompatible types: ArrayList<ClasseDue> cannot be converted to ArrayList<Classe>
	arrayClasse = new ArrayList<Classe>();
	arrayClasse.add(new ClasseDue()); // ok perchè inserisco oggetto di sottotipo in cella di tipo superiore
   }
}

class Classe{}
class ClasseDue extends Classe{}