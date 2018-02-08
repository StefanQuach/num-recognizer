package recognizer;

public class Recognizer {
	private double[] sizes;
	private double[] biases;
	private double[] weights;
	
	public Recognizer(double[] sizes) {
		//initializing to random values
	}
	
	public double[] output() {
		//FIXME stub
		return null;
	}
	public static double[] randArray(int length) {
		double[] rand = new double[length];
		for (int i=0; i<length; i++) {
			rand[i]=Math.random();
		}
		return rand;
	}
}
