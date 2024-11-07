package Nov.ex_07112024_OOPs_Inheritance.singleinheritance.Real;

public class Common_BaseTestClass {
    //----------------------------- Default Constructor -----------------------------
    public Common_BaseTestClass() {
        System.out.println("Default Constructor  - Parent - Common_BaseTestClass");
    }

    void startBrowserMethod() {
        System.out.println("Staring Browser!!");
    }

    void closeBrowserMethod() {
        System.out.println("Closing Browser!!");
    }

    void readExcelFileMethod(){
        System.out.println("Reading File");
    }


}
