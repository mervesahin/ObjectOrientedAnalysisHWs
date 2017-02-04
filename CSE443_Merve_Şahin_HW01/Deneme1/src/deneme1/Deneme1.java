/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme1;

/**
 *
 * @author Merve Şahin
 */

import vpt.Image;
import vpt.algorithms.display.Display2D;
import vpt.algorithms.io.Load;

public class Deneme1 {
	public static void main(String[] args) {
		// Goruntu belgesini diskten bellege aktar
		Image img = Load.invoke("C:\\Users\\Merve Şahin\\Documents\\NetBeansProjects\\Deneme1\\src\\deneme1\\lennaGray.png");
		Display2D.invoke(img);
		// genisligi ogren
		int genislik = img.getXDim();
		
		// yuksekligi ogren
		int yukseklik = img.getYDim();
		System.err.println(genislik + " " + yukseklik);

		// ayni boyutta bos goruntu olustur
		//Image copy = img.newInstance(false);
               
		//Display2D.invoke(copy);
		// 100, 100 konumundaki degeri oku
		//int p = img.getXYByte(100, 100);
		//System.err.println(p);
		
                Image copy = img.newInstance(true);
                averageWithSmooting i = new averageWithSmooting();
                i.smooth(copy);
                Display2D.invoke(copy);
                
                Image copy2 = img.newInstance(true);
                medianWithSmooting i2 = new medianWithSmooting();
                i2.smooth(copy2);
                Display2D.invoke(copy2);
                
                Image copy3 = img.newInstance(true);
                morphoInt i3 = new morphoInt();
                i3.dedection(copy3);
                Display2D.invoke(copy3);
                
                Image copy4 = img.newInstance(true);
                morphoExt i4 = new morphoExt();
                i4.dedection(copy4);
                Display2D.invoke(copy4);
		
		// 100, 100 konumuna yeni deger ata
		//img.setXYByte(100, 100, 255);
		
		// yeniden goruntule
		//Display2D.invoke(img);		
	}
}

