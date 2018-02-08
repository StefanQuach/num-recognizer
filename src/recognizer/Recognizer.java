package recognizer;

import recognizer.interfaces.Neuron;

public class Recognizer {
	private Neuron[] inputs;
	private Neuron[] first;
	private Neuron[] second;
	private Neuron[] output;
	
	public Recognizer() {
		inputs = new InputNeuron[28*28]; //inputs are 28x28 greyscale images
		first = new SigmoidNeuron[16];	//first layer of 16 neurons
		second = new SigmoidNeuron[16]; //second layer of 16 neurons
		output = new SigmoidNeuron[11]; // 11 outputs, [0->9, null]
		
		//TODO initialize all the weights and biases for every neuron to a random value
	}
}
