package ui;

import java.util.Random;
import java.util.Scanner;

import domein.Spel;
import domein.DomeinController;
import domein.Speler;
public class SpelApplicatie {
	
	private DomeinController dc;
	
	public SpelApplicatie(DomeinController dc)
	{
		this.dc = dc;
	}
	public void spelen()
	{
	System.out.println("Welkom bij het spel Coloretto");
	
	Scanner input = new Scanner(System.in);
	
	int aantalSpelers=0;
	
	System.out.print("Met hoeveel spelers wilt u het spel spelen (4 of 5): ");
	 aantalSpelers = input.nextInt();
	
	if(aantalSpelers < 4 || aantalSpelers > 5 ) // kijkt of er 4 of 5 spelers zijn
	{
		throw new IllegalArgumentException("U moet kiezen tussen 4 of vijf spelers");
	}
	// namen initialiseren
	
	String[] spelers = new String[] {"", "", "", "", ""}; //array namen spelers
	
	
	
	
	String[] kleuren = new String[] {"oranje", "blauw", "rood", "geel", "grijs", "groen", "roze"}; //array kleuren
	Random random = new Random(); //random generator
	
	if(aantalSpelers == 4 )
	{
		System.out.print("naam speler 1: ");
	 	spelers[0] = input.next();
	 	System.out.print("naam speler 2: ");
	 	spelers[1] = input.next();
	 	System.out.print("naam speler 3: ");
	 	spelers[2] = input.next();
	 	System.out.print("naam speler 4: ");
	 	spelers[3] = input.next();
	 	
	 	
	 	int select = random.nextInt(kleuren.length);
		System.out.printf("%s krijgt de kleur %s.%n", spelers[0], kleuren[select]);
		Speler speler0 = new Speler(spelers[0], kleuren[select]); //maakt speler0 in domein
		select = random.nextInt(kleuren.length); 
		
		System.out.printf("%s krijgt de kleur %s.%n", spelers[1], kleuren[select]);
		Speler speler1 = new Speler(spelers[1], kleuren[select]); //maakt speler1 in domein
		select = random.nextInt(kleuren.length);
		
		System.out.printf("%s krijgt de kleur %s.%n", spelers[2], kleuren[select]);
		Speler speler2 = new Speler(spelers[2], kleuren[select]); //maakt speler2 in domein
		select = random.nextInt(kleuren.length);
		
		Speler speler3 = new Speler(spelers[3], kleuren[select]); //maakt speler3  in domein
		System.out.printf("%s krijgt de kleur %s.%n", spelers[3], kleuren[select]);

	}
	
	
	else if(aantalSpelers == 5 )
	{
		
		System.out.print("naam speler 1: ");
		 spelers[0] = input.next();
		 System.out.print("naam speler 2: ");
		 spelers[1] = input.next();
		 System.out.print("naam speler 3: ");
		 spelers[2] = input.next();
		 System.out.print("naam speler 4: ");
		 spelers[3] = input.next();
		 System.out.print("naam speler 5: ");
		 spelers[4] = input.next();
		 
		 
		 int select = random.nextInt(kleuren.length);
		 System.out.printf("%s krijgt de kleur %s.%n", spelers[0], kleuren[select]);
		 Speler speler0 = new Speler(spelers[0], kleuren[select]);
		  select = random.nextInt(kleuren.length);
		  
		 System.out.printf("%s krijgt de kleur %s.%n", spelers[1], kleuren[select]);
		 Speler speler1 = new Speler(spelers[1], kleuren[select]);
		  select = random.nextInt(kleuren.length);
		  
		 System.out.printf("%s krijgt de kleur %s.%n", spelers[2], kleuren[select]);
		 Speler speler2 = new Speler(spelers[2], kleuren[select]);
		  select = random.nextInt(kleuren.length);
		  
		 System.out.printf("%s krijgt de kleur %s.%n", spelers[3], kleuren[select]);
		 Speler speler3 = new Speler(spelers[3], kleuren[select]);
		 select = random.nextInt(kleuren.length);
		 
		 System.out.printf("%s krijgt de kleur %s.%n", spelers[4], kleuren[select]);
		 Speler speler4 = new Speler(spelers[4], kleuren[select]);
		 
	}
	System.out.print("Het spel gaat beginnen");
	
	
	
	 	

}
		
	}
		 	
	


/*
 Welkom bij het spel coloretto
Met hoeveel spelers wenst u het spel te spelen?
4 of 5 ...
naam speler 1: ..........
naam speler 2: ..........
naam speler 3: ..........
naam speler 4: ..........
naam speler 5: ..........

speler 1 krijgt kleur ....
speler 2 krijgt kleur ....
speler 3 krijgt kleur ....
speler 4 krijgt kleur ....
speler 5 krijgt kleur ....

het spel gaat beginnen

speler 1 is aan de beurt
optie 1: trek een kaart 
optie 2: neem een stapel

neem een stapel
optie 1: stapel 1
optie 2: stapel 2
optie 3: stapel 3
optie 4: stapel 4
optie 5: stapel 5*/
