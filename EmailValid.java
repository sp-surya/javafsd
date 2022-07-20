import java.util.Scanner;

public class EmailValid {
	   
		public static void main(String[] args)
			{
	       System.out.println("Enter the number of E-mail ID : ");
			Scanner scanner = new Scanner(System.in);
			
			int n = scanner.nextInt();
			String str[] = new String[n];
			
			System.out.println("Enter the "+n+" email ID");
			for(int i=0; i<n ; i++)
			{
				str[i] = scanner.next();
			}
			
			System.out.println("Enter E-mail ID Do you want to be searched : ") ;
			String search  = scanner.next();
			
			boolean flag = false ;
			
			for(int i=0; i<n ; i++)
			{
				if(search.equals(str[i]))
				{
				System.out.println("The E-mail id is found and palced at : ");
				System.out.println("E-mail ID palced at : "+(i+1));
				
			flag = true ;
				}
			}
		       if(!flag)
					System.out.println("E-mail ID is not there");
			}
			
		}


