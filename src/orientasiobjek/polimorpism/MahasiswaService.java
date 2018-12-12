package orientasiobjek.polimorpism;
public class MahasiswaSercive extends Service{
    public String cari(){
        return "Ketemu";
    }

    public String cari(String nama, int angkatan){
        return new StringBuilder(nama).append(" ").append(angkatan).toString();
    }

    public String cari(int angkatan){
        return angkatan.toString();
    }
}