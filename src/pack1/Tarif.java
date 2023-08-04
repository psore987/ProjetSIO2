package pack1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

//** La classe Tarif contient tous les tarifs
//** pour les envois en France et vers le Fenua **//

public class Tarif {

	private static List<Integer> lesTypesRec;
	private static Map<Integer, Integer> lesTarifs;
	
	public List<Integer> getLesTypesRec() {
		return lesTypesRec;
	}

	public void setLesTypesRec(List<Integer> lesTypesRec) {
		Tarif.lesTypesRec = lesTypesRec;
	}

	public Map<Integer, Integer> getLesTarifs() {
		return lesTarifs;
	}

	public void setLesTarifs(Map<Integer, Integer> lesTarifs) {
		Tarif.lesTarifs = lesTarifs;
	}

	static void initTarifs() {
		lesTarifs = new HashMap<>();
        lesTarifs.put(250, 750);
        lesTarifs.put(500, 1200);
        lesTarifs.put(750, 2120);
        lesTarifs.put(1000, 2750);
        lesTarifs.put(2000, 2850);
        lesTarifs.put(3000, 3135);
        lesTarifs.put(5000, 3400);
        lesTarifs.put(7000, 3700);
        lesTarifs.put(10000, 3950);
        lesTarifs.put(15000, 4200);
        lesTarifs.put(20000, 4480);
	}
	
	static void ajouteTarif(int poids, int prix) {
		lesTarifs.put(poids, prix);
	}
	
	static void initRecom() {
		  private static List<Integer> lesSupplements;

		    static {
		        lesSupplements = new ArrayList<>();
		        lesSupplements.add(540);
		        lesSupplements.add(610);
		        lesSupplements.add(695);
		        lesSupplements.add(760);
		        lesSupplements.add(830);
		    }
	
	}
	
	static void ajouteRecom (int supplement) {
		
		
	}
	
	static int trouverPrix(int poids) {
		
		return lesTarifs.get(poids);
	}

	
	static void calcPrix(int poids, int typeRecom) {
		
	}
}
