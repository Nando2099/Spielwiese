package tests;

public class Robots {

	public static void main(String[] args) {
		
															//**********************************Neue Klasse Robot******************************
															// ab hier wird die Klasse Robot reklariert	mit 
															//Instanz-Variablen bzw Atributten name,color und weight. Es sind die Instanzen des Objektes r1 zum B.
		
		
		class Robot {
			String name;
			String color;
			int weight;
			
			
			
															//Constructor der Klasse Robot. Argumente sind n,c und w.
			Robot(String n, String c, int w){
				
				this.name = n;
				this.color = c;
				this.weight = w;
				
				}
															// Methode introduceSelf() wird erstellt
			void introduceSelf() {
				System.out.println(
					"My name is " + this.name);
				}
			} 												//  ****************** Ende Klasse Robot ****************************
		
															// hier werden zwei Objekte der Klasse Robot instanziiert 
		Robot r1 =
				new Robot("Tom", "red", 30 );
		Robot r2 =
				new Robot("Jerry", "Blue", 40);
	
															//hier wird die Methode introduceSelf() von beiden Robotern aufgerufen
	
		r1.introduceSelf();
		r2.introduceSelf();

	
	
	
															//	*******************************Neue Klasse Person******************************
		class Person {
			String name;
			String personality;
			boolean isSitting;
			Robot robotOwned; // besitzt einen Roboter
		
		
															//ab hier der "Constructor" Person. Argumente sind n,c und w.
			Person(String n, String p, boolean i){
			
				this.name = n;
				this.personality = p;
				this.isSitting = i;
			
			
			}
															//Methode sitDown() wird erstellt
			void sitDown() {
				this.isSitting = true;}
			void standUp() {
				this.isSitting = false;}

		}													//  ************************** hier endet die Klasse Person ***********************

															// hier werden 2 Objekte der Klasse Person erstellt
		Person p1 = new Person("Alice","nice",false);
		Person p2 = new Person("Becky","talkative",true);
		
		
															//hier wird der atributte robotOwned mit dem Objekt Roboter "verbunden" 
		p1.robotOwned = r1;
		p2.robotOwned = r2;
		 
															//hier wird der Atributte robotOwned der Person 1 an die Methode introduceSelf() geschickt, 
															//da der Atributte der p1 mit dem Roboter r1 verbunden ist wird My Name is Tom ausgegeben
		p1.robotOwned.introduceSelf();
	}
}


//
// Otra forma de crear objetos de la clase robot es sin constructor:
//
// Robot r1 = new Robot();
// r1.name = "Tom";
// r1.color = "Red";
// r1.weight = "30";
// 
// Robot r2 = new Robot();
// r2.name = "Jerry";
// r2.color = "Blue";
// r2.weight = 40;
