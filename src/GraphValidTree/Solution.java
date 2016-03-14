package GraphValidTree;

import java.util.ArrayList;

/* 给出 n 个节点，标号分别从 0 到 n - 1 并且给出一个 无向 边的列表 (给出每条边的两个顶点),
 * 写一个函数去判断这张｀无向｀图是否是一棵树 
 * 
 * 注意
 * 你可以假设我们不会给出重复的边在边的列表当中. 
 * 无向边　[0, 1] 和 [1, 0]　是同一条边， 因此他们不会同时出现在我们给你的边的列表当中。*/

public class Solution {
    /**
     * @param n an integer
     * @param edges a list of undirected edges
     * @return true if it's a valid tree, or false
     */
    int[] id;
    public boolean validTree(int n, int[][] edges) {
        // Write your code here
        if(edges.length != n-1){
            return false;
        }
        id = new int[n];
        for(int i=0;i<n;i++){
            id[i] = i;
        }
        for(int i=0;i<n-1;i++){
            if(find(edges[i][0])==find(edges[i][1])){
                return false;
            }
            union(edges[i][0],edges[i][1]);
        }
        return true;
    }
    public int find(int p){
        return id[p];
    }
    public void union(int p,int q){
        if(id[p]==id[q]){
            return;
        }
        for(int i=0;i<id.length;i++){
            if(id[i]==id[p]){
                id[i]=id[q];
            }
        }
    }
}