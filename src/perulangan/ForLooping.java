package perulangan;
public class ForLooping{
    public static void main(String[] args){
        System.out.println("== Simple For Looping ==");
        for(int i=1; i<=5; i++){
            System.out.println(i);
            System.out.println("Dewi Syarah Sofiati");
        }

        System.out.println("== For inner For ==");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print(" j:" + j);
            }
            System.out.println(" i:" + i);
        }

        System.out.println("== If inner For ==");
        for(int k=5; k>=0; k--){
            if(k==2){
                System.out.println(k);
            }
        }

        System.out.println("== For inner If ==");
        boolean value = true;
        if(value == true){
            for(int l=5; l>=0; l--){
                System.out.println(l);
            }
        }
    }
}