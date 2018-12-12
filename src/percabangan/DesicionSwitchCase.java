package percabangan;
public class DesicionSwitchCase{
    public static void main(String[] args){
        int nilai = 70;
        switch (nilai){
            case 90:
            System.out.println("Nilai sama dengan 90");
            break;
            case 80:
            System.out.println("Nilai sama dengan 80");
            break;
            case 70:
            System.out.println("Nilai sama dengan 70");
            break;
            default:
            System.out.println("Lain-lain");
        }

        int ip = 3;
        switch(ip){
            case 4: System.out.println("A"); break;
            case 3: System.out.println("B"); 
            case 2: System.out.println("C"); break;
            case 1: System.out.println("D"); break;
            default: System.out.println("Lain-lain");
        }
    }
}