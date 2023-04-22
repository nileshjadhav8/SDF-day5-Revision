package sg.nus.iss.interfacepckg;

public class WashingMachine implements Startable{

    @Override
    public void start() {
      System.out.println("inside start of washing machine");
    }

    @Override
    public void stop() {
    System.out.println("inside stop of washing machine");   
    }
    
}
