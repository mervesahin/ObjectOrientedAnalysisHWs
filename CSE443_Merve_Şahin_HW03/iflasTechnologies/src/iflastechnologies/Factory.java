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
public abstract class Factory {
   public abstract Cpu attachCpuAndRam ();
   public abstract Display attachDisplay ();
   public abstract Battery attachBattery();
   public abstract Storage attachStorage();
   public abstract Camera attachCamera();
   public abstract PhoneCase  encloseThePhoneCase();
    
}
