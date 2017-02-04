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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Graph<T>implements Serializable{  //T for generic type in java
    
    //mark unvisited node
    public static final int VISIT_COLOR_WHITE = 1;
    public static final int VISIT_COLOR_GREY = 2;
    public static final int VISIT_COLOR_BLACK = 3;
    
    /** vertexlerin listesi */
    private List<Vertex<T>> verticies;
    /** edgelerin listesi */
    private List<Edge<T>> edges;
    /*root node*/
    private Vertex<T> rootVertex;
    /*Constructor vertex ve edge listesine yer alir new ile*/
    public Graph() {
        verticies = new ArrayList<Vertex<T>>();
        edges = new ArrayList<Edge<T>>();
    }   
    public boolean isEmpty() {
        return verticies.size() == 0;
    }
    /*Grapha yeni bir vertex ekler ekleme islemi basarı ile tamamlandı ise true dondurur*/
    public boolean addVertex(Vertex<T> v) {
        boolean added = false;
        if (verticies.contains(v) == false) {
          added = verticies.add(v);
        }
        return added;
    }
    /*Vertex sayisini verir*/
    public int size() {
        return verticies.size();
    }
    
    /*root'u dondurur*/
    public Vertex<T> getRootVertex() {
        return rootVertex;
    }
    /*Verilen Vertex'i root node yapar*/
    public void setRootVertex(Vertex<T> root) {
        this.rootVertex = root;
        if (verticies.contains(root) == false)
          this.addVertex(root);
    }
    /*n'inci indexteki vertexİ return eder*/
    public Vertex<T> getVertex(int n){
        return verticies.get(n);
    }
    
    /**Vertex lerin listesini return eder*/
    public List<Vertex<T>> getVerticies() {
        return this.verticies;
    }
    /*source ve destination olan vertexleri alır
    Vertexlerin graph içerisinde olup olmadıgını kontrol eder
    Source ve ya destination vertexi yoksa exception fırlatır.
    O source ve destination a ait bir edge yoksa edge oluşturup edge
    listesine ekler*/
    public boolean addEdge(Vertex<T> from, Vertex<T> to, int cost) throws IllegalArgumentException{
        if (verticies.contains(from) == false)
            throw new IllegalArgumentException("from is not in graph");
        if (verticies.contains(to) == false)
            throw new IllegalArgumentException("to is not in graph");

        Edge<T> e = new Edge<T>(from, to, cost);
        if (from.findEdge(to) != null)
            return false;
        else {
            from.addEdge(e);
            to.addEdge(e);
            edges.add(e);
            return true;
        }
    }
    
    /*Yön kontrolü*/
    public boolean insertBiEdge(Vertex<T> from, Vertex<T> to, int cost)
                                       throws IllegalArgumentException {
        return addEdge(from, to, cost) && addEdge(to, from, cost);
    }
    /*Edge listesi return eder*/
    public List<Edge<T>> getEdges() {
        return this.edges;
    }
    /*Vertex remove eder
    Eger vertex vertex listesinde bulunmuyor ise false return eder
    Eger Remove edilmek istenen vertex root node ise root node null olur
    */
    public boolean removeVertex(Vertex<T> v) {
        if (!verticies.contains(v))
          return false;

        verticies.remove(v);
        if (v == rootVertex)
          rootVertex = null;

        // Remove the edges associated with v
        for (int n = 0; n < v.getOutgoingEdgeCount(); n++) {
          Edge<T> e = v.getOutgoingEdge(n);
          v.remove(e);
          Vertex<T> to = e.getTo();
          to.remove(e);
          edges.remove(e);
        }
        for (int n = 0; n < v.getIncomingEdgeCount(); n++) {
          Edge<T> e = v.getIncomingEdge(n);
          v.remove(e);
          Vertex<T> predecessor = e.getFrom();
          predecessor.remove(e);
        }
        return true;
    }
    /*Edge delete eder*/
    public boolean removeEdge(Vertex<T> from, Vertex<T> to) {
        Edge<T> e = from.findEdge(to);
        if (e == null)
          return false;
        else {
          from.remove(e);
          to.remove(e);
          edges.remove(e);
          return true;
        }
    }
    
}