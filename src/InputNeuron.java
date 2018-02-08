import recognizer.interfaces.Neuron;

public class InputNeuron implements Neuron {
	private double value;
	public InputNeuron(double input) {
		value = input;
	}
	
	public double output() {
		return value;
	}

}
