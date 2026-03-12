import java.util.*;

public class Problem1 {

    HashMap<String, Integer> users = new HashMap<>();
    HashMap<String, Integer> attempts = new HashMap<>();
    int userIdCounter = 1;

    boolean checkAvailability(String username){
        attempts.put(username, attempts.getOrDefault(username,0)+1);
        return !users.containsKey(username);
    }

    void registerUser(String username){
        users.put(username,userIdCounter++);
    }

    List<String> suggestAlternatives(String username){
        List<String> list = new ArrayList<>();
        list.add(username+"1");
        list.add(username+"2");
        list.add(username.replace("_","."));
        return list;
    }

    String getMostAttempted(){
        String result="";
        int max=0;

        for(String key: attempts.keySet()){
            if(attempts.get(key)>max){
                max=attempts.get(key);
                result=key;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Problem1 system = new Problem1();

        system.registerUser("john_doe");

        System.out.println(system.checkAvailability("john_doe"));
        System.out.println(system.checkAvailability("jane_smith"));
        System.out.println(system.suggestAlternatives("john_doe"));
    }
}