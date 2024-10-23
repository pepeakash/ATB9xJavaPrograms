package Oct.ex_10102024_Constants_Literals;

public class Lab035 {
    public static void main(String[] args) {
        // Char

        char c1 = 'A'; // 65
        System.out.println(c1);
        char c2 = 'B'; // 66
        System.out.println(c2);
        char c3 = '@'; // 64
        System.out.println(c3);

        // Escape Char
        char new_line = '\n'; // new line
        char tab_line = '\t'; // tab space
        char back_space = '\b'; // delete the previous character
        char car_r = '\r'; // delete the previous word

        System.out.println("Pramod"+ new_line +  "Dutta");
        //System.out.println("Pramod" +  "Dutta");
        System.out.println("Pramod"+ tab_line +  "Dutta");
        System.out.println("Pramod"+ back_space +  "Dutta");
        System.out.println("Pramod"+ car_r +  "Dutta");


        char c11  = '\u1F60'; // Unicode - decimal value of ὠ is 8032  - '\u1F60'
        // ASCII ->
        // chinese - india, japense -> Unicode
        // /u09878






    }
}
