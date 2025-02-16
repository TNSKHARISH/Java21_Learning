package javapractice.strings;

public class EscapeSequenceExample {
    public static void main(String[] args) {
        System.out.println("===== Escape sequences =====");
        System.out.println();

        System.out.println("My favourite book is \"The one thing\" by Gary Keller.");
        System.out.println("Path to the source code: D:\\Java\\sources");

		/*
		 	\t - tab.
			\b - backspace (a step backward in the text or deletion of a single character).
			\n - new line.
			\r - carriage return. ()
			\f - form feed.
			\' single quote.
			\" double quote.
			\\ backslash.
		 */

        System.out.println("some text line 1\nsome text line 2");

        System.out.println("Unicode characters, \u00A9 IT-Bulls.com");
        System.out.println("Hello\nworld");
        System.out.println("Hello\\nworld");
        System.out.println("Name:\tHarish");
        System.out.println("Name:\\tHarish");
        // System.out.println("This is a backslash: \harish");
        System.out.println("This is a backslash: \\");
        System.out.println("It\'s a nice day!");
        System.out.println("She said: \"YES!\"");

    }
}
