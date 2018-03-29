package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;

/**
 * Klasa koja sadrzi listu guma i metode za dodavanje nove gume u listu i pronalazenje gume u listi
 * @author Katarina
 * @version 1.0
 */
public class VulkanizerskaRadnja {
	
	/**
	 * Lista objekata klase AutoGuma
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Metoda za dodavanje nove gume u listu guma
	 * @param a , ta nova guma koja se dodaje
	 * @throws java.lang.NullPointerException ako je parametar koji se unosi null
	 * @throws java.lang.RuntimeException ako takva guma vec postoji u listi
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	/**
	 * Metoda koja pronalazi gume odredjenih proizvodjaca iz liste i vraca listu tih guma
	 * @param markaModel , marka gume koja se trazi u listi
	 * @return lista koja sadrzi sve gume zadatog proizvodjaca ili null ako je unet model null
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}

}
