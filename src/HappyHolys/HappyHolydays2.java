package HappyHolys;

class Message2 {
    String msg = "Happy New Year!";

    public void print() {
        System.out.println(msg);
    }
}

public class HappyHolydays2 {
    public static void change(Message2 m) {
        
    	m.msg = "Happy Holidays!";
    }

    public static void main(String[] args) {
        Message2 obj = new Message2();
        obj.print();
        change(obj);
        obj.print();
    }
}