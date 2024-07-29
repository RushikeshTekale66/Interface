class InterfaceC{
	public static void main(String [] args){
		MathOP m = new MathOperation();
		m.addition(10, 10);
		m.substraction(20, 10);
	}
}

interface MathOP{
	void addition(int a, int b);
	void substraction(int x, int y);
}

class MathOperation implements MathOP{
	
	public void addition(int a, int b){
		System.out.println("Addition is : " + (a+b));
	}
	public void substraction(int x, int y){
		System.out.println("Substraction : "+ (x-y));
	}
}

