package july2020;

import java.util.*;

public class AllPaths {
	
	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        if(graph.length == 0)
            return null;
        int n = graph.length;
        
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        
        path.add(0);
        dfs(graph, 0, n-1, path, allPaths);
        
        return allPaths;
    }
    
    public void dfs(int[][] graph, int src, int dest, List<Integer> path, List<List<Integer>> allPaths){
        if(src == dest){
            allPaths.add(new ArrayList<>(path));
            return;
        }
        
        for(int nbr : graph[src]){
            path.add(nbr);
            dfs(graph,nbr,dest,path,allPaths);
            path.remove(path.size()-1);
        }
    }

}
