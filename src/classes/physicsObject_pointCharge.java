package classes;

public class physicsObject_pointCharge extends physicsObject {
    int charge;
    
    public physicsObject_pointCharge(dot posIn,int chargeIn){
        super(posIn);
        charge=chargeIn;
    }
    
    public int getCharge(){
        return charge;
    }
}
