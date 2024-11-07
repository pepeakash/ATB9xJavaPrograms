// Create a Function of Sub, Sum, Mul and Div with parameter, a, b (take the parameter from the User)
package Task.task_28102024;

public class Task28thOct2024_Strings_Functions {
    public static void main(String[] args) {
        // Creating a string
        String str = "Hello, Java!";

        // Length of the string
        System.out.println("Length of the string: " + str.length());

        // Character at a specific index
        System.out.println("Character at index 1: " + str.charAt(1));

        //contentEquals
        System.out.println(str.contentEquals("lo"));

        // Substring from the string
        System.out.println("Substring from index 7: " + str.substring(7));
        System.out.println("Substring from index 0 to 5: " + str.substring(0, 5));

        // Checking if string contains a sequence
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // Replacing characters in a string
        System.out.println("Replacing 'Java' with 'World': " + str.replace("Java", "World"));

        // Converting to uppercase and lowercase
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // Trimming whitespace
        String strWithSpaces = "   Hello, Java!   ";
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

        // Checking if string is empty
        String emptyStr = "";
        System.out.println("Is empty string empty? " + emptyStr.isEmpty());

        // Checking if two strings are equal
        String str2 = "Hello, Java!";
        System.out.println("Equals 'Hello, Java!': " + str.equals(str2));

        // Checking if two strings are equal (ignoring case)
        String str3 = "hello, java!";
        System.out.println("Equals ignoring case 'hello, java!': " + str.equalsIgnoreCase(str3));

        // Finding the index of a character or substring
        System.out.println("Index of 'J': " + str.indexOf('J'));
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // Converting other data types to a string
        int num = 100;
        System.out.println("String value of int 100: " + String.valueOf(num));

        // Splitting the string
        String strSplit = "apple,banana,orange";
        String[] fruits = strSplit.split(",");
        System.out.println("Split result:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Concatenation of strings
        String str4 = "Hello";
        String str5 = "World";
        System.out.println("Concatenated string: " + str4.concat(", ").concat(str5).concat("!"));
        // Additional String Functions
        //  Last index of a character or substring
        System.out.println("Last index of 'a': " + str.lastIndexOf('a'));
        System.out.println("Last index of 'Java': " + str.lastIndexOf("Java"));

        //  Starts with and Ends with a substring
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("Ends with '!': " + str.endsWith("!"));

        //  Compare strings lexicographically
        String anotherStr = "Hello, World!";
        System.out.println("Compare 'Hello, Java!' to 'Hello, World!': " + str.compareTo(anotherStr));
        System.out.println("Compare ignoring case: " + str.compareToIgnoreCase(anotherStr));

        //  Joining strings with a delimiter
        String joinedString = String.join("-", "2024", "10", "28");
        System.out.println("Joined string: " + joinedString);

        //  Matches a regex pattern
        String email = "example@domain.com";
        System.out.println("Matches email pattern: " + email.matches("^[A-Za-z0-9+_.-]+@(.+)$"));

        //  Repeat a string
        String repeatStr = "Java ";
        System.out.println("Repeated string: " + repeatStr.repeat(3));

        //  Strip leading and trailing spaces (Java 11+)
        String strWithSpacess = "   Hello, Java!   ";
        System.out.println("Stripped leading and trailing: '" + strWithSpacess.strip() + "'");
        System.out.println("Stripped leading only: '" + strWithSpacess.stripLeading() + "'");
        System.out.println("Stripped trailing only: '" + strWithSpacess.stripTrailing() + "'");

        //  Transform string (Java 12+)
        String transformedStr = str.transform(s -> s.replace("Java", "Programming"));
        System.out.println("Transformed string: " + transformedStr);

        //  Getting a stream of characters
        str.chars().forEach(c -> System.out.print((char) c + " "));
        System.out.println();

        //  Check if string is blank (Java 11+)
        String blankStr = "   ";
        System.out.println("Is blank string blank? " + blankStr.isBlank());

        //  Concatenate using StringBuilder (efficient for multiple appends)
        StringBuilder sb = new StringBuilder();
        sb.append("Hello").append(", ").append("Java").append("!");
        System.out.println("StringBuilder result: " + sb.toString());

        //  Format strings
        String formattedStr = String.format("Welcome, %s! You have %d new messages.", "User", 5);
        System.out.println("Formatted string: " + formattedStr);

        //  Subsequence
        System.out.println("Subsequence from 0 to 5: " + str.subSequence(0, 5));

        //  Convert to character array
        char[] charArray = str.toCharArray();
        System.out.println("Character array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        //  Convert to byte array
        byte[] byteArray = str.getBytes();
        System.out.println("Byte array: ");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
        System.out.println();


        StringBuilder s1=new StringBuilder("jhv");
        System.out.println(s1.append(" ytyt"));
        System.out.println(s1.reverse());
        System.out.println(s1.replace(2,5,"sgjs"));
        System.out.println(s1.delete(3,5));


    }
}