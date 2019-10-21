package new_package;
import java.util.* ;
import java.lang.Object;
import java.time.ZonedDateTime;

public class Vol
{
	static final int Max = 3;
	private String identifiant;
	private int depart;
	private int arrivee;

	public Vol()
	{
		this.identifiant=identifiant;
		this.depart=depart;
		this.arrivee=arrivee;
	}
	public int duree(int depart, int arrivee)
	{
		
		return arrivee-depart;
	}
	
	public String ouvert()
	{

		return("le Vol" + this.identifiant + "est ouvert");

	}

	public String ferme()
	{

		return("Vol" + this.identifiant + "est fermé");

	}

	
}
