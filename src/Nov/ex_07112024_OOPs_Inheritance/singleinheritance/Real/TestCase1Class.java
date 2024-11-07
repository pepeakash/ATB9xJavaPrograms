package Nov.ex_07112024_OOPs_Inheritance.singleinheritance.Real;

public class TestCase1Class extends Common_BaseTestClass {

    //----------------------------- Default Constructor -----------------------------
    public TestCase1Class(){
        System.out.println("Default Constructor - Child - TestCase1Class");
    }

    public void testcase1Method(){
        startBrowserMethod();
        readExcelFileMethod();
        closeBrowserMethod();
    }

}
