package Nov.ex_11112024_Ecapsulation_Part2.police;

public class CopClassConstructor {

    private int private_Int_Gun_Attribute;
    public String public_String_iCard_Attribute;

    public CopClassConstructor(int gun_Parameter){
        this.private_Int_Gun_Attribute = gun_Parameter;
    }

    protected void protectedMethod_CanIShoot(){
        System.out.println("Yes, You can!!");
    }






}



