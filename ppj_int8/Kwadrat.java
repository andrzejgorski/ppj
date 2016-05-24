public class Kwadrat {
	
	private int bok;

	public Kwadrat(int a) {
		bok = a;
	}
	public void show() {
		System.out.println("Pole kwadratu to "+(bok*bok));
		System.out.println("Szescian na bazie tego kwadratu to "+(bok*bok*bok));
	}
	public Walec przygotujWalec() {
		int wysokosc = bok;
		double promien = bok/2; 

		return new Walec(promien, wysokosc);
	}
	public int getBok() {
		return bok;
	}
}
