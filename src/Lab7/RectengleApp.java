package Lab7;

public class RectengleApp {

    public static void main(String[] args) {

        //create object
        Rectengle rec1 = new Rectengle();

        rec1.setLength(20.0);
        rec1.setWidth(10.0);

        System.out.println(rec1.getLength());
        System.out.println(rec1.getWidth());
        System.out.println(rec1.getArea());

        Rectengle rec2 = new Rectengle(10.0,5.0);

        System.out.println(rec2.getLength());
        System.out.println(rec2.getWidth());
        System.out.println(rec2.getArea());







    }//main
}//class
