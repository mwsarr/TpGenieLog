import java.util.* ;

public class Reservation
{

	//static final int Max;
	public int nombre= 0 ;
	public Date date;
	public Double identifiant;
	public String etat;
	protected Client client = new Client();
	protected Vol vol = new Vol();
	//protected Passager[] passager = new Passager[10];
	

	public Client getClient()
	{
		return client;
	}

	public Vol getVol()
	{
		return vol;
	}

	public void confirmer()
	{
			 //&& this.payer()==0
		if(nombre < vol.Max)
		{
			System.out.println("Reservation Confirmée");
			nombre = nombre+1;
		}
		else if(nombre > vol.Max)
		{
			System.out.println("Vol complet");
		}
		
	}
}
