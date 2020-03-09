package Bai2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Function extends Remote{
	public float SRectangle(float w, float h) throws RemoteException;
	public float Operator(String str) throws RemoteException;
	public String Convert(int number) throws RemoteException;
}
