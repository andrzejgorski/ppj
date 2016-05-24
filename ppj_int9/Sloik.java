public class Sloik {
	private Dzem dzem;
	private boolean otwarty;
	
	public Sloik(Dzem dzem) {
		this.otworz();
		this.dzem = dzem;
		this.zamknij();
	}
	private boolean otworz() {
		return otwarty = true;
	}
	private boolean zamknij() {
		return otwarty = false;
	}
	private boolean czyOtwarty() {
		return otwarty;
	}
}
