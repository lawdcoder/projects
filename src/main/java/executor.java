import java.io.IOException;
import java.util.Scanner;
import java.util.Date;

public class executor
{
    public executor()
    {
        // TODO Auto-generated constructor stub
    }
    public static void main(String args[]) throws IOException
    {
        String firstName;
        System.out.println("Please Enter Your First Name");
        Scanner first =new Scanner(System.in);
        firstName=first.next();
        String lastName;
        System.out.println("Please Enter Your Last Name");
        Scanner last =new Scanner(System.in);
        lastName=last.next();
        String Address;
        System.out.println("Please Enter Your Address");
        Scanner add =new Scanner(System.in);
        Address =add.next();

        Date now = new Date();
        Customerinfo cust = new Customerinfo(lastName,firstName,Address,now);
        Businesslogic log = new Businesslogic(firstName,lastName,Address,now);
        cust.welcomeMessage();
        System.out.printf("Hey\t"+ lastName +"\t"+ firstName+ "\n");
        log.cleaningCost();

    }


}