import java.util.*;

public class Main {
    public static void main (String args[])
    {
        Title titleScreen = new Title ();
        CharCreation charCreate = new CharCreation ();

        titleScreen.displayTitle();

        Scanner sc = new Scanner(System.in);
        int nInput;

        do{
            System.out.println("Enter Number: ");
            nInput = sc.nextInt();

            if (nInput == 1)
            {
                charCreate.displayCreation();
            }
    
            else if (nInput == 2)
            {
                System.out.println("Thank you for playing!\n\n");
            }
    
        } while (nInput > 2 || nInput <= 0);

        sc.close();
    }

}