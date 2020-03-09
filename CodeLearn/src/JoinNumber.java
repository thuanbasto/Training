
public class JoinNumber {
	public static String[] joinNumber(String[] a)
	{
		String[] result = {"",""};
		String[] arr = new String[100];
		String saveMin = "";
		int[] numberFirst = new int[10];
		int count = 0;
		// tìm số đầu tiên của mỗi chữ số có số lớn nhất
		for (int i = 0; i < 10; i++) {
			numberFirst[i] = 10;
		}
		for (int i=0;i<a.length;i++) {
			int temp = Integer.valueOf(String.valueOf(a[i].charAt(0)));
			if (numberFirst[temp] == 10) {
				numberFirst[temp] = temp;
			}
		}
		// xét từng trường hợp của mỗi số
		for (int k=9;k>=0;k--) {
			int number = numberFirst[k];
			count = 0;
			if (number != 10) {
				// tìm những số có số đầu tiên bằng với number
				for (int i=0;i<a.length;i++) {
					int temp = Integer.valueOf(String.valueOf(a[i].charAt(0)));
					if (temp == number) {
						arr[count] = String.valueOf(a[i]);	
						count++;
					}
				}
				// sort 
				for (int i=0;i<count-1;i++) {
					for (int j=i+1;j<count;j++) {
						int lengthMin = 0;
						int lengthMax = 0;
						boolean checkSwap = false;
						// get max với min để dựa vào mà swap
						if (arr[i].length() < arr[j].length()) {
							lengthMin = arr[i].length();
							lengthMax = arr[j].length();
						} else {
							lengthMin = arr[j].length();
							lengthMax = arr[i].length();
						}
						// so sánh từng đơn vị trong 1 số
						for (int q=1;q<lengthMin;q++) {
							if (Integer.valueOf(String.valueOf(arr[i].charAt(q))) < Integer.valueOf(String.valueOf(arr[j].charAt(q)))) {
								String temp = arr[i];
								arr[i] = arr[j];
								arr[j] = temp;
								checkSwap = true;
								break;
							} else if (Integer.valueOf(String.valueOf(arr[i].charAt(q))) > Integer.valueOf(String.valueOf(arr[j].charAt(q)))) {
								checkSwap = true;
								break;
							}
						}
						if (checkSwap == false && arr[i].length() == lengthMax) {
							for (int q=lengthMin;q<lengthMax;q++) {
								if (Integer.valueOf(String.valueOf(arr[i].charAt(q))) < number) {
									String temp = arr[i];
									arr[i] = arr[j];
									arr[j] = temp;
									checkSwap = true;
									break;
								}
							}
						}
						if (checkSwap == false && arr[j].length() == lengthMax) {
							for (int q=lengthMin;q<lengthMax;q++) {
								if (Integer.valueOf(String.valueOf(arr[j].charAt(q))) >= number) {
									String temp = arr[i];
									arr[i] = arr[j];
									arr[j] = temp;
									break;
								}
							}
						}
					}
				}
				// trường hợp nếu có 1 số có số đàu tiên = 0 thì lưu 1 số gần với TH này nhất để đưa lên đầu
				if (number == 0) {
					result[0] = result[0].substring(saveMin.length());
				}
				for (int i=0;i<count;i++) {
					result[0] = arr[i] + result[0];
				}
				if (number == 0) {
					result[0] =saveMin + result[0];
				}
				for (int i=0;i<count;i++) {
					result[1] += arr[i];
				}
				// lưu 1 số gần với TH = 0
				saveMin = arr[count-1];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String a[] = {"0034", "196", "6", "089", "00137", "0015","0","00"};
		String c[] = {"37","3"};
		String b[] = joinNumber(a);
		System.out.println(b[0]);
		System.out.println(b[1]);
	}

}
