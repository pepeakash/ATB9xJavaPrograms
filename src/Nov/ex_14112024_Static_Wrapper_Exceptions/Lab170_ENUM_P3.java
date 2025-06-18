package Nov.ex_14112024_Static_Wrapper_Exceptions;

public class Lab170_ENUM_P3 {

    public static void main(String[] args) {

        System.out.println(Enum_Color.Constant_RED.getHexcodeMethod());

        if (Enum_Color.Constant_GREEN.getHexcodeMethod() == "#61FF33") {
            System.out.println("Color is Green");
        }
    }
}


enum Enum_Color {
    Constant_RED("#FF0000"),
    Constant_GREEN("#61FF33"),
    Constant_BLUE("#3377FF"),
    Constant_YELLOW("#4477FF");


    private String attribute_hexcode;

    Enum_Color(String parameter_hexcode) {
        this.attribute_hexcode = parameter_hexcode;
    }

    String getHexcodeMethod() {
        return this.attribute_hexcode;
    }


}