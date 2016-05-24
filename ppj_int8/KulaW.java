public class KulaW {

	public double R;

	public KulaW(Walec walec) {
		double r = walec.getR();
		int h = walec.getH();

		if(r>(h/2))
			R = (h/2);
		else
			R = r;
		
	}

	public KulaW(Kwadrat kwadrat){
		R = (kwadrat.getBok()/2);	
	}
}
