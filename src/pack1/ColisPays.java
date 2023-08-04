package pack1;

public class ColisPays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tarif tarif = new Tarif();
		Tarif.initTarifs();
		System.out.println(Tarif.trouverPrix(7000));
	}
}	