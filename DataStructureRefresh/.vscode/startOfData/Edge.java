package startOfData;

public class Edge{
    int src;
    int dest;
    int weight;

    Edge(){

    }

    Edge(int dest, int weight){
        //intentionally leaving src blank to be filled by GraphNode.
        this.dest = dest;
        this.weight = weight;
    }    

    Edge(int src, int dest, int weight){
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}