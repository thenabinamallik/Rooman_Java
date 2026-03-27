package Tasks;
import java.util.ArrayList;
import java.util.ListIterator;

public class Problem9 {
	public static void main(String[] Args) {
		ArrayList<String> al = new ArrayList<>(16);
		al.add("i");
		al.add("am");
		al.add("Nabin");
		al.add("Mallik");
		
		ListIterator<String> lal = al.listIterator(al.size());
		while(lal.hasPrevious()) {
			System.out.println(lal.previous());
		}
	}
}
