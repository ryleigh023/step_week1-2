import java.util.*;

public class Problem5 {

    HashMap<String,Integer> pageViews = new HashMap<>();
    HashMap<String,Set<String>> visitors = new HashMap<>();
    HashMap<String,Integer> sources = new HashMap<>();

    void processEvent(String url,String user,String source){

        pageViews.put(url,pageViews.getOrDefault(url,0)+1);

        visitors.putIfAbsent(url,new HashSet<>());
        visitors.get(url).add(user);

        sources.put(source,sources.getOrDefault(source,0)+1);
    }

    void showTopPages(){

        pageViews.entrySet()
                .stream()
                .sorted((a,b)->b.getValue()-a.getValue())
                .limit(10)
                .forEach(System.out::println);
    }

    public static void main(String[] args){

        Problem5 a = new Problem5();

        a.processEvent("/news","user1","google");
        a.processEvent("/news","user2","facebook");

        a.showTopPages();
    }
}