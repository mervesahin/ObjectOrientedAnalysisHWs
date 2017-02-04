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
public class EuMarket extends Factory {
  @Override
   public  Cpu attachCpuAndRam (){
       return new EuCpu();
   }
   @Override
   public  Display attachDisplay (){
       return new EuDisplay();
   }
   @Override
   public  Battery attachBattery(){
       return new EuBattery();
   }
   @Override
   public  Storage attachStorage(){
       return new EuStorage();
   }
   @Override
   public  Camera attachCamera(){
       return new EuCamera();
   }
   @Override
   public  PhoneCase  encloseThePhoneCase(){
       return new EuPhoneCase();
           
   }
}
