import static java.lang.System.out;
import java.util.Scanner;

public class ThankYouLetters
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean keepGoing = true;
        String donorName;
        int donationAmount;
        

        out.println("-- Thank You Letters--");
        while (keepGoing) 
        {
            out.println("What is your Name? ");
            donorName = keyboard.next();
            out.println("How much was donated?");
            donationAmount = keyboard.nextInt();
            out.println("\n");
            if (donorName.equals("quit"))
            {
                keepGoing = false;
            }
            else
            {
                out.println("Dear "+ donorName + ","); 
                out.print("\n");
                out.println("Thank you for your donation! We rely on donors like you to keep our"); 
                out.println("organization effective, and you came through for us. Your donation of " + "$" + donationAmount);
                out.println("will help our efforts to make a difference in the world.");
                out.print("\n");
                out.println("As you may know, we are a registered non-profit organization, so your");
                out.println("donation is tax deductible. You may use this letter as a receipt for tax. ");
                out.println("purposes.");
                out.print("\n");
                out.println("Thank you for again for your support! ");
                out.print("\n");
                out.println("Sincerely,");
                out.println("Paula Jones");
                out.println("YourCharity.org");
            }
            
        }
    }
}
