import java.util.Scanner;

public class Arithmatic{
    public static void main(String args[]){

        Scanner reader;
        int userInput1;
        int userInput2;
        int total;
        int difference;
        int multiplication;
        double devision;

        reader = new Scanner(System.in);

        System.out.print("Number 1 :");
        userInput1 = reader.nextInt();

        System.out.print("Number 2 :");
        userInput2 = reader.nextInt();

        total = userInput1 + userInput2;
        difference = userInput1 - userInput2;
        multiplication = userInput1 * userInput2;
        devision = (double)userInput1 / (double)userInput2;

        System.out.println("Total : " + total);
        System.out.println("Difference : " + difference);
        System.out.println("Multipication : " + multiplication);
        System.out.println("Devision : " + devision);

        reader.close();
        
    }
}
