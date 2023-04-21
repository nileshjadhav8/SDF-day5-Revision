package sg.nus.iss;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
   
    public static void main(String[] args) {
       /* 
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack); 

     int index = stack.search(2);

     System.out.println("index of 2  : " +index);

     int removedE = stack.pop();
     System.out.println(removedE);

     int peekV = stack.peek();
     System.out.println(peekV);
 */

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("apple", 1);

        map.put("orange", 2);

        map.put("mango", 3);

        //map.put("apple", 4);

       /*  for(String key: map.keySet()){
            System.out.println(map.get(key));
        }*/

       /*  for(Map.Entry<String, Integer> entry : map.entrySet()){

            String key = entry.getKey();
            int value = entry.getValue();

            System.out.println(key + " : " +value);
        }
*/

/* 
        Set<Integer> set =  new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(3);
        

        for(Integer value: set){

            System.out.println(value);

        }*/
/* 
        List<String> list = new LinkedList<String>();


        list.add("apple");
        list.add("mango");
        list.add("orange");
        list.add("apple");

      
    System.out.println( "value at index 0: " + list.get(0));
        for(String value : list){
            System.out.println(value);
        }
        
*/
/* 
    ThreadExample obj1 = new ThreadExample("thread-1");
    ThreadExample obj2 = new ThreadExample("thread-2");
    ThreadExample obj3 = new ThreadExample("thread-3");
    
    Thread thread1 = new Thread(obj1);
    Thread thread2 = new Thread(obj2);
    Thread thread3 = new Thread(obj3);
    thread1.start();
    thread2.start();
    thread3.start();

    */
/* 
    ThreadExample obj1 = new ThreadExample("thread-1");
    ThreadExample obj2 = new ThreadExample("thread-2");
    ThreadExample obj3 = new ThreadExample("thread-3");

    ExecutorService executor = Executors.newFixedThreadPool(3);
    executor.execute(obj1);
    executor.execute(obj2);
    executor.execute(obj3);
*/
   /*  AccessMethods objAccessMethods = new AccessMethods();

    objAccessMethods.firstMethod();
    System.out.println(objAccessMethods.name); ;
*/

     //   Bank bank1 = new Bank();
        Bank bank = new DBSBank();

       // DBSBank dbsBank = new Bank();

        if(bank instanceof DBSBank){

            bank.calculateHousingLoanEMI();
        }

        System.out.println(bank instanceof DBSBank);
    }

   
    }
    




