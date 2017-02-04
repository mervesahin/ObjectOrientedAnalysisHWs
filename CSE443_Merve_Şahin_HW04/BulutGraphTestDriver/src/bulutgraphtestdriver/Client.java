/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulutgraphtestdriver;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Merve Şahin
 */
public class Client {
    public  static void main(String[] args){
         try {
            String hostName="BulutGraph - GraphOperation";
            Registry registry = LocateRegistry.getRegistry(8080);
            GraphOperation graphOperation =(GraphOperation) registry.lookup(hostName);
           // Compute comp = (Compute) registry.lookup(name);
            Graph g = new Graph();
            int i;
                    
        
            Vertex v1 = new Vertex("Vertex1","Ankara");
            Vertex v2 = new Vertex("Vertex2","Bolu");
            Vertex v3 = new Vertex("Vertex3","Konya");
            Vertex v4 = new Vertex("Vertex4","Nevşehir");
            Vertex v5 = new Vertex("Vertex5","Ardahan");
            Vertex v6 = new Vertex("Vertex6","Kars");

            g.addVertex(v1);
            g.addVertex(v2);
            g.addVertex(v3);
            g.addVertex(v4);
            g.addVertex(v5);
            g.addVertex(v6);

            Edge e1 = new Edge(v1, v2, 10);
            Edge e2 = new Edge(v2, v3, 20);
            Edge e3 = new Edge(v3, v4, 30);
            Edge e4 = new Edge(v4, v5, 40);
            Edge e5 = new Edge(v5, v6, 50);
            //--------------------------- TEST 1 -----------------------
            BulutGraphCustomer customer1 = new BulutGraphCustomer("merve","0",g,100);
            
            String s = graphOperation.sayHello(customer1);
            i=graphOperation.decreaseMine(customer1);
            customer1.setCreditCount(i);
            System.out.println("Server Client connection is provided "+s+"customer credit count is :"+i);
            
            String s1 = graphOperation.sayHello(customer1);
            i=graphOperation.decreaseMine(customer1);
            customer1.setCreditCount(i);
            System.out.println("Server Client connection is provided "+s1+"customer credit count is :"+i);
            
            String s2 = graphOperation.sayHello(customer1);
            i=graphOperation.decreaseMine(customer1);
            customer1.setCreditCount(i);
            System.out.println("Server Client connection is provided "+s2+"customer credit count is :"+i);
            
            graphOperation.shortestPathOperation(customer1, g,v1, v2);
            i=graphOperation.decreaseMine(customer1);
            customer1.setCreditCount(i);
            graphOperation.hamiltonCycleOperation(customer1,g,v1);
            i=graphOperation.decreaseMine(customer1);
            customer1.setCreditCount(i);
            
            String s3 = graphOperation.sayHello(customer1);
            i=graphOperation.decreaseMine(customer1);
            customer1.setCreditCount(i);
            System.out.println("Server Client connection is provided "+s3+"customer credit count is :"+i);
            
    
        }catch (Exception e) {
            System.err.println("ComputePi exception:");
            e.printStackTrace();
        }
    }
    

}
