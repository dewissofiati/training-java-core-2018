package tipe;
public class TipeDataConversion{
    public static void main(String[] args){
        Integer intVal = 10;
        Float floatVal = 0f;
        Double doubleVal = (double) intVal * floatVal;
        System.out.println("Nilai " + intVal + " * " + floatVal + " = " + doubleVal); 

        byte varByte = 100;
		System.out.println("var byte adalah " + varByte);
		short varShort = varByte;
		System.out.println("var byte ke short adalah " + varShort);
		int varInt = varShort;
		System.out.println("var short ke int adalah " + varInt);
		long varLong = varInt;
		System.out.println("var int ke long adalah " + varLong);
		float varIntToFloat = varInt;		
		System.out.println("var int ke float adalah " + varIntToFloat);
		float varLongToFloat = varLong;
		System.out.println("var long ke float adalah " + varLongToFloat);
		double varFloatToDouble = varLongToFloat;
		System.out.println("var float ke double adalah " + varFloatToDouble);
		double varIntToDouble = varInt;
		System.out.println("var int ke double adalah " + varIntToDouble);
		double varLongToDouble = varLong;
		System.out.println("var long ke double adalah " + varLongToDouble);
    }
}