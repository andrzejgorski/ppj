import java.util.ArrayList;
public class Magazyn {
	private ArrayList<Kontener> stos = new<Kontener> ArrayList(5);
	public Kontener wydajKontener() {
		return stos.get(stos.size() - 1);
	}
	public void przyjmijKontener(Kontener kontener) {
		stos.add(kontener);
	}
}
