import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class FixBuging {

	
	    public static void main(String[] args) {
	        
	      
	        System.out.println(":::::::::::::::::::::::::::Welcome ::::::::::::::::::::::::\n");
	        
	        ListofOperation();

	    }
	    private static void ListofOperation() {
	        String[] arr = {"1. Review expenditure",
	                "2. Add my expenditure",
	                "3. Delete my expenditure",
	                "4. Sort the expenditures",
	                "5. Search for a particular expenditure",
	                "6. Close App"
	        };
	        int[] array = {1,2,3,4,5,6};
	        int  length = array.length;
	        for(int i=0; i<length;i++){
	            System.out.println(arr[i]);
	            // display the all the Strings mentioned in the String array
	        }
	        ArrayList<Integer> arrlist = new ArrayList<Integer>();
	        ArrayList<Integer> expenses = new ArrayList<Integer>();
	        expenses.add(3000);
	        expenses.add(4500);
	        expenses.add(5500);
	        expenses.add(6000);
	        expenses.add(7000);
	        expenses.addAll(arrlist);
	        System.out.println("\nEnter your choice:");
	       Scanner sc = new Scanner(System.in);
			int  choice =  sc.nextInt();
	        for(int j=1;j<=length;j++){
	            if(choice==j){
	                switch (choice){
	                    case 1:
	                        System.out.println("Your saved expenses : \n");
	                        System.out.println(expenses+"\n");
	                        ListofOperation();
	                        break;
	                    case 2:
	                        System.out.println("Enter the value to add your Expense: \n");
	                        int value = sc.nextInt();
	                        expenses.add(value);
	                        System.out.println("Updated value\n");
	                        expenses.addAll(arrlist);
	                        System.out.println(expenses+"\n");
	                        ListofOperation();

	                        break;
	                    case 3:
	                        System.out.println("You are about the delete all your expenses! \nConfirm again by selecting the same option...\n");
	                        int con_choice = sc.nextInt();
	                        if(con_choice==choice){
	                               expenses.clear();
	                            System.out.println(expenses+"\n");
	                            System.out.println("All your expenses are erased!\n");
	                        } else {
	                            System.out.println("Oops... try again!");
	                        }
	                        ListofOperation();
	                        break;
	                    case 4:
	                        sortExpenses(expenses);
	                        ListofOperation();
	                        break;
	                    case 5:
	                        searchExpenses(expenses);
	                        ListofOperation();
	                        break;
	                    case 6:
	                        closeApp();
	                        sc.close();
	                        break;
	                    default:
	                        System.out.println("Invalid choice!");
	                        break;
	                }
	            }
	        }
	        
	    }
		
	       
	    private static void closeApp() {
	        System.out.println("Closing Application... \nThank you!");
	          
	    }
	    private static void searchExpenses(ArrayList<Integer> arrayList) {
	        
	    	 System.out.println("Enter the expense you need to search:\t");
		        //Complete the method
		        
		        Scanner sc=new Scanner(System.in);
		        int key=sc.nextInt();
		       
		        int leng = arrayList.size();
		        int[] arr=new int[leng];
		        int n=arr.length;
		        for(int i=0;i<n;i++) {
		        	arr[i]=arrayList.get(i);
		        }
		        if(linearsearch(arr,key)== -1) {
		        	System.out.println(key+" is not present\n ");
		        }
		        else
		        	System.out.println(key+" is found at index: "+linearsearch(arr,key)+"\n"); 
		       
		       
	}     
	    
	    public static int linearsearch(int arr[],int key) {
			
		    for(int j=0; j<arr.length;j++) {
		    	if(key==arr[j]) {
		    		return j;
		    	}
		    }
			return -1;
			
			
		}
	   
	    
	    private static void sortExpenses(ArrayList<Integer> arrayList) {
	    	  int arrlength =  arrayList.size();
		       //Complete the method. The expenses should be sorted in ascending order.
		        
		     
		        int[] a=new int[arrlength];
		        int n=a.length;
		        for(int i=0;i<n;i++) {
		        	a[i]=arrayList.get(i);
		        }
		        for(int i=0;i<n;i++) {
		        	for(int j=i+1;j<n;j++) {
		        		if(a[j]<a[i]) {
		        			int temp=a[i];
		        			a[i]=a[j];
		        			a[j]=temp;
		        		}
		        	}
		        }
		        System.out.println(Arrays.toString(a));
		        System.out.println("\n");   
	    
	}
	}

