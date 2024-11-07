package Nov.ex_07112024_OOPs_Inheritance.singleinheritance.Real;

public class TestCase2Class extends Common_BaseTestClass {
    //----------------------------- Default Constructor -----------------------------
    TestCase2Class(){
        System.out.println("Default Constructor - Child - TestCase2Class");
    }

    void testcase2Method(){
        startBrowserMethod();
        System.out.println("TC2 Executing");
        readExcelFileMethod();
        closeBrowserMethod();
    }

}
