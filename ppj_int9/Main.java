public class Main {
	public static void main (String argv[]) {
		Dzem [] dzemy = new Dzem [3];
		dzemy[0] = new Dzem("Truskawkowy");
		dzemy[1] = new Dzem("Morelowy", 50.0);
		dzemy[2] = new Dzem(200.0);

		Sloik[] sloiki = new Sloik[3];

		for(int i = 0; i < dzemy.length ; i++) {
			sloiki[i] = new Sloik(dzemy[i]);
			System.out.println("utworzono sloik");
		}
	}
}
