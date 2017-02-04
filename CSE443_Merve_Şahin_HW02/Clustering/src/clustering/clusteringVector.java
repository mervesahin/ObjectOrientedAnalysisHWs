/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clustering;

/**
 *
 * @author Merve Şahin
 */
import java.util.*;
public class clusteringVector {
    
    private int x;
    private int y;
    private int z;
    clusteringVector(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    clusteringVector(){
        x=0;
        y=0;
        z=0;
    }
    public void setX(int newX){
        x=newX;
    }
    public void setY(int newY){
        y=newY;
    }
    public void setZ(int newZ){
        z=newZ;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getZ(){
        return z;
    }
    public void setXYZ(int newX,int newY,int newZ){
        x=newX;
        y=newY;
        z=newZ;
    }
    public String toString(){
       return String.format("%s %s %s" ,getX(),getY(),getZ());
    }
    
}
