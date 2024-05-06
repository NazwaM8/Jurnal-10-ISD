public class DfsMain {
    public static void main(String[] args) {
        GrafDfs graf = new GrafDfs(9);
        graf.insertEdge(0, 1);
        graf.insertEdge(0, 3);
        graf.insertEdge(0, 4);
        graf.insertEdge(1, 4); 
        graf.insertEdge(2, 1);  
        graf.insertEdge(3, 6);
        graf.insertEdge(4, 5);
        graf.insertEdge(4, 7);
        graf.insertEdge(5, 2);
        graf.insertEdge(5, 7);
        graf.insertEdge(6, 7);
        graf.insertEdge(7, 8);
        graf.insertEdge(8, 5);
        System.out.println("Following is the Depth First Traversal");
        graf.dfs(0);
    }
}