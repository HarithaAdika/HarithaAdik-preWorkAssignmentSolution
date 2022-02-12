
import java.util.Scanner;

public class Main { 

Scanner sc = new Scanner(System.in);

           //function to checkPalindrome

       public void checkPalindrome()  {
    	   int rev,sum=0,temp;
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("Enter the number to check if it is palindrome:");
    	   int num1 = sc.nextInt();
    	   temp=num1;
    	   while(num1>0) {
    		   rev=num1%10;
    		   sum=(sum*10)+rev;
    		   num1=num1/10;
    	   }
    	   if(temp==sum)
    		   System.out.println("Given number is a palindrome number");
    	   else
    		   System.out.println("Given number is not a palindrome number");

      } 

            //function to printPattern

       public void printPattern() {
    	   
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("Enter the number to print the pattern N-times:");
    	   int n = sc.nextInt();
    	   for(int i=0;i<n;i++) {
    		   for(int j=n;j>i;j--) {
    			   System.out.print("*");
    		   }
    		   System.out.println("\n");
    	   }

      } 

          //function to check no is prime or not

        public void checkPrimeNumber() {
        	Scanner sc = new Scanner(System.in);
     	    System.out.println("Enter the number to check if it is a prime number or not:");
     	    int n = sc.nextInt();
     	    int i,m=0,flag=0;      
     	    m=n/2;      
     	    if(n==0||n==1){  
     	     System.out.println(n+" is not prime number");      
     	    }
     	    else{  
     	     for(i=2;i<=m;i++){      
     	      if(n%i==0){      
     	       System.out.println(n+" is not prime number");      
     	       flag=1;      
     	       break;      
     	      }      
     	     }      
     	    if(flag==0)  { System.out.println(n+" is prime number"); }  
     	   }

        }      

          // function to print Fibonacci Series

          public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.

           int first = 0, second = 1;
           int third,i,count;    
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number to print fibinocci series:");
           count=sc.nextInt();
           System.out.print(first+" "+second);//printing 0 and 1    
              
           for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
           {    
            third=first+second;    
            System.out.print(" "+third);    
            first=second;    
            second=third;    
           }    
           
          }

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("\nEnter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

} 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}


