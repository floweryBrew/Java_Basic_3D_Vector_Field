package classes;

public class physicsObject_pointMass extends physicsObject{
    int mass;
    
    public physicsObject_pointMass(dot posIn,int massIn){
        super(posIn);
        mass=massIn;
    }
    
    public int getMass(){
        return mass;
    }
}
