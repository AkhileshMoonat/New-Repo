import java.util.Scanner;

public class Greatest

{

public static void main(String args[])

{

Scanner s=new Scanner(System.in);

System.out.println("Enter first number:");

double a=s.nextDouble();

System.out.println("Enter second number:");

double b=s.nextDouble();

System.out.println("Enter third number:");

double c=s.nextDouble();

System.out.println("Biggest out of three numbers is:");

if(a>b && a>c)

{
    
System.out.println(a);

}

else if(b>a && b>c)

{
   
System.out.println(b);

}

else if(c>a && c>b)

{
    
System.out.println(c);

}

else if(a==b && b==c)

{

    System.out.println(a);

}

}

}