import java.util.*;

public class Problem10 {

    LinkedHashMap<String,String> L1 = new LinkedHashMap<>(10000,0.75f,true);
    HashMap<String,String> L2 = new HashMap<>();

    String getVideo(String id){

        if(L1.containsKey(id)){
            return "L1 HIT";
        }

        if(L2.containsKey(id)){

            String data=L2.get(id);
            L1.put(id,data);

            return "L2 HIT → Promoted to L1";
        }

        String data="VideoData";
        L2.put(id,data);

        return "Database HIT";
    }

    public static void main(String[] args){

        Problem10 cache=new Problem10();

        System.out.println(cache.getVideo("video123"));
        System.out.println(cache.getVideo("video123"));
    }
}