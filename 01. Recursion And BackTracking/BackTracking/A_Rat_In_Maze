public class Solution {

	public static boolean ratInAMaze(int maze[][]){

		/*Your class should be named Solution. 
		*Don't write main().
	 	*Don't take input, it is passed as function argument.
	 	*Don't print output.
	 	*Taking input and printing output is handled automatically.
		*/ 

        int n = maze.length;
        int path[][] = new int[n][n];
         return solveMaze(maze, 0, 0, path);
	}
       public static boolean solveMaze(int[][] maze, int i, int j, int[][] path) {

        if (i < 0 || i >= maze.length || j < 0 || j >= maze.length || maze[i][j] == 0 || path[i][j] == 1) {
            return false;
        }

        path[i][j] = 1;

        if (i == maze.length - 1 && j == maze.length - 1) {

            return true;
        }

           
        if (solveMaze(maze, i - 1, j, path)) {
            return true;
        }

        if (solveMaze(maze, i, j + 1, path)) {
            return true;
        }

        if (solveMaze(maze, i + 1, j, path)) {
            return true;
        }

        if (solveMaze(maze, i, j - 1, path)) {
            return true;
        }
        return false;
	}
}