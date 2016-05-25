import java.util.HashMap;
public class Fabryka {
	private static HashMap<Integer,Cukierek> myMap = new<Integer,Cukierek> HashMap();
	public static Cukierek make(int a) {
		if(!myMap.containsKey(a))
			myMap.put(a, new Cukierek("No data", 0));
		
		return myMap.get(a);
	}
}
