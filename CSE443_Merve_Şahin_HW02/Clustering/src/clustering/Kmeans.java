/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clustering;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author Merve Şahin
 */
public class Kmeans extends Clustering{
    int k ; //grup sayisi
    String typeOfAlgorithm;
    public Kmeans(){
        k = 2; //default olarak 2 gruba ayırsın.
        typeOfAlgorithm = "Euclidian";
    }
   
    public void initializeClusteringParameters(){
        String type;
        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter group size for K-means algorithm>>");
        size = input.nextInt();
        if(size == 1 || size <= 0){
            System.out.println("İllegal argument for group size");
            System.out.println("Exiting...");
            System.exit(0);
        }
        else
            k = size;
        
        System.out.println("Enter algoritmm type for calculate distance (for K-means Euclidean or Manhattan)>>"); 
        type = input.next();
        if(type.equalsIgnoreCase("Euclidean")){
           typeOfAlgorithm = "Euclidean" ;  
        }
        else if(type.equalsIgnoreCase("Manhattan")){
            typeOfAlgorithm = "Manhattan" ;  
        }
        else{
            System.out.println("Type of Algorithm not found");
            System.out.println("Exiting...");
            System.exit(0);
        }
          
    }  
    public  void Clustering(){
        clusteringVector[] randomCenter;
        randomCenter = new clusteringVector[k];
        clusteringVector[] oldCenter = new clusteringVector[k]; ;
        double differenceCenter =0.0;
        
        Double[] doubleArray = new Double [25000000]; ///2000 lik array yeticek mi ?
        //List<Integer> intList = Arrays.asList(intArray);
        List<Double[]> doubleList = new ArrayList<Double[]>();
        Random rand = new Random();
        for(int i=0; i<randomCenter.length;++i){
            
           
            int  n = rand.nextInt(this.getSize());
           
            randomCenter[i] = this.getter(n);
            //System.out.println("*****"+randomCenter[i]);
            
        }   
       // System.out.println("randm : "+ randomCenter.length);
        int temp;
        double min ;
        int i=0;
        double X=0.0,Y=0.0,Z=0.0;
        int counter =0;
        int countOfGroup=0;
        List<Double[]> newList;

        temp=k;
        do{
           
            while(temp!=0){  ///k diyelim 3 olsun. ilk 3 ü random ım
               // System.out.println("getsize : "+ this.getSize());
               counter=0;         
               oldCenter[temp-1] = randomCenter[temp-1];
               for(int l=k;l<this.getSize();++l){
                   
                  if(typeOfAlgorithm.equals("Manhattan"))
                    doubleArray[l-k] = CalculateDistanceForEachCenterWithManhattan(this.getter(l),randomCenter[temp-1]);   
                  else if(typeOfAlgorithm.equals("Euclidean"))
                    doubleArray[l-k] = CalculateDistanceForEachCenter(this.getter(l),randomCenter[temp-1]);
                  
                  
                 // System.out.println("siralanmamsı   " + CalculateDistanceForEachCenter(this.getter(l),randomCenter[temp-1]));
                  ++counter;
               } 

               doubleList.add(doubleArray);
               doubleArray = new Double [25000000];
                ++i;      
                --temp;  //random merkez sayısı azaltılır,diğer merkez için donu doner
            }
        
            newList = findLabel(doubleList,counter);
            for(int k = 0; k < newList.size(); ++k){
                for(int j = 0; j < counter ; ++j){
                    
                    if(newList.get(k)[j]!=-1){
                       X += this.getter(k).getX();
                       Y += this.getter(k).getY();
                       Z += this.getter(k).getZ();
                       ++countOfGroup;

                    }
                }
                randomCenter[k].setX((int)X/countOfGroup);
                randomCenter[k].setY((int)Y/countOfGroup);
                randomCenter[k].setZ((int)Z/countOfGroup);
                countOfGroup=0;
                X=0.0; Y=0.0; Z=0.0;
                
               differenceCenter=CalculateDistanceForEachCenter(oldCenter[k],randomCenter[k]);
                //System.out.println("difference"+differenceCenter);
                
            }  
         
        }while(differenceCenter>0.001);
         
        //3System.out.println("**"+newList.size());
        
        for(int m=0;m<newList.size();++m){
            System.out.println("*************");
            System.out.println("Center["+m+"]:"+randomCenter[m]);
        }
            
        
        
         /*for(i = 0; i < newList.size(); ++i){
            for(int j = 0; j < counter; ++j)
            System.out.println("etiketlenmis liste" + newList.get(i)[j]  );
         System.out.println("-------------------------------------------");
        }*/
    }
    public  void printClusteringOutput(){
     
     ////////////
    }
   
    
    
    //distance = Noktaların farklarının karelerinin toplamının karekökü Euclidan ile
    private double CalculateDistanceForEachCenter(clusteringVector dot1,clusteringVector dot2){
        int distanceX = dot1.getX()- dot2.getX();
        int distanceY = dot1.getY()- dot2.getY();
        int distanceZ = dot1.getZ()- dot2.getZ();
        return Math.sqrt(Math.pow(distanceX,2)+  Math.pow(distanceY,2) + Math.pow(distanceZ,2));
    }
    
    //distance = |x1-x2| + |y1-y2| + |z1-z2| with Manhattan
    private double CalculateDistanceForEachCenterWithManhattan(clusteringVector dot1,clusteringVector dot2){
        int distanceX = dot1.getX()- dot2.getX();
        int distanceY = dot1.getY()- dot2.getY();
        int distanceZ = dot1.getZ()- dot2.getZ();
        return (Math.abs(distanceX)+  Math.abs(distanceY) + Math.abs(distanceZ));
    }
 
     private List<Double[]> findLabel(List<Double[]> doubleList,int counter){
        
        double min=0.0;
        int minLabel = 0;
        Double[] doubleArray = new Double [25000000]; ///2000 lik array yeticek mi ?
        List<Double[]> labelList = new ArrayList<Double[]>();
        for(int i = 0; i < doubleList.size(); ++i){
            doubleArray = new Double [25000000]; ///2000 lik array yeticek mi ?
            for(int j = 0; j < counter; ++j)
                 doubleArray[j]=-1.0;
            labelList.add(doubleArray);
        }
        /*for(int i = 0; i < doubleList.size(); ++i){
            for(int j = 0; j < counter; ++j)
            System.out.println("**"+ doubleList.get(i)[j]  );
          System.out.println("____________________________________");
        }  */
        for(int i = 0; i < counter; ++i) {
              min = doubleList.get(0)[i];
              minLabel = 0;
            for(int j=1; j<doubleList.size()-1;++j){
                   if(doubleList.get(j+1)[i] < min){
                       min = doubleList.get(j+1)[i];
                       minLabel = j+1;
                      // System.out.println("*****");
                   }
                   /// System.out.println("*********--**");
              }   
              labelList.get(minLabel)[i] = min;
            
        }
        /*for(int i = 0; i < doubleList.size(); ++i){
            for(int j = 0; j < counter; ++j)
            System.out.println("etiketlenmis liste" + labelList.get(i)[j]  );
         System.out.println("-------------------------------------------");
        }*/
        return doubleList;
    }  
}  
    
 
