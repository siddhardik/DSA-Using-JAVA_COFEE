import java.util.Scanner;
public class Graphs{
    public static void dfs(int[][] adjMatrix,boolean visited[],int currentVertex){
        // Mark true as visited
        visited[currentVertex]=true;

        //Print The Vertex
        System.out.println(currentVertex +" ");

        // Go For Neighbourhood one by one
        for(int i=0;i<adjMatrix.length;i++){
            // Check  this can be Called? Should Edge Exist and Not Visisted I
            if(adjMatrix[currentVertex][i]==1 && visited[i]==false){
                dfs(adjMatrix,visited,i);
            }
        }

    }

    public static void  dfTraversal(int[][] adjMatrix){
        boolean visited[]=new boolean[adjMatrix.length];
        int currentVertex=0;
        dfs(adjMatrix,visited,currentVertex);

    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Number OF Vertices : ");
   int n=sc.nextInt();
   System.out.println("Enter the Total Number of Edges : ");
   int e=sc.nextInt();

   // Create A Adjacency Matrix
   int[][] adjMatrix =new int[n][n];

   // Take input of Edges
   int v1=0,v2=0;
   for(int i=0;i<e;i++){
    System.out.println("Please input the Edges Pair use space  : ");
         v1=sc.nextInt();
         v2=sc.nextInt();

         // Put 1 Because they are connected
         adjMatrix[v1][v2]=1;
         adjMatrix[v2][v1]=1;
   }

   // Print Adjacency Matrix
   for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        System.out.print(adjMatrix[i][j]+" ");
    }
    System.out.println();
   }
   dfTraversal(adjMatrix);

    

}
}
