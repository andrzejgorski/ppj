public class Cukierek {
	private String smak;
	private double waga;

	public Cukierek(String smak, double waga) {
		this.smak = smak;
		this.waga = waga;
	}
	public void show() {
		System.out.println("Smak: "+smak);
		System.out.println("Waga: "+waga);
	}
}
