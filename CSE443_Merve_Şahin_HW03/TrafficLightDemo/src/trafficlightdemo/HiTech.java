/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficlightdemo;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Merve Şahin
 */
public class HiTech implements Subject {
    private List observers; //Observerların listesi
    private boolean flag = false;
    
    public HiTech(){
        observers = new ArrayList();
    }
    public void addObserver(TrafficLight t){
        observers.add(t);
    }
    public void deleteObserver(TrafficLight t){
        int i=observers.indexOf(t);
        if(i>=0){
            observers.remove(i);
        }
    }
    public void notifyObservers(){
        for(int i=0; i<observers.size();++i){
            TrafficLight l = (TrafficLight)observers.get(i);
            l.update(flag);
        }      
    }
    public void changeDetected(boolean flag){
        notifyObservers();
    }
    public void setterFlag(boolean flag){
        this.flag = flag;
        changeDetected(flag);
    }
    public boolean getterFlag(){
        return flag;
    } 
}
