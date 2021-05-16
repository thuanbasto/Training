package Bai2;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ServerTwo extends UnicastRemoteObject implements Function2 {
	protected ServerTwo() throws RemoteException {
		super();
	}

	private static final long serialVersionUID = 1L;

	@Override
	public float SSquare(float a) throws RemoteException {
		return a*a;
	}

	@Override
	public String uppercaseString(String str) throws RemoteException {
		return str.toUpperCase();
	}

		@Override
	public String Convert(int number) throws RemoteException {
		if (number == 0) {
			return "không";
		}
		String result="";
		String[] arr = {"mươi","trăm","nghìn","mươi","trăm","triệu","mươi","trăm","tỉ"};
		int count = 0;
			
		while (number > 0) {
			String str="";
			int temp = number%10;
			switch(temp) {
			case 1:
				str+="một";
				break;
			case 2:
				str+="hai";
				break;
			case 3:
				str+="ba";
				break;
			case 4:
				str+="bốn";
				break;
			case 5:
				str+="năm";
				break;
			case 6:
				str+="sáu";
				break;
			case 7:
				str+="bảy";
				break;
			case 8:
				str+="tám";
				break;
			case 9:
				str+="chín";
				break;
			case 0:
				str+="không";
				break;
			}
			if (number >= 10) {
				result = arr[count++] + " " + str + " " + result;
			} else {
				result = str + " " + result;
			}
			number/=10;
		}
		if (result.contains("một mươi") || result.contains("không mươi") || result.contains("mười không")
				|| result.contains("mươi một")) {
			result = result.replace("một mươi", "mười");
			result = result.replace("không mươi", "lẻ");
			result = result.replace("mười không", "mười");
			result = result.replace("mươi một", "mươi mốt");
		}
		return result;

	}

	public static void main(String[] args) throws RemoteException {
		Registry registry = LocateRegistry.createRegistry(5001);
		registry.rebind("hihi", new ServerTwo());
		System.out.println("Server Started.");
	}


}
