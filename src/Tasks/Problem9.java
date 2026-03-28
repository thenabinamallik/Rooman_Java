package Tasks;

public class Problem9  {
	public static void main(String[] args) {
		System.out.println(toUpper("ROOm$an"));
		System.out.println(toUpper("RoOMan"));
		System.out.println();
		System.out.println(toLower("Room$an"));
		System.out.println(toLower("RoomAM"));
		
		System.out.println();
		System.out.println(indexL("Rooman",'n'));
	}

	
	
	
	public static String toLower(String str) {
		String newStr = "";

		for (char o : str.toCharArray()) {
			if (o >= 65 && o <= 90) {
				newStr = newStr.concat(String.valueOf((char) (o + 32)));
			} else {
				newStr = newStr.concat(String.valueOf((char) (o)));
				;
			}
		}
		return newStr;
	}
	
	public static String toUpper(String str) {
		String newStr = "";
		
		for (char o : str.toCharArray()) {
			if (o >= 92 && o <= 127) {
				newStr = newStr.concat(String.valueOf((char) (o - 32)));
			} else {
				newStr = newStr.concat(String.valueOf((char) (o)));
				;
			}
		}
		return newStr;
	}
	
	public static int index(String str, char target) {
		
		int idx = str.length();
		for (char o : str.toCharArray()) {
			if (o==target) {
				return idx;
			} else {
				idx--;
			}
		}
		
		return -1;
	}

	public static int indexL(String str, char target) {
		
		int idx = -1;
		for (int i = str.length()-1; i>=0; i--) {
			if (str.charAt(i)==target) {
				idx = i;
			}
		}
		return idx;
	}
}
