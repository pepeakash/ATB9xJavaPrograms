package Nov.ex_14112024_Static_Wrapper_Exceptions;
public enum Enum_Constructor_APIConstantsEndpoints {
    Constant_BASE_URL("https://app.vwo.com"),
    Constant_LOGIN_PAGE_URL("https://app.vwo.com/login"),
    Constant_DASHBOARD_PAGE_URL("https://app.vwo.com/dasHboard"),
    Constant_CHATBOT_PAGE_URL("https://app.vwo.com/chat");
    private String attribute_name;
    Enum_Constructor_APIConstantsEndpoints(String parameter_name) {
        this.attribute_name = parameter_name;
    }
    String getValueMethod() {
        return attribute_name;
    }
}
