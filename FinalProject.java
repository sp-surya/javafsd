import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
	
public class FinalProject {



		public static void main(String[] args) {
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
			System.out.println("\t         SP InfoTech pvt.Ltd \n");
	        System.out.println("\t         Welcome to the App \n");
	        System.out.println("\t      Designed by Suryaprakash P\n");
	        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n");
	        OperationSelection();
		}
		private static void OperationSelection() {
			String[] array1 = {":::: 1. Retrieving the file names ::::",
	                        ":::: 2. Business-level operations ::::",
	                        ":::: 3. Close the App ::::"
	                       };
			int[] sample1= {1, 2, 3};
	        int length1 = sample1.length;
	        for(int i=0; i<length1;i++){
	            System.out.println(array1[i]);
	        }
	        System.out.println("\nEnter the Operation Do you Want :\t");
	        Scanner sc = new Scanner(System.in);
	        int Choice=sc.nextInt();
	        switch(Choice) {
	        case 1:
	        	try {
					FileNameSort();
				} 
	        	catch (Exception e) {
					e.printStackTrace();
				}
	        	System.out.print("\n");
	        	OperationSelection();
	        	break;
	        	
	        case 2:
	        	businessLevelOperation();
				break;
				
	        case 3:
	        	System.out.println("App is closed... \nThank you for Using !!! See You Again");
				break;
				
		    default:{
		    	System.out.println("Invalid Operation is Entered");
		    }
		    System.out.print("\n");
		    OperationSelection(); 
	        break;
		    	
	        }
		}
		public static void businessLevelOperation() {
			String[] array2 = {"1. Add a file to the existing directory list",
		                     "2. Delete  file from the existing directory list",
		                     "3. Search  file from the main directory",
		                     "4. Back to Main manu"
		                    };
			int[] sample2 = {1, 2, 3, 4};
		    int length2 = sample2.length;
		    for(int i=0; i<length2;i++){
		        System.out.println(array2[i]);
		    }
		    System.out.println("\nSelect your Operation Do you Want :\t");
		    Scanner obj = new Scanner(System.in);
		    int option = obj.nextInt();
		    switch(option) {
			   case 1:
				   try {
					FileCreateWrite();
				   }
				   catch (IOException e) {
					e.printStackTrace();
				   }
				   businessLevelOperation()	;
				   break;
				   
			   case 2:
				   try {
					FileDelete();
				   } 
				   catch (Exception e) {
					e.printStackTrace();
				   }
				   businessLevelOperation()	;
				   break;
				   
			   case 3:
				   try {
					FileSearch();
				   } 
				   catch (Exception e) {
					e.printStackTrace();
				   }
				   System.out.println("\n");
				   businessLevelOperation()	;
				   break;
				   
			   case 4:{
				   System.out.println("Exit from Manu \n");
				   OperationSelection();
				   break;
			   }
			   default:{
				   System.out.println("Invalid Operation entered ");
			   } 
			   System.out.print("\n");
			   businessLevelOperation()	;
			   break;
		    }
		}
		public static void FileCreateWrite() throws IOException{
			try {
			System.out.println("Enter the number of files you want to add: ");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			for(int i=0;i<n;i++) {
			System.out.println("Enter the filename :");
			Scanner sc1=new Scanner(System.in);
			String filename=sc1.next();
		    File file=new File("C:\\Users\\user\\Desktop\\VirtualKey\\"+filename+".txt");
		  
		    
		    System.out.println("Do you want write anything in thr file  : ");
			Scanner sc2=new Scanner(System.in);
			String content=sc2.nextLine();
		    FileWriter writer=new FileWriter(file);
			writer.write(content);
			writer.flush();
			writer.close();
			}
			System.out.println("Files created successfully!");
			}
			catch(IOException e) {
				 e.printStackTrace();
			}
		}
		public static void FileNameSort()
	    {
	        File file=new File("C:\\Users\\user\\Desktop\\VirtualKey\\");
	        if(file.isDirectory())
	        {
	        File[] fileList = file.listFiles();
	        Arrays.sort(fileList);
	        System.out.println("t Total number of file retrieved in an ascending order: " + fileList.length );

	        FileFilter fileFilter = new FileFilter()
	        {
	        @Override
	        public boolean accept(File file) {
	             return !file.isDirectory();
	        }
	        };
	        fileList = file.listFiles(fileFilter);
	        Arrays.sort(fileList, new Comparator<Object>()
	        {
	        public int compare(Object f1, Object f2) {
	             return ((File) f1).getName().compareTo(((File) f2).getName());
	        }
	        });
	        for(File fi:fileList)
	        {
	             System.out.println(fi.getName());
	        }
	        } 
	    }
		public static void FileDelete() throws Exception{
			System.out.println("Enter the filename that you want to delete");
			Scanner sc=new Scanner(System.in);
			String deletefile=sc.next();
		    File file=new File("C:\\Users\\user\\Desktop\\VirtualKey\\"+deletefile+".txt");
		    
		    boolean present = file.exists();
		    file.delete();
		    if(present==true) { // false
		    	System.out.println(deletefile+" deleted successfully");
		    }
		    else {
		    	System.out.println(" File "+deletefile+" is not found");
		    }
		}
		public static void FileSearch() throws Exception {
			try {
		    System.out.println("Enter the filename that you want to search");
			Scanner sc=new Scanner(System.in);
			String search=sc.next();
			File file=new File("C:\\Users\\user\\Desktop\\VirtualKey\\"+search+".txt");
			        
		    FileReader reader=new FileReader(file);
			int data;
			while((data=reader.read())!=-1) {
				 System.out.print((char)data);
			}
			}
			catch(FileNotFoundException e) {
				System.out.println("File is not present");
				System.out.println(e.getClass().getName());
				  
			}
		}
	}

