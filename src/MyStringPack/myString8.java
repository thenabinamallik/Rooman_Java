package MyStringPack;

public class myString8 {
	public static void main(String[] args) {
		String str = "Odisha is a beautiful state";
		String[] sh = str.split(" ");
		for(String s : sh)
		{
			System.out.println(s);
//			Odisha
//			is
//			a
//			beautiful
//			state
		}
		
		System.out.println();
		
		String str1 = "Bhubaneswar-is a state-capital-of Odisha";
		String[] sh1 = str1.split("-");
		for(String s : sh1)
		{
			System.out.println(s);
//			Bhubaneswar
//			is a state
//			capital
//			of Odisha
		}
	}
}
