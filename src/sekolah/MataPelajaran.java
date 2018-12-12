package sekolah;

public class MataPelajaran{

    private String NamaPelajaran;
    private int nilaiSiswa;

    public String getNamaPelajaran() {
        return NamaPelajaran;
    }

    public void setNamaPelajaran(String namaPelajaran) {
        NamaPelajaran = namaPelajaran;
    }

    public int getNilaiSiswa() {
        return nilaiSiswa;
    }

    public void setNilaiSiswa(int nilaiSiswa) {
        this.nilaiSiswa = nilaiSiswa;
    }
}