package perulangan;
public class DoWhileLooping{
    public static void main(String[] args){
        int i=5;
        System.out.println("== While Loop ==");
        while(i>=0){
            System.out.println(i);
            i--;
        }

        System.out.println("== Do While Loop ==");
        int j=5;
        do{
            System.out.println(j);
            j--;
        }while(j>=0);
    }
}