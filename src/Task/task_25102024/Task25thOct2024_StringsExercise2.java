// Create a Function of Sub, Sum, Mul and Div with parameter, a, b (take the parameter from the User)
package Task.task_25102024;

public class Task25thOct2024_StringsExercise2 {

    public static void main(String[] args) {

        String newsubstring = "Niagara. O roar again!";
        String text = newsubstring.substring(16, 21);
        System.out.println(text);

        String s1 = "Bala";
        String s2 = s1.concat("Murali");
        System.out.println(s2);

        String s3 = "Program";
        System.out.println(s3.charAt(4));
        //  System.out.println(s3.charAt(10)); //StringIndexOutOfBoundsException

        String s4 = "      Automation Testing";
        System.out.println(s4.trim());

        String s5 = "New course";
        System.out.println(s5.indexOf("u"));
        System.out.println(s5.indexOf("e"));
        System.out.println(s5.lastIndexOf("e"));
        System.out.println(s5.contains("ou"));
        System.out.println(s5.replace('N', 'e'));

// replace vs replace all
        String original = "banana";
        String result1 = original.replace('a', 'o');
        System.out.println(result1);

        String original1 = "Hello123 World456!";
        String result2 = original1.replaceAll("\\d+", "");
        System.out.println(result2);


        String result3 = original1.replaceAll("o", "O");
        System.out.println(result3);


    }


}