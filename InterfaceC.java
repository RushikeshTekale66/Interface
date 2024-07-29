class InterfaceC{
	public static void main(String [] args){
		Shape r = new Rectangle(10 , 10);
		r.Area();
		r.Perimeter();
	
		Shape s  = new Square(10);
		s.Area();
		s.Perimeter();

		Shape t = new Triangle(10, 10, 10, 10);	
		t.Area();
		t.Perimeter();

		Shape c = new Circle(10);
		c.Area();
		c.Perimeter();
	}
}

interface Shape{
	void Area();
	void Perimeter();
}

class Rectangle implements Shape{
	int l;
	int w;

	public Rectangle(int l, int w){
		this.l = l;
		this.w = w;
	}
	public void Area(){
		int area = l*w;
		System.out.println("Area of Rectangle : " + area);
	}
	public void Perimeter(){
		int perimeter = (2*l) + (2*w);
		System.out.println("Perimeter of Reactangle : " + perimeter);
	}
}

class Square implements Shape{
	int s;
	
	public Square(int s){
		this.s = s;
	}
	public void Area(){
		int area = s*s;
		System.out.println("Area of Square : "+area);
	}
	public void Perimeter(){
		int perimeter = 4*s;
		System.out.println("Perimeter of Square : " + perimeter);
	}
}

class Triangle implements Shape{
	double a;
	double b;
	double c;
	double h;
	
	public Triangle(double a, double b, double c, double h){
		this.a = a;
		this.b = b;
		this.c = c;
		this.h = h;
	}
	public void Area(){
		double area = 0.5*b*h;
		System.out.println("Area of Triangle : " + area);
	}
	public void Perimeter(){
		double perimeter = a+b+c;
		System.out.println("Perimeter of Triangle : "+ perimeter);
	}

}

class Circle implements Shape{
	double r;
	
	public Circle(double r){
		this.r = r;
	}
	public void Area(){
		double area = (int)3.14*r*r;
		System.out.println("Area of circle : " + area);
	}
	public void Perimeter(){
		double perimeter = 2*3.14*r;
		System.out.println("Perimeter of circle : " + perimeter);
	}
}