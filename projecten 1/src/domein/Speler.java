package domein;

import java.util.List;

public class Speler {
	
	private String naam;
	private String startkleur;
	
	
	public Speler(String naam, String startkleur)
	{
		setNaam(naam);
		setStartkleur(startkleur);
	}
	
	public String getNaam()
	{
		return naam;
	}
	
	private void setNaam(String naam)
	{
		this.naam = naam;
	}
	
	private void setStartkleur(String startkleur)
	{
		this.startkleur = startkleur;
	}
	public String getstartkleur()
	{
		return startkleur;
	}
	

}