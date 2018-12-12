package orientasiobjek.konstruktor;
import java.math.BigDecimal;

public class Deposito {

    protected boolean active;
    protected BigDecimal saldo;

    // this is constructor
    public Deposito(){
        this.active = false;
        this.saldo = new BigDecimal(0);
    }

    public Deposito(boolean isActive, BigDecimal saldo){
        this.active = isActive;
        this.saldo = saldo;
    }
}