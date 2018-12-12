package orientasiobjek;
public class Sepeda{
    private int roda = 2;
    private int kecepatan = 0;

    public void meningkatkanSpeed(int value){
        this.kecepatan = this.kecepatan + value;
    }
    public void menurunkanSpeed(int value2){
        this.kecepatan = this.kecepatan - value2;
    }
    public int kecepatanSekarang() {
        return this.kecepatan;
    }
}