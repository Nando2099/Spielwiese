package Veerbung7;

class Animal {
    protected void jump() {
        System.out.println("Animal");
    }
}

class Cat extends Animal {
    public void jump(int a) {
        System.out.println("Cat");
    }
}

class Deer extends Animal {
    public void jump() {
        System.out.println("Deer");
    }
}

public class Circus {
    public static void main(String[] args) {
        
    /* ANIMAL type, tienen acceso SOLO a met de Animal, si hay uno igual en si mismo, este sobrescribe ANIMAL*/
    	
    	Animal cat = new Cat();
        Animal deer = new Deer();
        cat.jump();					//cat solo tiene acceso a junp() de "ANIMAL" (no a jump(i)!)
        deer.jump();				// deer tiene acceso a jump(); de "ANIMAL", pero SU metodo jump() overrides!
       
        System.out.println("***********");
        
        
    /* CAT/DEER type, tienen acceso a met de Animal, si este es diferente a los que el obj tiene,
     * aparte tienen tambien acceso a su propio metodo*/     
        
        Cat cat2 = new Cat();
        Deer deer2 = new Deer();
        cat2.jump();				//cat2 tiene acceso a Jump() de "ANIMAL"
        cat2.jump(1);				//cat2 tiene acceso a Jump(int) de SI MISMO
        
        deer2.jump();				//deer2 tiene acceso a Jump() de SI MISMO
        
        
    }
}