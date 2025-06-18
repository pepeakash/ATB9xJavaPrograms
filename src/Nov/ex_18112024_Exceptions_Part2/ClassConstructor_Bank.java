package Nov.ex_18112024_Exceptions_Part2;
public class ClassConstructor_Bank {
    private String private_string_attribute_currency;
    private Integer private_integer_attribute_amount;
    // -------------------- parameterized constructor --------------------
    public ClassConstructor_Bank(String parameter_currency, Integer parameter_amount) {
        this.private_string_attribute_currency = parameter_currency;
        this.private_integer_attribute_amount = parameter_amount;
    }
    //-------------------------------Getters & Setters--------------------------------------
    public String getCurrencyMethod() {
        return private_string_attribute_currency;
    }
    public void setCurrencyMethod(String parameter_currency) {
        this.private_string_attribute_currency = parameter_currency;
    }
    public Integer getAmountMethod() {
        return private_integer_attribute_amount;
    }
    public void setAmountMethod(Integer parameter_amount) {
        this.private_integer_attribute_amount = parameter_amount;
    }
    //-------------------------------addMethod----------------------------------------------
    public Integer addMethod(ClassConstructor_Bank bankName) {
        if (!bankName.private_string_attribute_currency.equalsIgnoreCase("INR")) {
            try {
                throw new Exception("Currency Mismatch, Can't Proceed!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return bankName.private_integer_attribute_amount + this.private_integer_attribute_amount;
    }
}
