import java.util.Scanner;

public class Leapyear

{

public static void main(String args[])

{

Scanner s=new Scanner(System.in);

System.out.println("Enter year:");

int a=s.nextInt();

if(a%4==0)

{
    
System.out.println("Entered year is a leap year");

}

else

{
   
System.out.println("Entered year is not leap year");

}

}

}