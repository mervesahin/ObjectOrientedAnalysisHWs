/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficlightdemo;

/**
 *
 * @author Merve Şahin
 */
public interface Subject {
    public void addObserver(TrafficLight t);
    public void deleteObserver(TrafficLight t);
    public void notifyObservers();
  
}
