public class BfsMain {
    public static void main(String[] args) {
        GrafBfs graf = new GrafBfs(9);
        graf.insertEdge(0, 1);
        graf.insertEdge(0, 3);
        graf.insertEdge(0, 4);
        graf.insertEdge(1, 4);
        graf.insertEdge(2, 1);
        graf.insertEdge(3, 6);
        graf.insertEdge(4, 7);
        graf.insertEdge(4, 5);
        graf.insertEdge(5, 7);
        graf.insertEdge(5, 2);
        graf.insertEdge(6, 7);
        graf.insertEdge(7, 8);
        graf.insertEdge(8, 5);

        System.out.println("BFS untuk graf (mulai dari A)");
        graf.bfs(0);

        System.out.println();

        graf.getAdj();
        }
    }