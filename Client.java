/*Mantzoukas Aggelos Vasileios ice19390128*/

import java.rmi.Naming;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
  
public class Client{
    public static void main(String[] args){
        try { //Here we are creating a remote object using the same name for the interface
        	TheaterXInterface t = (TheaterXInterface)Naming.lookup("rmi://localhost/TheaterX");
            
		if(args.length == 0){	 
			System.out.println(t.runProgram());
		}
		else if((args[0].equals("list")) && (args[1].equals("Theater"))){ 
			for (int i = 0; i < t.returnListSeats().length; i++){
				System.out.println(t.returnListSeats()[i]);
			}
		}
		else if(args[0].equals("book")){ //Booking

			String[] passArgs = new String[5]; //auti einai h parametros pou tha paei stin method mas
			for(int i = 0; i < args.length; i++){
				passArgs[i] = args[i]; //arxikopoiisi 
			}
			
			String[] ask = {"Do you wish to book an available seat?"};
			String[] answer = t.book(passArgs); //edo pairnoume ta apotelesmata
			String[] finalAnswer = new String[2];
			String respond;			

			if(answer.length == 1){ //an h apantisi einai isi me 1 simainei oti den uparxoun oses theseis zitise o pelatis
				Scanner in = new Scanner(System.in);
				respond = in.nextLine();
				
				if(respond.equals("Yes")){ //sti sunexeia erotate an thes na kleisei tis enapomeinantes theseis
					passArgs[4] = "Yes";
					finalAnswer = t.book(passArgs);
					for (int i = 0; i < finalAnswer.length; i++){
						System.out.println(finalAnswer[i]);
					}
				}
				else{ //an oxi ton apoxairetame
					System.out.println("Hope to see you next time");
					
				}
				
			}
			else{ //allios tuponoume to success message kathos kai to kostos
				for (int i = 0; i < answer.length; i++){
					System.out.println(answer[i]);
				}
			}

			
		}
		//else{ edo tha itan to else gia to cancel
			
		//}	    



	}
	catch (Exception e) {
	   System.out.println("ERROR: " + e);
          }
    }
}
