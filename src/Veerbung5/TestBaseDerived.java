package Veerbung5;

class Base {
    protected void m1() {
        System.out.println("Base: m1()");
    }
}

class Derived extends Base {
    protected void m1() {	     // este metodo sobreescribe el metodo m1 en linea 4, tiene que ser 
    								// tambien protected como el metodo que se sobrescribe
        System.out.println("Derived: m1()");
    }
}

public class TestBaseDerived {
    public static void main(String[] args) {
        Base b = new Derived();
        b.m1();
    }
}