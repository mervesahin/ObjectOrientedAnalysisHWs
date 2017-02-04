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
public class TurkeyMarket extends Factory {
   @Override
   public  Cpu attachCpuAndRam (){
       return new TurkeyCpu();
   }
   @Override
   public  Display attachDisplay (){
       return new TurkeyDisplay();
   }
   @Override
   public  Battery attachBattery(){
       return new TurkeyBattery();
   }
   @Override
   public  Storage attachStorage(){
       return new TurkeyStorage();
   }
   @Override
   public  Camera attachCamera(){
       return new TurkeyCamera();
   }
   @Override
   public  PhoneCase  encloseThePhoneCase(){
       return new TurkeyPhoneCase();
          
   
   }
}
