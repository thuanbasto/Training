
public class MoveCandy {
	public static int moveCandy(int[] candy) {
		int result = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		for (int i = 0; i < candy.length; i++) {
			if (candy[i] == 1)
				count1++;
			else if (candy[i] == 2)
				count2++;
			else if (candy[i] == 3)
				count3++;
			else if (candy[i] == 4)
				count4++;
		}
		int[] arr1 = new int[count1];
		int[] arr2 = new int[count2];
		int[] arr3 = new int[count3];
		int[] arr4 = new int[count4];

		count1 = 0;
		count2 = 0;
		count3 = 0;
		count4 = 0;
		for (int i = 0; i < candy.length; i++) {
			if (candy[i] == 1)
				arr1[count1++] = candy[i];
			else if (candy[i] == 2)
				arr2[count2++] = candy[i];
			else if (candy[i] == 3)
				arr3[count3++] = candy[i];
			else if (candy[i] == 4)
				arr4[count4++] = candy[i];
		}
		// 1 4 cho , 2 3 nhan
		// 1 cho 2
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > 0) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr2[j] == 2) {
						arr2[j]++;
						arr1[i]--;
						result++;
						break;
					}
				}
			}
		}
		// 4 cho 2
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr2[j] == 2) {
					arr2[j]++;
					arr4[i]--;
					result++;
					break;
				}
			}
		}
		// 1 cho 3
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > 0) {
				for (int j = 0; j < arr3.length; j++) {
					if (arr3[j] == 3) {
						arr3[j]++;
						arr1[i]--;
						result++;
						break;
					}
				}
			}
		}
		// 2 cho 3
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] > 0 && arr2[i] != 3) {
				for (int j = 0; j < arr3.length; j++) {
					if (arr3[j] == 3) {
						arr3[j]++;
						arr2[i]--;
						result++;
						break;
					}
				}
			}
		}
		// xet duyet 1 2
		count1 = 0;
		count2 = 0;
		count3 = 0;
		count4 = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[0] == 1) count1++;
		}
		if (count1%3 >= 0 && count1%3 < 2 && count1 >= 3) {
			result+= count1/3*2+(count1/3)*(count1%3);
		} else if (count1 != 0) return -1;
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] > 0 && arr2[i] <3) return -1;
		}
		return result;
	}

	public static void main(String[] args) {
		int candy[] = { 3,1,1,1,3,4,1,1,3};
		System.out.println(moveCandy(candy));
	}

}
