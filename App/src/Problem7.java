import java.util.*;

public class Problem7 {

    HashMap<String,Integer> queries = new HashMap<>();

    void updateFrequency(String q){
        queries.put(q,queries.getOrDefault(q,0)+1);
    }

    List<String> search(String prefix){

        List<String> list=new ArrayList<>();

        for(String q:queries.keySet()){
            if(q.startsWith(prefix)){
                list.add(q);
            }
        }

        list.sort((a,b)->queries.get(b)-queries.get(a));

        return list;
    }

    public static void main(String[] args){

        Problem7 auto=new Problem7();

        auto.updateFrequency("java tutorial");
        auto.updateFrequency("javascript");

        System.out.println(auto.search("jav"));
    }
}