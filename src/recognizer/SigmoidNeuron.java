package recognizer;
import recognizer.interfaces.Neuron;

public class SigmoidNeuron implements Neuron {
	private double[] weights;
	private double[] inputs;
	private double bias;
	
	public SigmoidNeuron(double[] weight, double[] input, double bias) {
		this.weights = weight;
		this.inputs = input;
		this.bias = bias;
	}
	
	public double output() {
		double z=0;
		for(int i=0;i<weights.length;i++) { //adding all the weights and inputs
			z+=(weights[i]*inputs[i]);
		}
		z += bias; //adding bias
		double result  = 1/(1+Math.exp(z));
		return result;
	}
}
