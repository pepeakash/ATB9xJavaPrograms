package Nov.ex_11112024_Ecapsulation_Part2.criminal;

import Nov.ex_11112024_Ecapsulation_Part2.police.CopClassConstructor;


public class ThiefClass {
    public static void main(String[] args) {

        CopClassConstructor copClassConstructor = new CopClassConstructor(10);
        //System.out.println(copClassConstructor.private_Int_Gun_Attribute); // private attribute is not accessible outside the class
        //copClassConstructor.protectedMethod_CanIShoot(); // protected method is not accessible outside the package



    }
}
