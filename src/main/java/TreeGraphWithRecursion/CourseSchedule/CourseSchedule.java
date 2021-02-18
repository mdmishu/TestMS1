package TreeGraphWithRecursion.CourseSchedule;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {

    // Algorithm: need to find in a graph if there is any cycle in a graph then return false
    // otherwise return true.
    // We need to make a adjacency matrix first with value then use DFS to go through each node
    // and browse its adjacent and make sure no cycle

    List<Integer>[] adj;
    boolean[] visited;
    boolean[] marked;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        adj = new ArrayList[numCourses];
        for(int i=0; i<numCourses; i++){
            adj[i] = new ArrayList<>();
        }

        visited = new boolean[numCourses];
        marked = new boolean[numCourses];

        // adding value to adjacency list with edges
        for(int i=0; i<prerequisites.length; i++){
            adj[prerequisites[i][0]].add(prerequisites[i][1]);
        }

        // now makesue the graph is not cyclic
        for(int i=0; i<numCourses; i++){

            if(!visited[i]){
                if(cycelic(i)){
                    return false;
                }
            }

        }


        return true;
    }


    private boolean cycelic(int i) {
        visited[i] = true;
        //using the for loop to explore all the vertices
        for(Integer j : adj[i]){
            if(!visited[j]){
                if(cycelic(j)){
                    return true;
                }
            }else if(!marked[j]){
                return true;
            }
        }
        marked[i] = true;
        return false;
    }
}
