package tipe;
public class TipeDataBoolean{
    public static void main(String[] args){
        Boolean isValid = true;
        System.out.println(
            "Nilai dari variable isValid adalah " + (isValid ? "Benar" : "Salah"));

        Integer bilanganBulat = 10;
        Boolean isZero = (bilanganBulat == 10);
        System.out.println(
            "Variable bilangan apakah sama dengan 10 : " + (isZero ? "Ya benar" : "Anda salah"));
    }
}