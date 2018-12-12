package arraylima;

import java.util.List;
import java.util.Arrays;
import java.math.BigDecimal;

public class ForEachWithArray {

    public static void main(String[] args){
        List<Object> values = Arrays.asList(
                "Dimas Maryanto",
                23,
                false,
                new BigDecimal(100000),
                20.5d
        );

        for(Object value : values){
            System.out.println(value);
        }
    }
}