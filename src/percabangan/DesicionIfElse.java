package percabangan;
public class DesicionIfElse{
    public static void main(String[] args){
        // IF
        System.out.println("=== IF ===");
        int bil1 = 10;
        if(bil1 == 10){
            System.out.println("Value bil1 adalah " + bil1);
        }

        // IF ELSE
        System.out.println("=== IF ELSE ===");
        int bil2 = 10;
        if(bil2 == 20){
            System.out.println("Value bil2 adalah " + bil2);
        }else{
            System.out.println("Value bil2 bukan 20");
        }

        String str = "halo";
        if(str.equals("Halo")){
            System.out.println("Penulisan sama");
        }else{
            System.out.println("Penulisan beda");
        }

        // IF ELSE IF
        System.out.println("=== IF ELSE IF ===");
        int nilai = 75;
        if(nilai >= 80){
            System.out.println("A");
        }else if(nilai >=70){
            System.out.println("B");
        }else if(nilai >= 60){
            System.out.println("C");
        }else if(nilai >= 50){
            System.out.println("D");
        }else{
            System.out.println("E");
        }
    }
}