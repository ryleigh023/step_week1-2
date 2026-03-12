public class Problem8 {

    String[] spots=new String[500];

    int hash(String plate){
        return Math.abs(plate.hashCode())%spots.length;
    }

    int park(String plate){

        int index=hash(plate);

        while(spots[index]!=null){
            index=(index+1)%spots.length;
        }

        spots[index]=plate;
        return index;
    }

    void exit(String plate){

        for(int i=0;i<spots.length;i++){

            if(plate.equals(spots[i])){
                spots[i]=null;
                break;
            }
        }
    }

    public static void main(String[] args){

        Problem8 lot=new Problem8();

        System.out.println("Spot: "+lot.park("ABC1234"));
    }
}