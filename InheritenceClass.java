//welcame to aur program we start by class A
class A {
    void AB() {
        System.out.println("method (AB)");
    }
}

// Class B extends Class A
class B extends A {
    public void BA() {
        System.out.println("Method (BA)");
    }
}

class C extends B {
   public void CB () {
        System.out.println("Method (CB) ");
    }
}
class D extends C {
    public void DC() {
        System.out.println("Method (DC) ");
    }
}

public class InheritenceClass  {
    public static void main(String[] args) {
        D dD = new D();
        dD.AB(); 
        dD.BA(); 
        dD.CB(); 
        dD.DC(); 
    System.out.println("thanks for running Inheritence in our program, hope you got more understanding about types of INheritence");
    }
}
