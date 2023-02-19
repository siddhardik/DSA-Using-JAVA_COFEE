import java.util.Arrays;
import java.util.Scanner;
class Edge implements Comparable < Edge > {
    int v1;
    int v2;
    int weight;

    Edge(int v1, int v2, int weight) {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge o) {
        return this.weight - o.weight;
    }

}
public class KruskalAlgorithm {

    private static int findParent(int v, int parent[]) {
        if (v == parent[v]) {
            return v;
        }
        return findParent(parent[v], parent);
    }

    public static Edge[] kruskalAlgorithm(Edge[] edges, int n) {
        Arrays.sort(edges);
        Edge mst[] = new Edge[n - 1];
        int parent[] = new int[n];
        for (int j = 0; j < n; j++) {
            parent[j] = j;
        }

        int count = 0, i = 0;
        while (count != n - 1) {
            Edge curentEdge = edges[i++];
            int v1Parent = findParent(curentEdge.v1, parent);
            int v2Parent = findParent(curentEdge.v2, parent);
            if (v1Parent != v2Parent) {
                // Including currentEdge 
                mst[count] = curentEdge;
                count++;
                parent[v1Parent] = v2Parent;
            }
        }
        return mst;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int e = s.nextInt();

        Edge edges[] = new Edge[e];
        for (int i = 0; i < e; i++) {
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            int weight = s.nextInt();
            Edge edge = new Edge(v1, v2, weight);
            edges[i] = edge;
        }
        Edge mst[] = kruskalAlgorithm(edges, n);
        for (int i = 0; i < mst.length; i++) {
            if (mst[i].v1 < mst[i].v2) {
                System.out.println(mst[i].v1 + mst[i].v2 + " " + mst[i].weight);
            } else {
                System.out.println(mst[i].v2 + mst[i].v1 + "  " + mst[i].weight);
            }
        }
    }
}