package orientasiobjek;
public class MainSepeda{
    public static void main(String[] args){
        Sepeda ontel = new Sepeda();
        ontel.meningkatkanSpeed(20);
        int a = ontel.kecepatanSekarang();
        System.out.println("Kecepatan sepeda ontel saat ini adalah " + a);

        Sepeda balap = new Sepeda();
        balap.meningkatkanSpeed(120);
        int b = balap.kecepatanSekarang();
        System.out.println("Keceparan sepeda balap saat ini adalah " + b);
    }
}