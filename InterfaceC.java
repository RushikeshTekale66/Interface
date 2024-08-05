class InterfaceC{
	public static void main(String [] args){
		MathOperations m = new MathOperationsClass();
		System.out.println(m.add(10, 10));;
		System.out.println(m.sub(30, 20));
		System.out.println(m.mul(10, 10));
		System.out.println(m.div(10, 10));

	}
}

interface MathOperations {
	int add(int a, int b);
	int sub(int a, int b);
	int mul(int a, int b);
	double div(double a, double b);
}

class MathOperationsClass implements MathOperations{

	@Override
	public int add(int x, int y){
		int result = x+y;
		return result;
	}

	@Override
	public int sub(int x, int y){
		int result = x-y;
		return result;
	}

	@Override
	public int mul(int x, int y){
		int result = x*y;
		return result;
	}

	@Override
	public double div(double x, double y){
		double result = x/y;
		return result;
	}
}