package gume;

/**
 * Klasa sadrzi marku i model gume, dimenzije gume (precnik, sirina i visina), get i set metode
 * kao i toString i equals metode.
 * @author Katarina
 * @version 1.0
 */

public class AutoGuma {
	
	/**
	 * Atrinut koji pokazuje marku gume
	 */
	private String markaModel = null;
	
	/**
	 * Atrinut koji pokazuje precnikgume
	 */
	private int precnik = 0;
	
	/**
	 * Atrinut koji pokazuje sirinu gume
	 */
	private int sirina = 0;
	
	/**
	 * Atrinut koji pokazuje visinu gume
	 */
	private int visina = 0;
	
	/**
	 * Metoda vraca marku i model
	 * @return marka i model kao String
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Metoda postavlja vrednost atributa koji se odnosi na marku i model
	 * @param markaModel predstavlja novu vrednost za marku i model
	 * @throws java.lang.RuntimeException ako je vrednost markaModel null ili ako je duzina manja od 3
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * Metoda vraca precnik gume
	 * @return precnik kao int
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Metoda postavlja vrednost atributa koji se odnosi na precnik gume
	 * @param precnik predstavlja novu vrednost precnika gume
	 * @throws java.lang.RuntimeEXception ako je precnik manji od 13 ili veci od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Metoda vraca sirinu gume
	 * @return sirina kao int
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Metoda postavlja vrednost atributa koji se odnosi na sirinu gume
	 * @param sirina predstavlja novu vrednost sirine gume
	 * @throws java.lang.RuntimeEXception ako je sirina manji od 135 ili veci od 355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Metoda vraca visinu gume
	 * @return visina ka int
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * Metoda postavlja vrednost atributa koji se odnosi na visinu gume
	 * @param visina predstavlja novu vrednost visine gume
	 * @throws java.lang.RuntimeEXception ako je visina manja od 25 ili veca od 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * Metoda kojapretvara sve atrinute u string i vraca ih
	 * @return svi atributi kao string
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Metoda poredi 2 objekta klase AutoGuma po svim atributima
	 * @return true ako su jednaki
	 * @return false ako nisu jednaki
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}

}
