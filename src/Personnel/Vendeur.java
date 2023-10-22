package Personnel;

public class Vendeur extends Salarie {
	private double vente;
	private double Pourcentage;
	Vendeur(int M, String nom, double r,double vente,double Pourcentage) {
		super(M, nom, r);
		// TODO Auto-generated constructor stub
		this.Pourcentage=Pourcentage;
		this.vente=vente;
	}
	public double getVente() {
		return vente;
	}
	public void setVente(double vente) {
		this.vente = vente;
	}
	public double getPourcentage() {
		return Pourcentage;
	}
	public void setPourcentage(double pourcentage) {
		Pourcentage = pourcentage;
	}
	@Override
	void afficher()
	{
		super.afficher();
		System.out.println("Vente: "+vente+" Pourcentage: "+Pourcentage);
	}
	@Override
	double salaire()
	{
		double S=super.salaire();
		return S+(vente*Pourcentage);
	}
	

}
