package methodfunction;
public class MethodCallMethod{

    //tanpa argumen
    public static String namaDepan(){
        return "Dewi Syarah";
    }
    public static String namaBelakang(){
        return "Sofiati";
    }

    //dengan argumen

    public static void sayHalo(String nama){
        System.out.println("Halo! ");
    }
    public static void main(String[] args){
        sayHalo(" semuanya ");
        System.out.println("Nama lengkap saya adalah " + namaDepan() + " " + namaBelakang());
        sayHai("Dewi Syarah", "Sofiati", 21);
    }

    //multi parameter dalam satu method
    public static void sayHai(String firstName, String lastName, int umur){
        StringBuilder sb = new StringBuilder();
        sb.append(firstName).append(" ").append(lastName);
        String fullName = sb.toString();
        System.out.println("Halo nama lengkap saya adalah " + fullName + " dan umur saya " + umur);
        System.out.println("Halo nama lengkap saya adalah " + firstName + " " + lastName);
    }
}