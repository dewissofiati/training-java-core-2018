package orientasiobjek.polimorpism;
import java.math.BigDecimal;

public class MainOverloading{

    public static void main(String[] args){
        ParentOverloading calkulator = new ParentOverloading();
        calkulator.hitung(); // out -> 10
        calkulator.hitung(20); // out -> 20
        calkulator.hitung(10, 20); // out -> 30
        calkulator.hitung(new BigDecimal(1000), 10); // out -> 1010
    }
}