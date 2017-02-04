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
public class Client {
    public void doSomeClientJob()
	{
                System.out.println("******************************************");
                System.out.println("Turkey Market attachment step for smartphone");
                System.out.println("******************************************");
		Cpu cpu = FactoryMaker.getFactory("TurkeyMarket").attachCpuAndRam();
		System.out.println(cpu.getterCpuModel());
                
		Display display = FactoryMaker.getFactory("TurkeyMarket").attachDisplay();
		System.out.println(display.getterDisplayModel());
                
                Battery battery = FactoryMaker.getFactory("TurkeyMarket").attachBattery();
		System.out.println(battery.getterBattery());
                
                Storage storage = FactoryMaker.getFactory("TurkeyMarket").attachStorage();
		System.out.println(storage.getterStorageModel());
                
                Camera camera = FactoryMaker.getFactory("TurkeyMarket").attachCamera();
		System.out.println(camera.getterCameraModel());
                
                PhoneCase phonecase = FactoryMaker.getFactory("TurkeyMarket").encloseThePhoneCase();
		System.out.println(phonecase.getterPhoneCaseModel());
                
                System.out.println("-------------------------------------------");
                
                System.out.println("******************************************");
                System.out.println("Global Market attachment step for smartphone.");
                System.out.println("******************************************");
                
		Cpu cpuGlobal = FactoryMaker.getFactory("GlobalMarket").attachCpuAndRam();
		System.out.println(cpuGlobal.getterCpuModel());
                
		Display displayGlobal = FactoryMaker.getFactory("GlobalMarket").attachDisplay();
		System.out.println(displayGlobal.getterDisplayModel());
                
                Battery batteryGlobal = FactoryMaker.getFactory("GlobalMarket").attachBattery();
		System.out.println(batteryGlobal.getterBattery());
                
                Storage storageGlobal = FactoryMaker.getFactory("GlobalMarket").attachStorage();
		System.out.println(storageGlobal.getterStorageModel());
                
                Camera cameraGlobal = FactoryMaker.getFactory("GlobalMarket").attachCamera();
		System.out.println(cameraGlobal.getterCameraModel());
                
                PhoneCase phonecaseGlobal = FactoryMaker.getFactory("GlobalMarket").encloseThePhoneCase();
		System.out.println(phonecaseGlobal.getterPhoneCaseModel());
                
                System.out.println("-------------------------------------------");
                
                System.out.println("******************************************");
                System.out.println("Eu Market attachment step for smartphone.");
                System.out.println("******************************************");
                
		Cpu cpuEu = FactoryMaker.getFactory("EuMarket").attachCpuAndRam();
		System.out.println(cpuEu.getterCpuModel());
                
		Display displayEu = FactoryMaker.getFactory("EuMarket").attachDisplay();
		System.out.println(displayEu.getterDisplayModel());
                
                Battery batteryEu = FactoryMaker.getFactory("EuMarket").attachBattery();
		System.out.println(batteryEu.getterBattery());
                
                Storage storageEu = FactoryMaker.getFactory("EuMarket").attachStorage();
		System.out.println(storageEu.getterStorageModel());
                
                Camera cameraEu = FactoryMaker.getFactory("EuMarket").attachCamera();
		System.out.println(cameraEu.getterCameraModel());
                
                PhoneCase phonecaseEu = FactoryMaker.getFactory("EuMarket").encloseThePhoneCase();
		System.out.println(phonecaseEu.getterPhoneCaseModel());
                
                System.out.println("-------------------------------------------");
                
                
                
	}  
}
