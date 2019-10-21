import java.util.* ;
import new_package.*;

public class Reservation
{

	//static final int Max;
	public int nombre= 0 ;
	public Date date;
	public Double identifiant;
	public String etat;
	ArrayList <Client> cl = new ArrayList<Client>();
	Vol v = new Vol();
	ArrayList <Passager>pass = new ArrayList<Passager>();
	

	/*public Client getClient()
	{
		return cl.get();
	}

	public Vol getVol()
	{
		return v.get();
	}*/

	public void confirmer()
	{
			 //&& this.payer()==0
		if(nombre < Vol.Max)
		{
			System.out.println("Reservation Confirmée");
			nombre = nombre+1;
		}
		else if(nombre > Vol.Max)
		{
			System.out.println("Vol complet");
		}
		
	}
	public static void main()
	{
		Reservation r = new Reservation();
		r.confirmer();
	}
}
