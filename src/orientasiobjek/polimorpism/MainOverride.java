package orientasiobjek.polimorpism;
public class MainOverride{
    public static void main(String[] args){
        ParentOverride ganti = new ParentOverride();
        System.out.println("nilai hitung dari parent override ");
        ganti.hitung();

        ganti = new ChildOverride();
        System.out.println("nilai hitung dari child override ");
        ganti.hitung();
    }
}