package sg.nus.iss.interfacepckg;

public class Car implements Startable{

    @Override
    public void start() {
      System.out.println("inside start of Car");
    }

    @Override
    public void stop() {
        System.out.println("inside stop of Car");
    }
    
}
