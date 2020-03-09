
public class ExcelColumn {
	public static String numToName(int colNumber){
		String result = "";
		String[] alphaB = {"","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		while (colNumber > 26) {
			// lấy phần dư tương ứng với vị trí trong bảng chữ cái 
			int temp = colNumber % 26;
			result = alphaB[colNumber % 26] + result;
			colNumber /= 26;
		}
		result = alphaB[colNumber] + result;
		return result;
	}
	public static void main(String[] args) {
		System.out.println(numToName(1234555));
	}

}
