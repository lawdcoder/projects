

import java.util.HashMap;
import java.util.Map;
import java .util.Scanner;
import java.util.Date;


public class Businesslogic
{
    String fname;
    String lname;
    String addr;
    Date todate;
    public Businesslogic(String lname, String fname, String addr, Date today)
    {
        fname=fname;
        lname=lname;
        addr = addr;
        todate=today;
    }
    public void cleaningCost() throws NullPointerException
    {
        String anyKey1;
        /* int total=0; */
        int totalCost=0;
        System.out.println("Welcome to Sparkles Dry Cleaning Service\n" + "Press Any Key to Begin");
        Scanner anyKey = new Scanner(System.in);
            anyKey.nextLine();

        System.out.println("Please enter the total Number of items you want to dryclean today");
        Scanner num = new Scanner(System.in);
        int itemNum = num.nextInt();
        do
        {
            System.out.println("Select your the clothing type for drycleaning from the option\n"+"by pressing the number Associated with each");

            Map<Integer, String> mapping = new HashMap<>();
            mapping.put(1, "Pant Suits");
            mapping.put(2, "Male Shirt");
            mapping.put(3, "Ladies Suit");

            mapping.put(4, "Ladies Blouse");
            for (Map.Entry<Integer, String> entry : mapping.entrySet())
            {
                Integer key = entry.getKey();
                String value = entry.getValue();
                System.out.println("PRESS" +" " + key +" " + "For" + " " + value);
            }
            int choice;

            Scanner laundryChoice =
                    new Scanner(System.in);
            choice=anyKey.nextInt();
            System.out.println("Enter the quantity for the selected item");
            int eachQuantity;

            eachQuantity = laundryChoice.nextInt();
            int total = 0;
            if (choice == 1) total = eachQuantity * 20;
            else if (choice == 2) 
            {
                total = eachQuantity * 15;
            } 
            else if (choice == 3) {

                total = eachQuantity * 10;
            } else if (choice == 4) {
                total = eachQuantity * 12;
            }
            totalCost = total+total;
            itemNum--;
        }
        while(itemNum >=1 );
        System.out.printf("Your Total Payment Due is\t\n" + totalCost);
    }



}