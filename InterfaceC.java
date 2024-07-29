class MultipleInheritance{
	public static void main(String [] args){
		//Father referance so call father
		Father f = new Child();
		f.behaviour();
		
		//Mother referance so call mother
		Mother m = new Child();
		m.behaviour();

		//Child referance so don't know which one is called
		Child c = new Child();
		c.behaviour();
	}
}

interface Father{
	void behaviour();	
}

interface Mother{
	void behaviour();
}

class Child implements Father, Mother{
	@Override
	public void behaviour(){
		System.out.println("Angry bird");
	}
}