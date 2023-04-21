package sg.nus.iss;

public class DBSBank extends Bank{

    DBSBank(){
        super(); //to call super class constroctor
    }

    @Override
    public void calculateHousingLoanEMI(String str){

        super.calculateHousingLoanEMI(); ///to call super class method
        System.out.println("In DBS Class : calculateHousingLoanEMI");

    }
    
}
