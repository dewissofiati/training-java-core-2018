package orientasiobjek.polimorpism;
import java.math.BigDecimal;

public class ParentOverloading{

    public void hitung() {
        System.out.println("10");
    }

    public void hitung(Integer bil1){
        System.out.println(bil1);
    }

    public void hitung(Integer bil1, Integer bil2){
        System.out.println(bil1 + bil2);
    }

    public void hitung(BigDecimal bil1, Integer bil2){
        System.out.println(bil1.add(new BigDecimal(bil2)));
    }
}