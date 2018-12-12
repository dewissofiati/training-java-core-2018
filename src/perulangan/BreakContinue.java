package perulangan;
public class BreakContinue{
    public static void main(String[] args){
        System.out.println("== Break ==");
        for(int i=0; i<=5; i++){
            if(i==3) break;
            System.out.println(i);
        }

        System.out.println("== Continue ==");
        for(int j=0; j<=5; j++){
            if(j==3) continue;
            System.out.println(j);
        }
    }
}