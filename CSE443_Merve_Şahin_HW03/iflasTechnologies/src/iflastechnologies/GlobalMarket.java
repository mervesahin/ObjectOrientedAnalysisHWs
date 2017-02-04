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
public class GlobalMarket extends Factory{
  @Override
   public  Cpu attachCpuAndRam (){
       return new GlobalCpu();
   }
   @Override
   public  Display attachDisplay (){
       return new GlobalDisplay();
   }
   @Override
   public  Battery attachBattery(){
       return new GlobalBattery();
   }
   @Override
   public  Storage attachStorage(){
       return new GlobalStorage();
   }
   @Override
   public  Camera attachCamera(){
       return new GlobalCamera();
   }
   @Override
   public  PhoneCase  encloseThePhoneCase(){
       return new GlobalPhoneCase();
   }
}
