public class GenericiTest {

   public static void main(String[] args) {
   	Classe[] arrayClasse;
	ClasseDue[] arrayClasseDue;
	arrayClasseDue = new ClasseDue[2];
	arrayClasse = arrayClasseDue; // OK -- inserisco elementi del sottotipo in array
	arrayClasse[0] = new ClasseDue(); // OK -- come sopra
	arrayClasse[0] = new Classe(); // ArrayStoreException per cast impossibile: arrayClasse punta ad un array di ClasseDue (sottotipo)
	//arrayClasse[0] = ((ClasseDue)new Classe()); // genera errore di cast
   }
}

class Classe{}
class ClasseDue extends Classe{}

