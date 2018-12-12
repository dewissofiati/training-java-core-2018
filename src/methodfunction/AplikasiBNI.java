package methodfunction;
public class AplikasiBNI{
    public static void main(String[] args){
        //memanggil method hitungBunga yg berada di class aplikasiDeposito
        AplikasiDeposito appDepo = new AplikasiDeposito();
        int a = appDepo.hitungBunga(3);

        //memanggil method hitungBunga yang berada di class aplikasiKredit
        AplikasiKredit appKredit = new AplikasiKredit();
        int b = appKredit.hitungBunga(5);

        System.out.println(a +" "+ b);
    }
}