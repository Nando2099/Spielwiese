package OCA_GFN_Test_Simulation;



class Student {
    String name;
    int age;

    Student() {
        this("James", 25);         // so kann man den anderen Konstruktor aufrufen
        //Student("James", 25);    // <-  man kann den anderen Konstruktor aufrufen aber nicht so
    }

    Student(String name, int age) {  //diese Werte müssen vom 1. Konst. erwähnt werden
        this.name = name;
        this.age = age;
        
    }
}

public class Metodos4 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + ":" + s.age);
    }
}