
	import java.util.*;
	import java.util.function.Function;
	import java.util.stream.Collectors;
	public class Hashmap {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string ");
			String str = sc.nextLine();

			String[] words = str.toLowerCase().split("\\W+");
			Map<String, Long> wordCount = Arrays.stream(words)
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

			System.out.println("Word count using HashMap");
			wordCount.forEach((word, count) -> System.out.println(word + " : " + count));
		}
	}

