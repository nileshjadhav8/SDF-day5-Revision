package sg.nus.iss;

public class OverloadingExample {

    public void overLoadingMethod1(String str){

         System.out.println("method 1" +str);
    }

    public void overLoadingMethod1(Integer i){

        System.out.println("method 2" +i);
   }

   public void overLoadingMethod1(String str1, String str2){
    System.out.println("method 3" +str1 + " : " +str2);
}

public void overLoadingMethod1(){

    System.out.println("method 4");
}
    
}
