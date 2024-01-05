//The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

interface Bank {
    public void interest();
}

class SBI implements Bank{
    public void interest(){
        System.out.println("SBI interest");
    }
}

class YesBank implements Bank{
    public void interest(){
        System.out.println("Yes back interest");
    }
}

class interfacejava{
    public static void main(String [] args){
            Bank bk = new SBI();
            bk.interest();
    }
}