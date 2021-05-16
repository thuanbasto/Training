import java.util.HashMap;
import java.util.Map;

public class ChooseEmployee {
	public static int chooseEmployee(String[] skill, int[] salary, String requestSkill, int k) {
		if (skill.length < k && salary.length < k) return -1;
		int result = 0;
		Map<String, Integer> map = new HashMap<String, Integer>();
		// sort
		for (int i = 0; i < salary.length-1; i++) {
			for (int j = i+1; j < salary.length; j++) {
				if (salary[i] > salary[j]) {
					int temp = salary[i];
					salary[i] = salary[j];
					salary[j] = temp;
					String temp2 = skill[i];
					skill[i] = skill[j];
					skill[j] = temp2;
				}
			}
		}
		// request skill
		for (int i = 0; i < skill.length; i++) {
			if (requestSkill.equals(skill[i]) && k > 0) {
				k--;
				result+=salary[i];
				skill[i] = "";
			}
		}
		// đếm độ thịnh hành
		for (int i = 0; i < skill.length; i++) {
			if (skill[i].equals("")) continue;
			if (map.get(skill[i]) == null)
				map.put(skill[i], 1);
			else 
				map.put(skill[i], map.get(skill[i]) + 1);
		}
		String arr[] = new String[map.size()];
		int countArr[] = new int[map.size()];
		int index = 0;
		for (String i : map.keySet()) {
			arr[index] = i;
			countArr[index++] = map.get(i);
		}
		// sort 2 mang tren
		for (int i = 0; i < countArr.length-1; i++) {
			for (int j = i+1; j < countArr.length; j++) {
				if (countArr[i] < countArr[j]) {
					int temp = countArr[i];
					countArr[i] = countArr[j];
					countArr[j] = temp;
					String temp2 = arr[i];
					arr[i] = arr[j];
					arr[j] = temp2;
				}
			}
		}
		// tính tiền hoy
		while(k>0) {
			int max = -1;
			for (int i = 0; i < countArr.length; i++) {
				if (countArr[i] > max) {
					max = countArr[i];
				}
				else break;
			}
			// tìm tiền lương ít nhất
			int min = Integer.MAX_VALUE;
			int choose = 0;
			int count = 0;
			for (int i = 0; i < countArr.length; i++) {
				int sum = 0;
				int flag = k;
				count = 0;
				if (max == countArr[i]) {
					for (int j = 0; j < skill.length; j++) {
						if (flag > 0 && skill[j].equals(arr[i])) {
							flag--;
							sum += salary[j];
							count++;
						} else if (flag < 1) break;
					}
					if (min > sum) {
						min = sum;
						choose = i;
					}
				}
			}
			countArr[choose] = 0;
			result += min;
			for (int i = 0; i < skill.length; i++) {
				if (skill[i].equals("")) continue;
				if (arr[choose].equals(skill[i]) && k > 0) {
					k--;
					skill[i]="";
				} else if (k < 1) break;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String skill[] = {"Java",".Net","C++","Java","C++"};
		int salary[] = {20,40,60,10,20};
		System.out.println(chooseEmployee(skill, salary, ".Net",4));
	}

}
