package sg.nus.iss;

import java.util.List;

public class Bank {

    private String bankName;
    private String location;
    private List<String> branches;

    public Bank() {
        System.out.println("in super class constructor");
    }
    public Bank(String bankName, String location, List<String> branches) {
        this.bankName = bankName;
        this.location = location;
        this.branches = branches;
    }
    

    public void calculateHousingLoanEMI(){
        System.out.println("In Bank Class : calculateHousingLoanEMI");

    }
    
    @Override
    public String toString() {
        return "Bank [bankName=" + bankName + ", location=" + location + ", branches=" + branches + "]";
    }

    
}
