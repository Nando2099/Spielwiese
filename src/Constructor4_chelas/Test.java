package Constructor4_chelas;



public class Test {
    public static void main(String[] args) {
        fiesta fiesta1 = new fiesta(5,"chapita");
        fiesta fiesta2 = new fiesta(4, "chapa");
       
        fiesta1.abreChelas(); 						// PUEDO LLAMAR CON EL OBJETO EL METODO ASI
        fiesta1.abreChelas();
        fiesta1.queTipoDeChapa();
        
        fiesta2.abreChelas(); 
        fiesta2.abreChelas();
        fiesta2.queTipoDeChapa();

    }
 }

 class fiesta {

    int chelas;
    String chapitas;

     public void comprarChelas (){
         System.out.println("anda y compra " + chelas + " chelas");
     }

     public void abreChelas(){
         System.out.println("Porfa abre " + (chelas-3) );
     }
     
     public void queTipoDeChapa() {
    	 System.out.println(chapitas);
     }
     
     

     public fiesta(int chelas, String tapa) {             //   O AUTOMATICAMENTE CADA VEZ QUE CREO UN OBJETO PASO EL VALOR 				
         this.chelas = chelas;							// DEL OBJETO AL CONSTRUCTOR Y LLAMO LOS METODOS DESDE EL, LOS METODOS
         this.chapitas = tapa;							// SE INICIAN CON EL VALOR DE CADA OBJETO CREADO
         
         comprarChelas();  // <---  SE LLAMAN AUTOMATICAMENTE CADA VEZ QUE SE CREA UN OBJETO
         abreChelas();
         queTipoDeChapa();
     }
 }