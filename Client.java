public  class Client extends Bank_if{
	 private Bank_if	 infos;
	Client suiv;
	//pointeur vers le premier element de ma liste 
	
	Client (){
		super();
		suiv =null;

	}
	Client ( String cold_client , 	int  cold_tphone , String colnom , String colprenom ,String colprofession, String coldate ,Client a){
		super(cold_client , 	cold_tphone , colnom ,colprenom ,colprofession,  coldate);
		suiv =a;

	}
	//ajout de la tete 
	public Bank_if tete(){
 	return infos ;
 } 
	//definition des indormations du client 
	public void set_client_if(Bank_if dates)
	{
 		infos=dates ;
	}
	public Bank_if get_client_if(){
		return infos ;
	}

	public Client insererEnQueue (Bank_if x, Client a){
	//a.affiche(a);
	return new Client(x,a);
	
}


public void affiche(Client p)
{
	
System.out.printf("hello w145orld \n");
	if (p==null)
	 {

		System.out.println("la liste de client ou de compte est vide est vide \n ");
		
	}
	else{
		while(p!=null)
		{
			System.out.printf("hello world 123\n");
			System.out.println("nom :"+p.nom+ "| prenom  : "+p.prenom+ " : "+p.profession+ " id du client: "+p.id_client + " n tel: "+p.id_tphone+ " date de sauvegarde: "+p.date);
			p=p.suiv;		
		}
	}

	
}


}
