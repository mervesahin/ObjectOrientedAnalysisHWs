/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulutgraphtestdriver;

/**
 *
 * @author Merve Şahin
 */
public class BulutGraphTestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph g = new Graph();
        
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
        
        BulutGraphCustomer customer1 = new BulutGraphCustomer("merve","0",g,100);
       // BulutGraphCustomers customer2 = new BulutGraphCustomers("polat","1",g);
        
      
        
       
    }
    
}
