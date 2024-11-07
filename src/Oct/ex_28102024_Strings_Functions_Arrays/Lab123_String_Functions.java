package Oct.ex_28102024_Strings_Functions_Arrays;

public class Lab123_String_Functions {
    public static void main(String[] args) {
        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);

        // substring - many interviews
        String s1 = "Pramod";
        String s2 = s1.concat("Dutta");
        System.out.println(s2);


        String fruits = "apple,banana,cherry"; // delimter = ,
        String[] split_fruits = fruits.split(",");
        System.out.println(split_fruits[0]);
        System.out.println(split_fruits[1]);
        System.out.println(split_fruits[2]);

        String fruits2 = "ABC-XYZ-QWE"; // delimter = ,
        String[] split_fruits2 = fruits2.split("-");
        System.out.println(split_fruits2[0]);
        System.out.println(split_fruits2[1]);
        System.out.println(split_fruits2[2]);


        String s4 = "Pramod";
        System.out.println(s4.charAt(0)); //P - index 0
        //System.out.println(s4.charAt(10)); //StringIndexOutOfBoundsException

        String s5 = " Pramod ";
        System.out.println(s5.trim()); //Pramod - removes the leading and trailing spaces

        String s6 = "Pramod";
        System.out.println(s6.indexOf("r")); //1 - index of r in the string Pramod
        System.out.println(s6.indexOf("d")); //5 - index of d in the string Pramod

        String s7 = "Pramod";
        System.out.println(s7.contains("ra")); //true - ra is present in the string Pramod
        System.out.println(s7.contains("zy")); //false - zy is not present in the string Pramod

        String s8 = "Pramoddutta";
        System.out.println(s8.lastIndexOf("d")); //last index of character d in the string Pramoddutta is 6

        String s9 = "Pramoddutta";
        System.out.println(s9.replace("d","z")); //Pramozzutta - replaces all the occurences of d with z
        System.out.println(s9.replaceAll("d","z")); //Pramozzutta - replaces all the occurences of d with z - same as replace

        // replace vs replaceAll
        // replace - takes char as input
        // replaceAll - takes string as input


        String s10 = "Pramodduttaji";
        System.out.println(s10.startsWith("Pra")); //true - starts with Pra
        System.out.println(s10.endsWith("ji")); //true - ends with ji
        System.out.println(s10.endsWith("zy")); //false - does not end with zy



        String original = "banana";
        String result1 = original.replace('a', 'o');
        System.out.println(result1);

        String original1 = "Hello123 World456!";
        String result2 = original1.replaceAll("\\d+", "-");  //Hello- World-! - replaces all the digits with -
        System.out.println(result2);


        String result3 = original1.replaceAll("o", "O");  //HellO123 WOrld456! - replaces all the o with O
        System.out.println(result3);





    }
}
