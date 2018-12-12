package objekorientasi.enkaptulasi;

public class ChildClass extends ParentClass {

    // @Override
    public String hitung(){
        return "Child class";
    }

    public void dariKelasIni(){
        System.out.println(this.hitung());
    }

    public void dariKelasInduk(){
        System.out.println(super.hitung());
    }
}