import java.util.*;

class TokenBucket{

    int tokens=1000;
}

public class Problem6{

    HashMap<String,TokenBucket> clients = new HashMap<>();


    boolean checkRateLimit(String clientId){

        clients.putIfAbsent(clientId,new TokenBucket());

        TokenBucket bucket=clients.get(clientId);

        if(bucket.tokens>0){
            bucket.tokens--;
            return true;
        }

        return false;
    }

    public static void main(String[] args){

        Problem6 limiter=new Problem6();

        System.out.println(limiter.checkRateLimit("abc123"));
    }
}