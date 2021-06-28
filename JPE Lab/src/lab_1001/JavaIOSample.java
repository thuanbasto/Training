package lab_1001;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class JavaIOSample {
	private static final String FILE_PATH = "data.txt";
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Input data and write to text file
		try (BufferedWriter bufferedWriter = new BufferedWriter(
								new FileWriter(FILE_PATH, true))) {
			char loop;
			do {
				System.out.print("Enter a string:");
				String data = scanner.nextLine();

				// Write to the text file
				bufferedWriter.write(data + "\n"); // \n = newline

				System.out.print("Do you want continute?");
				loop = scanner.nextLine().charAt(0);
			} while ((loop == 'y') || (loop == 'Y'));

			bufferedWriter.flush();

		} catch (IOException exception) {
			exception.printStackTrace();
		}
		List<String> list = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		String strLine = "";

		// Read file into an ArrayList
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(
		FILE_PATH))) {
			while ((strLine = bufferedReader.readLine()) != null) {
				sb.append(strLine);
				sb.append(System.lineSeparator());
				list.add(strLine);
			}
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		// Display ArrayList
		System.out.println("--File Content--");
		for (String data : list) {
			System.out.println(data);
		}
	}
}
