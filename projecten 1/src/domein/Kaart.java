package domein;

public class Kaart {
	
	private String kleur;
	
	
	
	public Kaart(String kleur)
	{
		this.kleur = kleur;
	}
	
	public String getKaart()
	{
		
		return kleur;
	}
	@Override
	public String toString()
	{
		return String.format("De kaart heeft kleur %s", kleur);
	}

}
