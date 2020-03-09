import java.util.ArrayList;
import java.util.List;

public class RateOfLove {
	public static int rateOfLove(String[] name){
		int result = 0;
		String temp = name[0] + name[1];
		temp = temp.replaceAll(" ","");
		temp = temp.toLowerCase();
		String arr[] = temp.split("");
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length-1; i++) {
			if (!arr[i].equals("")){
				int count = 1;
				for (int j = i+1; j < arr.length; j++) {
					if (arr[i].equals(arr[j]) && !arr[j].equals("")) {
						arr[j] = "";
						count++;
					}
				}
				list.add(count);
			}
		}
		String resultTemp = "";
		for (int i : list) {
			resultTemp += i;
		}
		while (true) {
			if (resultTemp.length() <= 2) break;
			if (resultTemp.equals("100")) return 100;
			
			int arrTemp[] = new int[resultTemp.length()-1];
			for (int i = 0; i < resultTemp.length()-1; i++) {
				arrTemp[i] = ((Integer.valueOf(String.valueOf(resultTemp.charAt(i))) +
						Integer.valueOf(String.valueOf(resultTemp.charAt(i+1)))))%10;
			}
			resultTemp = "";
			for (int i = 0; i < arrTemp.length; i++) {
				resultTemp+=arrTemp[i];
			}
		}
		result = Integer.valueOf(resultTemp);
		return result;
	}

	public static void main(String[] args) {
		String name[] = {"Pham Minh Anh","Nguyen Bao Khanh"};
		int number = 100 - Integer.valueOf(rateOfLove(name));
 		System.out.println("Tỉ lệ chia tay: "+number+"%");
	}

}
