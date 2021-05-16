package Bai2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry("localhost", 5000);
		Function function = (Function) registry.lookup("huhu");
		Registry registry2 = LocateRegistry.getRegistry("localhost", 5001);
		Function2 function2 = (Function2) registry2.lookup("hihi");
		int choose = 0;

		while (choose != 7) {
			System.out.println("----Methods form server 1----");
			System.out.println("1. Calculate the area of a rectangle.");
			System.out.println("2. Convert number to String.");
			System.out.println("3. Operator.");
			System.out.println("----Methods form server 2----");
			System.out.println("4. Calculate the area of a square.");
			System.out.println("5. Convert number to String.");
			System.out.println("6. Uppercase String.");
			System.out.println("7. Quit.");
			System.out.println("Input: ");
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
				System.out.println("Input your Number: ");
				int number = new Scanner(System.in).nextInt();
				System.out.println(function.Convert(number));
				break;
			case 3:
				System.out.println("Input the operator: ");
				String str = new Scanner(System.in).nextLine();
				System.out.println(function.Operator(str));
				break;
			case 4:
				System.out.println("Input edge: ");
				float a = new Scanner(System.in).nextFloat();
				System.out.println(function2.SSquare(a));
				break;
			case 5:
				System.out.println("Input your Number: ");
				int number2 = new Scanner(System.in).nextInt();
				System.out.println(function2.Convert(number2));
				break;
			case 6:
				System.out.println("Input the string: ");
				String str2 = new Scanner(System.in).nextLine();
				System.out.println(function2.uppercaseString(str2));
				break;
			case 7:
				break;
			}

		}
		System.out.println("Client Stopped.");

	}
}
