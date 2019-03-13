package pl.scoreup.lab2.zad1;

public class Start {

	public static void main(String[] args) {
		QuadraticEquation qe = new QuadraticEquation(1, 2, 3);

		System.out.println("y = " + qe.getEquationResultForX(2));
	}
}
