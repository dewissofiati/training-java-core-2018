package operator;
public class OperatorPerbandingan{
    public static void main(String[] args){
        Integer value = 10 - 20;
        System.out.println("Apakah 10 - 20 hasilnya -10 ? " + (value == -10));
        Integer value2 = 10 + 20;
        System.out.println("Apakah 10 + 20 hasilnya 40 ? " + ((value2 == 40) ? "Benar" : "Salah!"));

        //Konversi Tipe Data Manually
        // Integer value3 = 10;
        // Double valueConverted =Double value;
        // System.out.println("Hasil Konversi: " + valueConverted);
    }
}