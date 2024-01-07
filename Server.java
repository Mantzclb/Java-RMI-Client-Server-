/*Mantzoukas Aggelos Vasileios ice19390128*/

import java.rmi.Naming;

public class Server{
	
	//Our constructor
	public Server(){
		try{
			TheaterXInterface t = new TheaterXImpl(); //Create object references to the interface
			Naming.rebind("rmi://localhost/TheaterX", t); //binding 
		   }
		   catch (Exception e){ //in case of a mistake occurs we are printing out the exception
			System.out.println("ERROR!: " + e);
		   }
	}

	public static void main(String[] atgs){
		new Server();
	}

}
