
public class IsRainbow {
	public static boolean isARainbow(String rangeColor)
	{
	    String rainbow[] = {"red","orange","yellow","green","blue","indigo","violet"};
	    int index = 6;
	    while (index >= 0) {
	    	if (!rangeColor.contains(rainbow[index])) {
	    		return false;
	    	}
	    	index--;
	    }
	    int index2 = 0;
	    while (true) {  // red red orange yellow green blue indigo violet
	    	while (rangeColor.contains(rainbow[index2])) {
	    		String temp = rangeColor.substring(0,rainbow[index2].length());
	    		if (temp.equals(rainbow[index2])){
	    			rangeColor = rangeColor.substring(rainbow[index2].length());
	    		} else {
	    			return false;
	    		}
	    	} 
	    	index2++;
	    	if (index2 == 7 && rangeColor.equals("")) {
	    		return true;
	    	}
	    }
	}

	public static void main(String[] args) {
		System.out.println(isARainbow("redredredorangeorangeorangeyellowyellowyellowgreenblueindigoviolet"));
	}

}
