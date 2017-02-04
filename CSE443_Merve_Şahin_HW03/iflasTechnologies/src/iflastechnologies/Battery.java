/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iflastechnologies;

/**
 *
 * @author Merve Şahin
 */
public abstract class Battery {
    protected final String BatteryModel;
    
    public Battery(String theBatteyModel){
        BatteryModel = theBatteyModel; 
    }
    public String getterBattery(){
        return BatteryModel;
    }
    
}
