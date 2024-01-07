/*Mantzoukas Aggelos Vasileios ice19390128*/

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TheaterXInterface extends java.rmi.Remote {
	public String runProgram() 
	throws java.rmi.RemoteException; //Edo epistrefetai ena string gia tin sosti ektelesi tou programmatos
	
	public String[] returnListSeats() 
	throws java.rmi.RemoteException; //Edo epistrefetai ena string pou deixnei ton tupo to plithos ton diathesimon kathismaton kathos kai ton timon tou
	
	public String[] book(String[] passArgs) //Edo epistrefontai ta munimata epituximenou booking h apotuximenou
	throws java.rmi.RemoteException;
	
	/* public String[] guests(String[] passArgs) Kanonika edo tha epistefotan o pinakas me tis kratiseis 
	throws java.rmi.RemoteException;  */


}
