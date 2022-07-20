import java.util.Scanner;

public class Clasi {
	
		 public static void main(String args[])
		    {
		        Scanner scanner = new Scanner(System.in);
		        
		        double num1,num2,num3=0;
		        System.out.println("Enter the first number :");
		        num1=scanner.nextDouble();
		        System.out.println("Enter the second numbers :");
		        num2=scanner.nextDouble();
		        
		        char operator;
		        System.out.println("Enter the operation Do you want ( + , - , * , / , % ) :");
		        operator=scanner.next().charAt(0);
		        
		        switch(operator)
		         {
		            
		             case '+' :
		             num3=num1+num2;
		             System.out.println("The Answer is \n " + num1 +" "+operator+" "+ num2 + " = " + num3);
		             break;
		             
		             case '-' :
		             num3=num1-num2;
		             System.out.println("The Answer is \n " + num1 +" "+operator+" "+ num2 + " = " + num3);
		             break;
		             
		             case '*' :
		             num3=num1*num2;
		             System.out.println("The Answer is \n " + num1 +" "+operator+" "+ num2 + " = " + num3);
		             break ;
		             
		             case '/' :
		             num3=num1/num2;
		             System.out.println("The Answer is \n " + num1 +" "+operator+" "+ num2 + " = " + num3);
		             break;
		             
		             case '%' :
		             num3=num1%num2;
		             System.out.println("The Answer is \n " + num1 +" "+operator+" "+ num2 + " = " + num3);
		             break;
		             
		             default :
		             System.out.println("Unknown operator");
		             break;
		         }
		         
		    }
		}


