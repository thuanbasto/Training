package Bai2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Function2 extends Remote{
	public float SSquare(float a) throws RemoteException;
	public String uppercaseString(String str) throws RemoteException;
	public String Convert(int number) throws RemoteException;
}
