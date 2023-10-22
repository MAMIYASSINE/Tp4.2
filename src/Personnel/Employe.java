package Personnel;

public class Employe extends Salarie {
	
	
	private double Hsupp;
	private double PHsupp;
	Employe(int M, String nom, double r,double Hsupp,double PHsupp) {
		super(M, nom, r);
		// TODO Auto-generated constructor stub
		this.setHsupp(Hsupp);
		this.setPHsupp(PHsupp);
	}
	
	public double getHsupp() {
		return Hsupp;
	}
	public void setHsupp(double hsupp) {
		Hsupp = hsupp;
	}
	public double getPHsupp() {
		return PHsupp;
	}
	public void setPHsupp(double pHsupp) {
		PHsupp = pHsupp;
	}
	@Override
	void afficher()
	{
		super.afficher();
		System.out.println("Hsupp: "+Hsupp+" PHsupp: "+PHsupp);
	}
	@Override
	double salaire()
	{
		double S=super.salaire();
		
		return S+(Hsupp*PHsupp);
	}
	
	
	

}
