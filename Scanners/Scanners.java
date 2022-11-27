import java.util.Scanner;

public class Scanners{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter Your Value : ");
        String userInput = reader.nextLine();
        System.out.println("Your Value is " + userInput);
        reader.close();
    }
}
