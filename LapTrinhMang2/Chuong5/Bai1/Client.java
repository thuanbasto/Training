package Bai1;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry("localhost",5000);
		Function function = (Function) registry.lookup("huhu");
		int choose = 0;
		
		while(choose != 5) {
			System.out.println("1. Calculate the area of a rectangle.");
			System.out.println("2. Calculate the perimeter of a rectangle.");
			System.out.println("3. Convert number to String.");
			System.out.println("4. Operator.");
			System.out.println("5. Quit.");
			choose = new Scanner(System.in).nextInt();
			switch (choose) {
				case 1:
					System.out.println("Input weight: ");
					float w = new Scanner(System.in).nextFloat();
					System.out.println("Input height: ");
					float h = new Scanner(System.in).nextFloat();
					System.out.println(function.SRectangle(w, h));
					break;
				case 2:
					System.out.println("Input weight: ");
					float w2 = new Scanner(System.in).nextFloat();
					System.out.println("Input height: ");
					float h2 = new Scanner(System.in).nextFloat();
					System.out.println(function.SRectangle(w2, h2));
					break;
				case 3:
					System.out.println("Input your Number: ");
					int number = new Scanner(System.in).nextInt();
					System.out.println(function.Convert(number));
					break;
				case 4:
					System.out.println("Input the operator: ");
					String str = new Scanner(System.in).nextLine();
					System.out.println(function.Operator(str));
					break;
				case 5:
					break;
			}
			System.out.println("Client Stopped.");
			
		}
		
		
	}
}
