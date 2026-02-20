package loops;
public class Task {
	public static void main(String[] args) {
		String str = "*****";
		for(int i = str.length(); i>=0;i--) {
			System.out.println(str.substring(0,i));
		}
	}
}
