import java.util.Scanner;

public class prime
{

public static void main(String args[])

 {

Scanner s=new Scanner(System.in);

System.out.println("Enter a number:");

int a=s.nextInt();
int i,f=0;
if(a==1 || a==0)
{
f=1;
}
for(i=2;i<=a/2;i++)
{ 
  if(a%i==0)
   {
   f=1;
break;
   }
 }

if(f==0)

 {
    
System.out.println("Entered number is a Prime number");

 }

else
 {
   
System.out.println("Entered number is not a Prime number");

 }

   }

      }