package domein;

import java.util.ArrayList;
import java.util.List;

public class Spel {
	
	private int score;
	
	public 	List<Speler> spelers;
	public  List<SpelKaarten> kaarten;  //array van maken
	
	
	public Spel()
	{
		kaarten = new ArrayList<SpelKaarten>();
		spelers = new ArrayList<Speler>();
	}
	
	public Spel(Speler speler1, Speler speler2, Speler speler3, Speler speler4)
	{
		spelers.add(speler1);
		spelers.add(speler2);
		spelers.add(speler3);
		spelers.add(speler4);
		
		kaarten = new ArrayList<SpelKaarten>();
	}
	
	public Spel(Speler speler1, Speler speler2, Speler speler3, Speler speler4, Speler speler5)
	{
		spelers.add(speler1);
		spelers.add(speler2);
		spelers.add(speler3);
		spelers.add(speler4);
		spelers.add(speler5);
		
		kaarten = new ArrayList<SpelKaarten>();
	}
	
	
	public int getScore(int score)
	{
		return score;
	}
	
	/*public void kiesAantalSpelers(int aantal)
	{
		
	}*/
	
	/*public String geefNaam(String naam)
	{
		return naam;
	}*/
	
	public void speelSpel()
	{
		
	}
	
	public void spelHervatten()
	{
		
	}
	
	/*public int [] getScore()
	{
		return ;
	}*/
	
	public void addSpeler(Speler speler)
	{
		spelers.add(speler);
	}
	
	
	

}
