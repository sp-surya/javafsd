import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
	
class FileHandlingPratice {


		public static void writemethod() throws IOException {
	    File file=new File("C:practiceProject.txt");
	    
	    
	    FileWriter author=new FileWriter(file);
	    author.write("Hi Ram  - First Line");
	    author.close();
	    
	    if(file.createNewFile()) {
			System.out.println("File Created");
		 }
		else {
			System.out.println("File  is already Exist");
		 }
		}
		
	    
		public static void readmethod()throws IOException{
	    FileReader verifier=new FileReader("C:practiceProject.txt");
	    int info;
	     while((info=verifier.read())!=-1) {
	    	System.out.print((char) info);
	     }
		}
		
	
	    public static void appendmethod() throws IOException{
	    	Path way=Paths.get("C:practiceProject.txt");
	    	System.out.println("\n");
	    	String appendString=" How are you? -  Second line";
	    	byte array[]=appendString.getBytes();
	    	
	    	Files.write(way, array, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
	    	System.out.println("Date Writen");
	    	readmethod();
	    }
	    
		public static void main(String[] args) {
			try{
				 writemethod();
				 readmethod();
				 appendmethod();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	

