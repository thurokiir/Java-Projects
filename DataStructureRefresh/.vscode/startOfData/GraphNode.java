package startOfData;

import java.util.*;

public class GraphNode {


    int x;
    int y;
    //holds arraylist of edges
    ArrayList<Edge> friends = new ArrayList<Edge>();

    GraphNode(){
        
    }

    GraphNode(int x, int y){
        this.x = x;
        this.y = y;

    }

    void populate(int nodeNumber, Edge link){

        Edge copy = new Edge();
        copy = link;
        copy.dest = nodeNumber;
        friends.add(copy); //this should avoid null issues.

    }
    
}
