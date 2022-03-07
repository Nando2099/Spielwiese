package Constructor3;


public class Person {    				// CLASE

    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age) {     //CONSTRUCTOR
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }

    public void printPerson() {
        System.out.println(this.name + " is " + this.age + " years old");
    }

    public void growOlder() {
        this.age++;
    }

    public void isAdult() {   // war return type boolean
        if (this.age < 18) {
            //return false;
            System.out.println("Is underage");
        }else

        //return true;
        	System.out.println("Is adult");
    }

    public double bodyMassIndex() {
        double heightInMeters = this.height / 100.0;

        return this.weight / (heightInMeters * heightInMeters);
    }

    public String toString() {
        return this.name + " is " + this.age + " years old, their BMI is " + this.bodyMassIndex();
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }
}