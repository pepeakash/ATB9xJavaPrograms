package Nov.ex_11112024_Ecapsulation_Part2.police;

public class JrCopClass {
    public static void main(String[] args) {
        CopClassConstructor jrCopClass = new CopClassConstructor(5);
        // System.out.println(jrCopClass.private_Int_Gun_Attribute); // private attribute is not accessible outside the class
        jrCopClass.protectedMethod_CanIShoot(); // protected method is accessible within the same package
    }
}
