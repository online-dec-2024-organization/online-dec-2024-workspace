package lambda;

public class Addition implements Operation{

	@Override
	public int operate(int num1, int num2) {
		return num1 + num2;
	}

}
