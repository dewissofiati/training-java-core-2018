package tipe;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class TipeDataDate{
    public static void main(String[] args){
        Date tanggalSekarang = new Date();
        System.out.println("Tanggal Sekarang adalah " + tanggalSekarang);
        Date tanggalNow = new Date();
        // tanggalnya di format sesuai yang kita inginkan
	    SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy hh:mm:ss z");
        System.out.println("Tanggal Sekarang adalah " + sdf.format(tanggalNow));
        LocalDate tanggalHariIni = LocalDate.now();
        System.out.println(
            "Tanggal sekarang adalah " + 
            tanggalHariIni);
        LocalDate kemarin = LocalDate.of(2017, 10, 2);
        System.out.println(
            "Tanggal kemarin adalah " + 
            kemarin);
    }
}