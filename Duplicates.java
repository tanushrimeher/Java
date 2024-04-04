//4
import java.util.HashSet;
		import java.util.Set;

public class Duplicates {
	public static void main(String[] args) {
		String inputString = "Tanushri Balasaheb Meher";
		Set<Character> duplicates = new HashSet<>();

		for (char c : inputString.toCharArray()) {
			if (!Character.isWhitespace(c)) {
				if (!duplicates.add(c)) {
					System.out.print(c + " ");
				}
			}
		}
	}
}

