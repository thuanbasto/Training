
public class CountString {
	public static int countString(String s){
		int result = 0;
		String[] arr = new String[100000];
		int count = 0;
		int i = 1;
		int length = s.length();
		while (i <= length) {
			for (int j = 0; j <= length-i; j++) {
				arr[count++] = s.substring(j,j+i);
			}
			i++;
		}
		for (int j = 0; j < count-1; j++) {
			if (!arr[j].equals("")) {
				for (int j2 = j+1; j2 < count; j2++) {
					if (!arr[j2].equals("")) {
						if (arr[j].equals(arr[j2])) {
							arr[j2]="";
						} else if (arr[j].length() != arr[j2].length()) break;
					}
				}
			}
		}
		for (int j = 0; j < count; j++) {
			if (!arr[j].equals("")) result++;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(countString("phanduchai"));
	}

}
