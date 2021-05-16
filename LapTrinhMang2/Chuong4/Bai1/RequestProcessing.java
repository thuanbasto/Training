package Bai1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class RequestProcessing extends Thread{
	
	public Socket socket;
	public int flag;
	
	public RequestProcessing(Socket socket, int flag) {
		this.socket = socket;
		this.flag = flag;
	} 
	
	public static String convert(int number) {
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
	
	@Override
	public void run() {
		try {
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
			
			int number = dataInputStream.readInt();
			String result = convert(number);
			
			dataOutputStream.writeUTF(result);
			dataOutputStream.flush();
			
			dataInputStream.close();
			dataOutputStream.close();
			socket.close();
			System.out.println("Client " + flag + ": Stopped");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
