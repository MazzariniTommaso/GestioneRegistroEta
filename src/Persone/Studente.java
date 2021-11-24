package Persone;

public class Studente 
{
	private int eta;
	private String nome;
	
	public Studente(String nome, int eta)
	{
		this.eta = eta;
		this.nome = nome;
	}
	
	public void incrementaEta()
	{
		this.eta++;
	}
	
	public String toString()
	{
		return "Nome: " + this.nome + " Eta: " + this.eta;
	}
	public boolean equals (Object o)
	{
		if (o instanceof Studente) 
		{
			Studente stu = (Studente) o;
			return stu.getNome().equals(getNome()) && stu.getEta() == getEta();
		}
		return false;
	}

	public int getEta() {return eta;}

	public String getNome() {return nome;}
	
}
