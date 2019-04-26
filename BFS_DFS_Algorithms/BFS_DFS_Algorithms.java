/**
 * Class BFS_DFS_Algorithms that implements both types and are used on a node graph.
 * This class makes use of the Node.java class
 * @author Ellen Burger
 * @version 4/22/19
 */

/** Uses user input */
import java.util.Scanner;

/** Allows use of array functions */
import java.util.Arrays;

/** Generates random numbers */
import java.util.Random;

/** Allows use of Java Queues */
import java.util.Queue;
import java.util.LinkedList;

public class BFS_DFS_Algorithms {
	
	/**
	 * Breadth First Search algorithm that traverses an entire graph by taking a starting node, 
	 * searching its neighbors, then its neighbor's neighbors and so on
	 * @param v Starting node that allows access to the rest of the graph via adjacency array
	 */
	public static void BFS(Node v) {
		
		/** Treats the given node as the start point and pushes it to an empty queue */
		v.distance = 0;
		v.parent = null;
		Queue <Node> q = new LinkedList<>();
		q.add(v);
		
		/** Iterates through values added to queue until empty, added values are each node in graph*/
		while(q.size() != 0) {
			
			/** Pops the queue, takes its value in a new pointer as well as its adjacency */
			Node w = q.remove(); //note: takes pointer, not copy
			Node [] adj = w.adj; //same as above
			
			/** Iterates through the adjacent values of the node popped from queue */
			for(int i = 0; i < adj.length; i++) {//adj[i] = u
				
				/** If the adjacent node's parent is null, set its pointer to w and add to queue */
				if(adj[i].parent == null) {
					
					adj[i].parent = w;
					adj[i].distance = w.distance + 1;
					q.add(adj[i]);
				}
				
			}
			
		}
		
	}
	
	/*public static void DFS(Node [] n) {//parameter?
		
		for(int i = 0; i < n.length; i++) {
			
			if(n[i].parent == null) {
				
				n[i].parent = null;
				DFSVisit(n[i]);
			}
		}
	}
	
	public static void DFSVisit(Node v) {
		
		v.start = time;
		
		for(int i = 0; i < v.adj.length; i++) {
			
			if(v.adj[i].start == -1) {
				
				v.adj[i].parent = v;
				DFSVisit(v.adj[i]);
			}
			else if(v.adj[i].next == -1) {//issue
				//loop here?
			}
		}
		
		time++;//time?
		v.end = time;
	}*/

	public static void main(String[] args) {
		
		/** Scanner and random objects */
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		//
		
		int V = 8;
		Node [] array = new Node [8];
		
		int E = 10;
		
		//
		
		System.out.println("Enter the starting vertex");
		
		
		scan.close();		

	}

}