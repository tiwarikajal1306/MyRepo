package mall;

/**
 * Created by Kajal on 24-07-2017.
 */
public class MallApp extends Item {
    void print(){
        System.out.println("Welcome to mallapp");}

    public static void main(String[] args) {


        MallApp mallObj= new MallApp();
        mallObj.print();
        mallObj.display();

    }
}