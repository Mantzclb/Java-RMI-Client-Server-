/*Mantzoukas Aggelos Vasileios ice19390128*/

import java.util.Arrays;

public class TheaterXImpl extends java.rmi.server.UnicastRemoteObject implements TheaterXInterface{
	
	public String seats[] = new String[5]; //Array me tis plirofories ton 5 eidon ton theseon
	public int Seatnum[] = new int[]{100, 200, 400, 225, 75}; //Plithos theseon
	public String Seatstype[] = new String[]{"ZA", "ZB", "ZC", "CE", "SD"}; //type of seats, "Zone A", "Zone B", "Zone C", "Central Extractor", "Side Theories"
	public int prices[] = new int[]{45, 35, 25, 30, 20}; // array gia tis times ton theseon
	/*public String GuestsList[][] = new String[1000][4]; //guest list, 1000 spots because the no of seats is 1000. |Name|Amount|Type|Total cost
	public int index = 0; //used to count the guests on the guests list*/
	

	public TheaterXImpl() throws java.rmi.RemoteException{
		super();
	}

	
	public String runProgram() throws java.rmi.RemoteException{ //edo dilonoume to arxiko menu pou tha ektuponete ston xristi
		String message = "Java THClient \n Java THClient list <hostname> \n java THClient book <hostname> <type> <number> <name> \n java THClient guests <hostname> \n java THClient cancel <hostname> <type> <number> <name>\n ";
		return message;
	}

	//List for available seats
	
	public String[] returnListSeats() throws java.rmi.RemoteException{

		for (int i = 0; i < Seatnum.length; i++){
			seats[i] = " "+ String.valueOf(Seatnum[i]) + " Seat of type " + String.valueOf(Seatstype[i]) + " with price " + String.valueOf(prices[i]) + "€";  			
		}
		
		return seats;
	} 

	//Seats booking returning success or failure message
	public String[] book(String[] passArgs) throws java.rmi.RemoteException{
		
		String type = passArgs[2]; //Type of seats client wants
		int wantedSeats = Integer.parseInt(passArgs[3]); //Number of seats client wants to book
		String name = passArgs[4]; //client's name
		int Seatsavailable; 
		int j;
		int pricing; //price of seat
		int cost; //total cost 
			
		j = Arrays.binarySearch(Seatstype, type); //Find the index in the array of types
		pricing = prices[j]; //Find the price of the seat

		//This method is used when the client wants to book more seats, then the fourth cell will be "Yes"
		if(passArgs[4].equals("Yes")){
			
			cost = Seatnum[j] * prices[j];
			String[] suc = {"The booking of the available seats was Successful, the receipt will be send to you shortly. The total cost is: "  ,String.valueOf(cost)};
			Seatnum[j] = 0;
			return suc;
		}
		
		//In case there are not enough seats as the client wants, we ask the client if he wants to book the remaining seats
		if((wantedSeats > Seatnum[j]) && (Seatnum[j] > 0)){
			String[] answ = {"Do you want to book the available seats?"};
			return answ;
			// edo gia to cancel tha evaza mia if, ean h apantisi itan YES dld o client thelei na kleisei tis perissevoumenes theseis tote tha ginotan to book kai cost = Seatnum[j] * prices[j];
		
		}else if(Seatnum[j] == 0){ //No available seats
			String[] fail = {"Unfortunately there are no seats available"};
			return fail;	
		}else{ //edo ginetai to successful booking otan o pelatis thelei theseis pou einai diathesimes
			Seatnum[j] -= wantedSeats;
			cost = wantedSeats * pricing;
			//GuestsList[index][1] = 
			String[] success = {"The booking of your desired seats was Successful, the receipt will be send to you shortly. The total cost is: "  ,String.valueOf(cost)};
			return success; 
		}

			

	}
	
	/*public String[] guests(String[] passArgs) throws java.rmi.RemoteException{
		
	}
	*/
}		

























