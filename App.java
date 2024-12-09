import java.util.Scanner;
//SIMPLE TERMINAL CALCULATOR APP ON JAVA
public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("1)Mul");
        System.out.println("2)Div");
        System.out.println("3)Add");
        System.out.println("4)Sub");

        System.out.println("Please enter your choice:");
        int choice = scanner.nextInt();

        switch(choice)
        {
            //mul case
            case 1:
            mul();
            break;

             //Div case
            case 2:
             div();
            break;

             //Add case
            case 3:
             add();
            break;

             //Sub case
            case 4:
            sub();
            break;

            default:
            System.out.println("Wrong input");
            break;
        }
        scanner.close();
    }
    //-------------------------------------------------------Add
    static void add()
    {
        Scanner scanner = new Scanner(System.in);

        try{
        System.out.println("Enter your first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter your second number: ");
        double num2 = scanner.nextDouble();

        double res = num1+num2;
        System.out.println("Your number is: "+res);
        }
        finally 
        {
            scanner.close();
        }
    }
    //-------------------------------------------------------Div
    static void div()
    {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter your first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter your second number: ");
            double num2 = scanner.nextDouble();

            double res = num1/num2;
            System.out.println("Your number is: "+res);
        }
        finally
        {
            scanner.close();
        }
    }
    //-------------------------------------------------------Mul
    static void mul()
    {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter your first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter your second number: ");
            double num2 = scanner.nextDouble();

            double res = num1*num2;
            System.out.println("Your number is: "+res);
        }
        finally
        {
            scanner.close();
        }
    }
    //-------------------------------------------------------Sub
    static void sub()
    {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter your first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter your second number: ");
            double num2 = scanner.nextDouble();

            double res = num1-num2;
            System.out.println("Your number is: "+res);
        }
        finally
        {
            scanner.close();
        }
    }
}