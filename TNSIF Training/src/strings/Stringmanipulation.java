package strings;

public class Stringmanipulation {

	public static void main(String[] args) {
		
		        String text = "Java main dsa";
		        String reversed = new StringBuilder(text).reverse().toString();
		        String replaced = text.replace("java main dsa", "Java dsa concepts");

		        System.out.println("Original: " + text);
		        System.out.println("Reversed: " + reversed);
		        System.out.println("Replaced: " + replaced);
		    }
		
	}

