package Personnel;

public class Entreprise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Salarie S=new Salarie(15,"Salah", 2005);
		//S.afficher();
		//System.out.println(S.salaire());
		//Employe E=new Employe(15,"Salah", 2005,15,150);
		//E.afficher();
		//System.out.println(E.salaire());
		@SuppressWarnings("unused")
		Salarie tabSalarie[]=new Salarie[5];
		tabSalarie[0]=new Employe(12345,"Walid",2002,15,4);
		tabSalarie[1]=new Vendeur(23445,"Yessine",2007,1000,0.1);
		tabSalarie[2]=new Vendeur(65478,"Nassime",2000,700,0.1);
		tabSalarie[3]=new Employe(87698,"Aymen ",2003,19,5);
		tabSalarie[4]=new Employe(12345,"Khaled",2008,7,4);
		/*System.out.println("Liste des employees");
		for(int i=0;i<tabSalarie.length;i++)
		{
			//System.out.println(tabSalarie[i].getClass().getName());
			if(tabSalarie[i] instanceof Employe)
			{
				tabSalarie[i].afficher();
			}
		}
		System.out.println("Listes des vendeurs");
		for(int i=0;i<tabSalarie.length;i++)
		{
			if(tabSalarie[i] instanceof Vendeur)
			{
				tabSalarie[i].afficher();
			}
		}
		System.out.println("Nom du salarie le plus ancien dans l'entreprise ");
		Salarie S=tabSalarie[0];
		
		for(int i=1;i<tabSalarie.length;i++)
		{
			if(S.getRecrut()>tabSalarie[i].getRecrut())
			{
				S=tabSalarie[i];
			}
		}
		System.out.println("Nom: "+S.getNom()+" recrute en l'an "+S.getRecrut());*/
		System.out.println("Matricule du vendeur qui a le plus grans salaire ");
		Salarie Smax=null;
		for(int i=1;i<tabSalarie.length;i++)
		{
			if(tabSalarie[i] instanceof Vendeur)
			{
				if(Smax ==null)
				{
					Smax=tabSalarie[i];
				}
				else if(Smax.salaire()<tabSalarie[i].salaire())
				{
					Smax=tabSalarie[i];
				}
			}
		}
		System.out.println("Matricule: "+Smax.getMatricule()+" de salaire " +Smax.salaire()+"Dt");
		

}
}
