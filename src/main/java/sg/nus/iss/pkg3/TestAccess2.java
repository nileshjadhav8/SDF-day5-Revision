package sg.nus.iss.pkg3;

import sg.nus.iss.pkg1.ProtectedExample;

public class TestAccess2 {

    public static void main(String[] args){
        ProtectedExample obj = new ProtectedExample();

        obj.testMethod2(); //compile time error

    }
    
}
