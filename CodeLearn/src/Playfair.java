public class Playfair {
	public static String table[][] = new String[5][5];
	public static String k = "CON KET";
	public static String alphabet = "ABCDEFGHIKLMNOPQRSTUVWXYZ";
	
	public static String removeCharAt(String input,int index) {
		return input.substring(0,index) + input.substring(index+1);
	}
	public static void createTabel() {
		// delete space
		String key = k;
		key = key.trim();
		while (key.contains(" ")) {
			key = key.replace(" ", "");
			k = k.replace(" ", "");
		}
		// K + alphabet
		key += alphabet;

		// Delete character duplicate
		for (int i = 0; i < k.length(); i++) {
			int index = key.lastIndexOf(String.valueOf(k.charAt(i)));
			key = removeCharAt(key, index);
		}
		// Reverse to Array
		int count = 0;
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				table[i][j] = String.valueOf(key.charAt(count++));
			}
		}   
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static String encrytion(String input) {
		String result = "";
		createTabel();
		// delete space
		input = input.trim();
		while (input.contains(" ")) {
			input = input.replace(" ", "");
		}
		input = input.toUpperCase();
		// If Input odd + X
		if (input.length() % 2 == 1) {
			input += "X";
		}
		System.out.println(input);
		
		for (int i = 0; i < input.length(); i+=2) {
			String a = String.valueOf(input.charAt(i));
			String b = String.valueOf(input.charAt(i+1));
			int rowA = 0;
			int colA = 0;
			int rowB = 0;
			int colB = 0;
			
			for (int j = 0; j < table.length; j++) {
				// co gia tri roi thi thoat khoi vong lap
				if (rowA != 0 && rowB !=0 && colA != 0 && colB !=0) break;
				
				for (int k = 0; k < table.length; k++) {
					if (a.equals(table[j][k])) {
						rowA = j;
						colA = k;
					}
					if (b.equals(table[j][k])) {
						rowB = j;
						colB = k;
					}
				}
			}	
			if (rowA != rowB && colA != colB) {
				result += table[rowA][colB] + table[rowB][colA];
			} else if (rowA == rowB && colA != colB) {
				result += table[rowA][colA+1] + table[rowB][colB+1];
			} else if (rowA != rowB && colA == colB) {
				result += table[rowA+1][colA] + table[rowB+1][colB];
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(encrytion("THUAN DEP TRAI"));
	}
}
