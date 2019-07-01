import java.io.*;  
import java.net.*;
import java.util.Scanner;

public class MyClient{
	public static void main(String[] args){  
		try{      
			Socket s = new Socket("192.168.0.106",6666);  
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
			Scanner input = new Scanner(System.in);
			System.out.print("Enter your Message: ");
			String message = input.nextLine();
			dout.writeUTF(message);  
			dout.flush();  
			dout.close();  
			s.close();
		}catch(Exception e){
			System.out.println(e);
		}  
	}  
}  