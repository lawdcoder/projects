import java.util.InputMismatchException;
import java .util.Scanner;
import java.util.Date;
public class Customerinfo
{
    private String custfName;
    private String custlName;
    private String custAddress;
    private Date date;
    Customerinfo( String lname, String fname, String address, Date day )
    {
        this.custfName=fname;
        this.custlName=lname;
        this.custAddress=address;
        this.date=day;
    }

    public String getcustAdress()

    {
        return custAddress;
    }
    public void setdate(Date date)
    {
        this.date=date;
    }
    public Date getdate()
    {
        return date;
    }

    public void welcomeMessage()
    {
        System.out.println("Please, Type GO on the keyboard to begin");
        Scanner input= new Scanner(System.in);
        String message = input.next("Go");
        try {
            if (message == "Go")
                System.out.println("You are welcome to Project One Laundry Service ");
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Invalid entry, please, restart the process again");
        }

    }


}

