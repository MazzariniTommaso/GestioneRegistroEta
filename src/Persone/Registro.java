package Persone;
import java.util.ArrayList;

public class Registro 
{
	ArrayList<Studente> registro = new ArrayList<>();
	
	public void aggiungiStu (Studente s)
	{
		for(Studente x: registro)
		{
			if (s.equals(x))
			{
				System.out.println("Studente gia presente!! " + s);
				return;
			}
		}
		registro.add(s);
		System.out.println("Studente aggiunto: " +s);
	}
	
	public void visualizzaReg() {System.out.println(registro);}
	
	public static void salvaDati()
	{
		
	}

}
