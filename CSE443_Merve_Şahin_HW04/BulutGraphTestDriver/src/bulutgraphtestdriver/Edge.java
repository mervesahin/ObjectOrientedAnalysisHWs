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
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
public class Edge<T> implements Serializable{
  private Vertex<T> from;

  private Vertex<T> to;

  private int cost;

  private boolean mark;

  
  public Edge(Vertex<T> from, Vertex<T> to) {
    this(from, to, 0);
  }

  
  public Edge(Vertex<T> from, Vertex<T> to, int cost) {
    this.from = from;
    this.to = to;
    this.cost = cost;
    mark = false;
  }

  
  public Vertex<T> getTo() {
    return to;
  }

  
  public Vertex<T> getFrom() {
    return from;
  }

  public int getCost() {
    return cost;
  }

  
  public void mark() {
    mark = true;
  }

  
  public void clearMark() {
    mark = false;
  }

  public boolean isMarked() {
    return mark;
  }

  
  public String toString() {
    StringBuffer tmp = new StringBuffer("Edge[from: ");
    tmp.append(from.getName());
    tmp.append(",to: ");
    tmp.append(to.getName());
    tmp.append(", cost: ");
    tmp.append(cost);
    tmp.append("]");
    return tmp.toString();
  }
}
