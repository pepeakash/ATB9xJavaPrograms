package Nov.ex_11112024_Ecapsulation_Part2.REAL;

//Rough Work
// Paramters, Arugments, Attribute


public class BaseClassConstructor {

    private String private_String_Browser_Atrribute;

// -------------------- Default Constructor --------------------
    BaseClassConstructor(){
        System.out.println("Default Constructor - BaseClass");
    }

    // ------------------------ Parameterized Constructor ------------------------
    BaseClassConstructor(String b){
        System.out.println("CC - BaseClass");
    }


    // ------------------------ Getters ------------------------
    public String getBrowserMethod() {
        return private_String_Browser_Atrribute;
    }

    // ------------------------ Setters ------------------------
    public void setBrowserMethod(String browserParameter, boolean isAuthParameter) {
        System.out.println("BaseClassContructor - SetBrowserMethod");
        if (isAuthParameter) {
            this.private_String_Browser_Atrribute = browserParameter;
        }else{
            System.out.println("Not Allowed");
        }
    }

    //  ------------------------ openBrowser Methods ------------------------
    void openBrowserMethod() {
        System.out.println("Opening Browser!!");

//        Webdriver driver = new ChromeDriver();
//        driver.get("url");
//


    }

    void openBrowserMethod(String browserNameParameter) {
        System.out.println("Open Browser!! -> " + browserNameParameter);
    }

    void closeBrowserMethod() {
        System.out.println("Close Browser!!");


    }








}
