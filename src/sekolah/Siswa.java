package sekolah;

public class Siswa{
    private Integer idSiswa;
    private Integer jumlahMataPelajaran;
    private MataPelajaran mataPelajaran[] = new MataPelajaran[10];
    private String namaSiswa;

    public Integer getIdSiswa() {
        return idSiswa;
    }

    public void setIdSiswa(Integer idSiswa) {
        this.idSiswa = idSiswa;
    }

    public Integer getJumlahMataPelajaran() {
        return jumlahMataPelajaran;
    }

    public void setJumlahMataPelajaran(Integer jumlahMataPelajaran) {
        this.jumlahMataPelajaran = jumlahMataPelajaran;
    }

    public MataPelajaran[] getMataPelajaran() {
        return mataPelajaran;
    }

    public void setMataPelajaran(MataPelajaran[] mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }

    public String getNamaSiswa() {
        return namaSiswa;
    }

    public void setNamaSiswa(String namaSiswa) {
        this.namaSiswa = namaSiswa;
    }
}