import java.util.*;

public class Problem2 {

    HashMap<String,Integer> stock = new HashMap<>();
    HashMap<String,Queue<Integer>> waiting = new HashMap<>();

    void addProduct(String productId,int count){
        stock.put(productId,count);
        waiting.put(productId,new LinkedList<>());
    }

    synchronized String purchaseItem(String productId,int userId){

        int s = stock.getOrDefault(productId,0);

        if(s>0){
            stock.put(productId,s-1);
            return "Success, remaining "+(s-1);
        }

        waiting.get(productId).add(userId);
        return "Added to waiting list position "+waiting.get(productId).size();
    }

    int checkStock(String productId){
        return stock.getOrDefault(productId,0);
    }

    public static void main(String[] args){

        Problem2 sale = new Problem2();

        sale.addProduct("IPHONE15",5);

        System.out.println(sale.purchaseItem("IPHONE15",101));
        System.out.println(sale.purchaseItem("IPHONE15",102));
    }
}