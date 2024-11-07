// Create a Function of Sub, Sum, Mul and Div with parameter, a, b (take the parameter from the User)
package Task.task_25102024;

public class Task25thOct2024_StringsExercise4 {

    public static void main(String[] args) {

        String str = "Sun is rising ";
        System.out.println(str);

        String str1 = new String("Mood is rising in the evening");
        System.out.println(str1);

        StringBuffer str2 = new StringBuffer("The Boss is always Right" );
        System.out.println(str2);

        StringBuilder str3 = new StringBuilder("This laptop have updated version of window ");
        System.out.println(str3);

        String str4 = "Sachin";
        String  str5 = str4.concat("tendulkar");
        System.out.println(str5);

        String str6 = "Manthan";
        String str7 = "Panchal";
        String sum  = str6 + str7 ;
        System.out.println("The name is  "  +  sum);

        char character[] = {'A', 'B', 'C'};
        System.out.printf("character[] = %s \n" , character); // output =

        String FirstString = new String(character);
        System.out.printf("FirstString = %s \n" , FirstString); // output = ABC






    }


}