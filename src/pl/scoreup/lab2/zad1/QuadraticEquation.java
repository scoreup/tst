package pl.scoreup.lab2.zad1;

public class QuadraticEquation {

	private int a;
	private int b;
	private int c;

	public QuadraticEquation(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}

	public int getEquationResultForX(int x) {
		int result = 0;

		result = x * x * this.a;
		result += x * this.b;
		result += this.c;
		
		return result;
	}
}
