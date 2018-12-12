package arraylima;

public class ArrayPredefined{

    public static void main(String[] args){
        Integer[] values = new Integer[10];
        values[0] = 1;
        values[1] = 10;
        for(int i=0; i<values.length; i++){
            System.out.println("1 = " + i + " bernilai " + values[i]);
        }
    }
}