import java.util.*;

public class Problem4 {

    HashMap<String,Set<String>> ngrams = new HashMap<>();

    void indexDocument(String docId,String text){

        String[] words=text.split(" ");

        for(int i=0;i<words.length-4;i++){

            String gram = words[i]+" "+words[i+1]+" "+words[i+2]+" "+words[i+3]+" "+words[i+4];

            ngrams.putIfAbsent(gram,new HashSet<>());
            ngrams.get(gram).add(docId);
        }
    }

    int analyze(String text){

        String[] words=text.split(" ");
        int matches=0;

        for(int i=0;i<words.length-4;i++){

            String gram = words[i]+" "+words[i+1]+" "+words[i+2]+" "+words[i+3]+" "+words[i+4];

            if(ngrams.containsKey(gram)){
                matches++;
            }
        }

        return matches;
    }

    public static void main(String[] args){

        Problem4 p = new Problem4();

        p.indexDocument("doc1","this is a sample document for plagiarism detection system");

        System.out.println("Matches: "+p.analyze("this is a sample document for checking plagiarism"));
    }
}