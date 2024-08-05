class InterfaceC {
	public static void main(String[] args) {
		MathOperations m = new MathOperationsClass(20, 10);
		m.add();
		m.sub();
		m.mul();
		m.div();

	}
}

interface MathOperations {
	void add();
	void sub();
	void mul();
	void div();
}

class Values{
	int a;
	int b;

	public Values(int a, int b){
		this.a = a;
		this.b = b;
	}
}

class MathOperationsClass extends Values implements MathOperations {

	public MathOperationsClass(int a, int b) {
		super(a, b);
	}

	@Override
	public void add() {
		int result = a + b;
		System.out.println(result);
	}

	@Override
	public void sub() {
		int result = a - b;
		System.out.println(result);
	}

	@Override
	public void mul() {
		int result = a * b;
		System.out.println(result);
	}

	@Override
	public void div() {
		double result = a / b;
		System.out.println(result);
	}
}