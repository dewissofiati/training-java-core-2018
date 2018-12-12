package orientasiobjek.pewarisan;
public class ZX10RR implements SportBike{
    public boolean raceMode(){
        return true;
    }
    public static void main(String[]args){
        ZX10RR rea = new ZX10RR();
        System.out.println(
            "Engine : [ engineBlock : " + rea.engineBlock + ", cylinder : " + rea.cylinder + "], breaking system : [ abs : " + rea.abs + "], profile race mode is " + rea.raceMode()
        );
    }
}