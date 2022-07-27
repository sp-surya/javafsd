import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LongestNumber {

	public static void main(String[] args) {

				Scanner sc=new Scanner(System.in);
				System.out.println("How many number do you want store in Array : ");
				int n=sc.nextInt();
				
				System.out.println("Enter Array input numbers : ");
				int arr[]=new int[n];
				
				for(int i=0;i<n;i++) {
				//array[i]=random.nextInt(100);
					arr[i] = sc.nextInt();
				   }
				
				ArrayList<Integer> list = new ArrayList<Integer>();
				ArrayList<Integer> longest = new ArrayList<Integer>();
				
				int currentHigh;
				int LongestCount = 0;
				
				for(int i = 0; i < arr.length;i++)
				{
					currentHigh = Integer.MIN_VALUE;
					for(int j = i;j < arr.length; j++)
					{
						if(arr[j] > currentHigh)
						{
							list.add(arr[j]);
							currentHigh = arr[j];
						}
					}
					
					
					
					if(LongestCount < list.size())
					{
						LongestCount = list.size();
						longest = new ArrayList<Integer>(list);
					}
					list.clear();
				}
				System.out.println();
				
				//Print list
				Iterator<Integer> itr = longest.iterator();
				System.out.println("The Longest increasing Subsequence is : ");
				
				while(itr.hasNext())
				{
					System.out.print(itr.next() + " ");
				}
				
				System.out.println();
				
				System.out.println("Length of Longest Increasing Subsequence : " + LongestCount);
			}
			
		
	}


