package tests;


		
	 class GuessGame{ 						//el objeto GAME recibe tres *instances variables* (tres players)
			Player p1;
			Player p2;
			Player p3;
		
		    public void startGame() {		// 3.- aqui GAME con sus 3 instancias llama a la funcion Player, 
			
			p1 = new Player();				// 4.- aqui los 3 isntancias reciben el atributo vacio  "number"
			p2 = new Player();				// del metodo Player()
			p3 = new Player();
			
			int guessp1 = 0;
			int guessp2 = 0;
			int guessp3 = 0;
			
			boolean p1isRight = false;
			boolean p2isRight = false;
			boolean p3isRight = false;
			
			int targetNumber = (int) (Math.random()*10);                       // 5.- numero random se crea y vacia en targetNumber
			System.out.println("Im Thinking of a number between 0 and 9...");
			
			while(true) {
				System.out.println("The number to guess is " + targetNumber);
				
				p1.guess();														// 6.- aqui los players llaman a guess(), reciben un numero random en su "number"
				p2.guess();														//     e imprimen ese  numero (p1.number)
				p3.guess();
				
				guessp1 = p1.number;											// 7.- aqui se convierte p1.number (numero adivinado) en una variable ("guessp1")
				System.out.println("Player one guessed " + guessp1);
				
				guessp2 = p2.number;
				System.out.println("Player one guessed " + guessp2);
				
				guessp3 = p3.number;
				System.out.println("Player one guessed " + guessp3);
				
				if (guessp1 == targetNumber) {									// 8.- aqui se comparaa el numero adivinado por el random de la maquina
					p1isRight = true;
				}
				
				if (guessp2 == targetNumber) {
					p2isRight = true;
				}
				
				if (guessp3 == targetNumber) {
					p3isRight = true;
				}
				
				if (p1isRight || p2isRight || p3isRight) { //9.- OR OR OR, si no, tienen que jugar de nuevo (linea 64)
					
					System.out.println("We have a winner!");
					System.out.println("Player one got it right? " + p1isRight);
					System.out.println("Player two got it right? " + p2isRight);
					System.out.println("Player three got it right? " + p3isRight);
					System.out.println("Game is Over.");
					break;
				} else {
					System.out.println("Players will have to try again.");
				}
			}
		}
	}

	
	class Player{
		int number = 0; //where the guess goes
		
		public void guess() {
			number = (int)(Math.random()*10);
			System.out.println("Im Guessing " + number);
		}
	}


	public class GameLauncher {

		public static void main(String[] args) {
		
		GuessGame game = new GuessGame(); // 1.- aqui se inicia un objeto nuevo "GAME" de la clase "GuessGame". El objeto tiene 3 atributos (3 players) 
		game.startGame();					//2.-  aqui el objeto GAME llama a la funcion "startGame()"
		
		
		
		
	}
}
