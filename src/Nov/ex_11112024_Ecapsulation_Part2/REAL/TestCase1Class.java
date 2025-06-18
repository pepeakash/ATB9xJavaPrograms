package Nov.ex_11112024_Ecapsulation_Part2.REAL;

// ------------------------ Child Class extends Parent Class------------------------
public class TestCase1Class extends BaseClassConstructor {

// ------------------------ Default Constructor ------------------------
    public TestCase1Class(){
        super(); // Calling Parent Constructor - Super - Means Parent - BaseClassConstructor
        // this - current Object
        System.out.println("Default Constructor - TestCase1");

    }

    public void startTestCaseMethod(){
        openBrowserMethod("chrome");
        closeBrowserMethod();
    }

    @Override
    public void setBrowserMethod(String browserParameter, boolean isAuthParameter) {
        System.out.println("Own Logic");
        super.setBrowserMethod(browserParameter, isAuthParameter);
    }


    @Override
    public String toString() {
        return "TestCase1{}";
    }
}
