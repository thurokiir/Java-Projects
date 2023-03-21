package startOfData;
//import java.util.*;

public class MatrixGraph{

    private int [][] valueMatrix;
    private Edge [][] valueGraph;
    private GraphNode[] weightList;

    MatrixGraph(int [][] graph){
        valueMatrix = new int[graph.length][graph[0].length];
        valueMatrix = graph;
        valueGraph = new Edge[graph.length][graph[0].length];
        weightList = new GraphNode[graph.length];
    }



    void populateInt(int x, int y, int value){
        //take values, update the relevant locations
        valueMatrix[x][y] = value;
        //get a node and edge created and connected to the relevant locations
        valueGraph[x][y] = new Edge(x, y, value);
        //implement this when I figure out my architecture between Edge and GraphNode strucutres populateNode(popCop);
    }

    void populateEdgeLoop(){

        populateNodeLoop();

        for(int i = 0; i < valueMatrix.length; i++){
            for (int j = 0; j < valueMatrix[0].length; j++){
                if(valueMatrix[i][j] != 0){
                    Edge loopEdge = new Edge(i,j,valueMatrix[i][j]);
                    valueGraph[i][j] = loopEdge;
                    weightList[i].friends.add(loopEdge);//This line and line-1 are the same objects, memory save success!
                }
            }
        }
    }

    void populateNodeLoop(){
        for(int i =0; i < valueMatrix.length; i++){
            GraphNode loopCopy = new GraphNode();
            weightList[i] = loopCopy;
        }
    }

    void printGraph(MatrixGraph graph){

    }
}