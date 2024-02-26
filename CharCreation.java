import java.util.*;

public class CharCreation 
{
    private String charName;
    private String chosenJobClass; 

    private void inputName()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input name: ");
        String name;
        
        name = scan.nextLine(); 

        if(name.length() > 25)
        {
            charName = name;
            charName = name.substring(0,25);
            System.out.println("Your name is: " + charName);
        }

        else if(name.length() < 1)
        {
            System.out.println("You should input at least 1 character\n");
        }

        else
        {
            charName = name;
            System.out.println("Your name is: " + charName);
        }

    }

    public void displayCreation()
    {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        
        char cInput;

        do
        {
            System.out.println("Create a Character\n\n");
            System.out.println("[1] Input Name: " + charName);
            System.out.println("\n[2] Select Job Class\n");
            System.out.println("[3] Confirm\n");
            System.out.println("[4] Back\n\n");

            System.out.println("Enter number: ");
            cInput = sc.next().charAt(0);
            
            switch(cInput)
            {
                case '1':
                inputName();
                break;
            
                case '2':
                System.out.println("Select Job Class: ");
                break;

                case '3':
                System.out.println("DAPAT NEXT NETO IS GAME LOBBY");
                break;
            
                case '4':
              //  Title titleScreen = new Title();
              //  titleScreen.displayTitle();
              main.main(new String[0]);
                break;

                default:
                System.out.println("Invalid input!\n\n");
            }

        } while (cInput !='3' && cInput !='4');

    }
}
