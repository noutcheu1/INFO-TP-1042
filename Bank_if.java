
public class Bank_if{
	//Les clients sont identifiés par un id_client, un nom, un prenom, une profession, un numéro de
	// téléphone, et une date
//d’ouverture de leur compte
	
	protected  int id_tphone;
	protected String id_client, nom, prenom, profession; 
	protected String date;

// creation de la cellule bank 
	 Bank_if (){
	 	 
	 	 nom="inconu";
	     prenom="inconu";
	     profession="non defini";
	     id_client=" ";
	 	 id_tphone=0;  
	     date="non defini";
	 }
	
	 Bank_if (String col_id_client , 	int  col_id_tphone , String col_nom , String col_prenom ,String col_profession, String col_date){
	 	 id_client=col_id_client;
	 	 id_tphone=col_id_tphone;
		 nom=col_nom;
	     prenom=col_prenom;
	     profession=col_profession; 
	     date=col_date;
	 }

	//Retourne le nom du client
public String getNom() {
	return nom;
}

//Retourne le nom prenom du client 
public String getPrenom()
{
	return prenom;
}

//retourne la profession du client 
public String getprofession() {
	return profession;
}
// Retourne le numero d'identifiant  du client
public String getId_client()
{
	return id_client;
}
// Retourne le numero de telephone du client
public int getId_tphone()
{
	return id_tphone;
}
// Retourne la date de creation du compte du client
public String get_date()
{
	return date ;
}
//************* MUTATEURS *************
//Définit le nom du client 
public void setNom(String pNom)
{
	nom = pNom;
}
//Définit le prenom du client 
public void setPrenom(String pPays)
{
	prenom = pPays;
}

//Définit la profession du client
public void setProfession(String nbre)
{
	profession= nbre;
}
// definit le numero d'identifiant  du client
public void setId_client(String id_c)
{
	 id_client =id_c ;
}
// definit le numero de telephone du client
public void setId_tphone(int id_t)
{
	id_tphone =id_t;
}
// definit la date de creation du compte du client
public void set_Date(String dates)
{
 	date =dates ;
}


//fonction affiche 
public String affich(Bank_if con)
{
	if (con==null) {
		return "la liste est vide \n ";
		
	}
	return  "0";//(con.nom+ " : "+con.prenom+ " : "+ con .profession+ " : "+con.id_client + " : "+con.id_tphone+ " : "+ con.date);
}

}