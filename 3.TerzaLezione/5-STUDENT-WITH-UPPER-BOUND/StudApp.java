import java.util.*;

public class StudApp {
   public static void main(String[] args) {
	   Studente st1 = new Studente("Mario", "Rossi", 123);
	   Studente st2 = new Studente("Maria", "Rossi", 124);
	   System.out.println(st1.compareTo(st2));
	   System.out.println(st2.compareTo(st1));
	   Studente[] lista = new Studente[2];
	   lista[0] = st1;
	   lista[1] = st2;
	   System.out.println("Prima di sort lista[0]: " + lista[0]);
	   Arrays.sort(lista);
	   System.out.println("Dopo sort lista[0]: " + lista[0]);
   }
}


class Studente implements Comparable<Studente> {
    private int matricola;
    private String nome;
    private String cognome;

	public Studente(String n, String c, int m) {
		matricola = m;
		nome = n;
		cognome = c;
	}

   // public int compareTo(Comparable c) { // il compilatore non accetta questo -- bisogna stringere il tipo a Student
   //   Studente s = (Studente)c;
   public int compareTo(Studente s) { // siamo certi che s sia Studente
	  if (this.cognome.compareTo(s.cognome)<0 ||
	   	 (this.cognome.equals(s.cognome) &&
		  this.nome.compareTo(s.nome)<0))
		 return -1;
	  else if (this.equals(s))
	     return 0;
	else return 1;
    }

    public String toString() {
		return nome + " " + cognome;
	}
}
