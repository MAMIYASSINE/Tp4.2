package Personnel;

public class Salarie {
	public abstract class Employe {

	}
	protected int Matricule;
	protected String nom;
	protected double Recrutement;
	Salarie(int M,String nom,double r)
	{
		this.setMatricule(M);
		this.setNom(nom);
		this.setRecrut(r);
	}
	public int getMatricule() {
		return Matricule;
	}
	public void setMatricule(int matricule) {
		Matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getRecrut() {
		return Recrutement;
	}
	public void setRecrut(double recrut) {
		this.Recrutement = recrut;
	}
	@Override
	public String toString()
	{
		return "Matricule: "+Matricule+" Nom: "+nom+" Recrutement: "+Recrutement;
	}
	void afficher()
	{
		System.out.println("C'est un "+this.getClass().getName()+" " +this);
	}
	double salaire()
	{
		double S=0;
		if(Recrutement<2005)
		{
			S=400;
		}
		else
		{
			S=280;
		}
		return S;
	}

	
}
