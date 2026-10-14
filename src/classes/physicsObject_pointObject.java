package classes;

public class physicsObject_pointObject extends physicsObject {
    int charge;
    int mass;
    
    public physicsObject_pointObject(dot posIn,int chargeIn,int massIn){
        super(posIn);
        charge=chargeIn;
        mass=massIn;
    }
    
    public int getCharge(){
        return charge;
    }
    
    public int getMass(){
        return mass;
    }
}
