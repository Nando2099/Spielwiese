package Read_Files_Aufgabe27_3_nando;

public class Test {
    public static void main(String[] args) {
        fiesta fiesta1 = new fiesta(5);


    }
 }

 class fiesta {

    int chelas;

     public void comprarChelas (){
         System.out.println("Handa y compra " + chelas + " chelas");
     }

     public void abreChelas(){
         System.out.println("Porfa abre " + (chelas-3) );
     }

     public fiesta(int chelas) {
         this.chelas = chelas;
         comprarChelas();
         abreChelas();
     }
 }