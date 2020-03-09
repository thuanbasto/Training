
public class UnlockTheCode {
	public static boolean unlockTheCode(String start, String target, int n, String[][] arr){
		boolean result = false;
		int i = 0;
		int count = 0;
		boolean check = false;
		while(count <= n) {
			if (target.contains(arr[i][1])) {
				check =true;
				String temp = target.replace(arr[i][1], "1");
				int countContains = 0;
				for (int j = 0; j < temp.length(); j++) {
					if (temp.charAt(j) == '1') {
						countContains++;
					}
				}
				if (count + countContains > n) {
					while (countContains > 0) {
						int index = target.indexOf(arr[i][1]);
						String s = target.substring(index);
						String t = target.substring(0,index);
						String tmp = t.concat(s.replaceFirst(arr[i][1],arr[i][0]));
						if (tmp.equals(start)) {
							return true;
						}
						countContains--;
					}
				} else {
					count += countContains;
					target = target.replace(arr[i][1], arr[i][0]);
				}
				System.out.println(count);
			} 
			System.out.println(start);
			if (start.equals(target) && count == n) return true;
			else if (start.equals(target) && count != n) return false;
			else if (!start.equals(target) && count < n) {
				if (i == arr.length-1) {
					if (check == false) {
						return false;
					}
					i = 0;
					check = false;
				} else i++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String[][] arr = {{"XX", "XO"}, {"XO", "OO"}, {"O", "XX"}};
		System.out.println(unlockTheCode("XO", "XXXO", 4, arr));
	}

}
