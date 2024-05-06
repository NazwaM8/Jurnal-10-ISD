import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class GrafDfs {
    private int vertex;
    private LinkedList<Integer> adj[];
    private boolean visited[];

    @SuppressWarnings("unchecked")
    public GrafDfs(int v) {
        vertex = v;
        adj = new LinkedList[vertex];

        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }

        visited = new boolean[vertex];
        for (int i = 0; i < vertex; i++) {
            visited[i] = false;
        }
    }

    public void insertEdge(int source, int dest) {
        adj[source].add(dest);
    }

    public String convert(int s) {
        String alphabet[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        return alphabet[s];
    }

    public void dfs(int sourceVertex) {
        Stack<Integer> stack = new Stack<>();
        stack.push(sourceVertex);

        while (!stack.isEmpty()) {
            sourceVertex = stack.peek();
            stack.pop();

            if (visited[sourceVertex] == false) {
                System.out.print(convert(sourceVertex) + " ");
                visited[sourceVertex] = true;
            }
            Iterator<Integer> itr = adj[sourceVertex].iterator();

            while (itr.hasNext()) {
                int v = itr.next();
                if (!visited[v]) {
                    stack.push(v);
                }        
            }
        }
    }
}