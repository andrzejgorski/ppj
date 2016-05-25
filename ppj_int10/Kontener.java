public class Kontener {
	private Cukierek ladunek;
	private int dniPrzydatnosci;
	private double masaLadunku;

	public Kontener (double masaLadunku) {
		this.masaLadunku = masaLadunku;
	}
	public void zaladuj(Cukierek cukierek, int dniPrzydatnosci) {
		this.dniPrzydatnosci = dniPrzydatnosci;
		this.ladunek = cukierek;
	}
	public boolean sprawdzPrzydatnosc() {
		return dniPrzydatnosci>0;
	}
}
