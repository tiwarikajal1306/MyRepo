package classPracticals;


import java.util.Scanner;
public class Unification {
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of predicate: ");
        int predicate = sc.nextInt();
        int previousArgs = 0;
        for(int p=0; p<predicate; p++){
            System.out.println("Enter number of Arguments: ");
            int temp = sc.nextInt();
            if(p!=0 && temp!=previousArgs)
            {
                System.out.println("Invalid number of arguments...");
                return;
            }
            previousArgs=temp;
        }
        char variableList[][]= new char[predicate][previousArgs];
        for(int i=0; i<predicate;i++){
            System.out.println("Enter the Arguments for "+(i+1));
            for(int j=0;j<previousArgs;j++){
                System.out.println("Enter "+(j+1)+ "Argument:");
                variableList[i][j] = sc.next().charAt(0);

            }
        }
        boolean hasSet = false;
        for(int i= 0; i<previousArgs; i++){
            for(int j=0; j<predicate; j++){
                if(variableList[j][i]>65){
                    hasSet = true;
                    break;
                }
            }
            if(!hasSet){
                System.out.println("Unification failed...");
                return;
            }
            hasSet=false;
        }
        System.out.println("Unification passed...");
    }

}
