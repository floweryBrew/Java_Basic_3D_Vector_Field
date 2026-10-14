package classes;

public class dot {
    int xPos;
    int yPos;
    int zPos;
    
    public dot(int xIn,int yIn,int zIn){
        xPos=xIn;
        yPos=yIn;
        zPos=zIn;
    }
    
    
    public void setPos(int xPosIn,int yPosIn,int zPosIn){
        xPos=xPosIn;
        yPos=yPosIn;
        zPos=zPosIn;
    }
    
    public void setXPos(int xPosIn){
        xPos=xPosIn;
    }
    public void setYPos(int yPosIn){
        yPos=yPosIn;
    }
    public void setZPos(int zPosIn){
        zPos=zPosIn;
    }
    
    
    public int getXPos(){
        return xPos;
    }
    public int getYPos(){
        return yPos;
    }
    public int getZPos(){
        return zPos;
    }
}
