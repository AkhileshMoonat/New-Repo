import java.util.Scanner;

public class Pallindrome
{

public static void main(String args[])

 {

Scanner s=new Scanner(System.in);

System.out.println("Enter a number:");

int a=s.nextInt();
int r,rev,t;
rev=0;
t=a;
while(a>0)
 {
r=a%10;
rev=rev*10+r;
a=a/10;
 }

if(t==rev)

 {
    
System.out.println("Entered number is a Palindrome");

 }

else
 if(t!=rev)
 {
   
System.out.println("Entered number is not Palindrome");

 }

   }

      }