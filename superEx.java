class  superEx{
    public static void main(String [] args ){
        Electornics e = new Electornics(40000, 10, "Mi", "Note 10", "Mobile");
        e.displayElectronics();
    }
}

//Parent Class

class Flipcart{
    String productName;
    String category;
    
    public Flipcart(String productName, String category){
        this.productName = productName;
        this.category = category;
    }
    
    public void displayFlipcart(){
        System.out.println(productName);
        System.out.println(category);
    }
}

//Child Class

class Electornics extends Flipcart{
    int mrp;
    int discount;
    String brand;
    
    public Electornics(int mrp, int discount, String brand, String productName, String category){
	//super keyword
        super(productName, category);
        this.mrp = mrp;
        this.discount = discount;
        this.brand = brand;
    }
    
    public void displayElectronics(){
	//super() call
        super.displayFlipcart();
        System.out.println(mrp);
        System.out.println(discount);
        System.out.println(brand);
    }
}