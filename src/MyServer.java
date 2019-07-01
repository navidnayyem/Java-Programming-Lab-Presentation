import java.io.*;  
import java.net.*;  
import java.awt.*;

public class MyServer{  
	public static void main(String[] args){  
		try{  
			ServerSocket ss = new ServerSocket(6666);  
			Socket s = ss.accept(); //establishes a connection   
			DataInputStream dis = new DataInputStream(s.getInputStream()); 
			String str = (String)dis.readUTF();  
			Toolkit sound = Toolkit.getDefaultToolkit(); //for beep sound
			sound.beep(); //for beep sound
			System.out.println("Getting Messages From Client = "+str);  
			ss.close();  
		}catch(Exception e){
			System.out.println(e);
		}  
	}  
}  