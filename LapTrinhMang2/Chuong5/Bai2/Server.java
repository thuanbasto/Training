package Bai2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements Function {
	private static final long serialVersionUID = 1L;

	public Server() throws RemoteException {
		super();
	}

	@Override
	public float SRectangle(float w, float h) throws RemoteException {
		return w * h;
	}

	public static String[] getNumber(String str) {
		String[] temp;
		// delete space lon hon 2
		while (str.contains("  ")) {
			str = str.replace("  ", " ");
		}
		str = str.trim();
		temp = str.split(" ");
		return temp;
	}

	@Override
	public float Operator(String str) throws RemoteException {
		float result = 0;
		String[] temp;

		if (str.contains("+")) {
			str = str.replace("+", " ");
			temp = getNumber(str);
			result = Float.parseFloat(temp[0]) + Float.parseFloat(temp[1]);
		} else if (str.contains("-")) {
			str = str.replace("-", " ");
			temp = getNumber(str);
			result = Float.parseFloat(temp[0]) - Float.parseFloat(temp[1]);
		} else if (str.contains("*")) {
			str = str.replace("*", " ");
			temp = getNumber(str);
			result = Float.parseFloat(temp[0]) * Float.parseFloat(temp[1]);
		} else if (str.contains("/")) {
			str = str.replace("/", " ");
			temp = getNumber(str);
			result = Float.parseFloat(temp[0]) / Float.parseFloat(temp[1]);
		}

		return result;
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
		Registry registry = LocateRegistry.createRegistry(5000);
		registry.rebind("huhu", new Server());
		System.out.println("Server Started.");
	}

}
