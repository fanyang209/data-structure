/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    
     Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null) return null;
       
        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
        map.put(node, newNode);
        cloneVerticesByDFS(node, newNode);
        return newNode;
    }
    
    public void cloneVerticesByDFS(UndirectedGraphNode node,UndirectedGraphNode newNode){
        for(UndirectedGraphNode neighbor : node.neighbors){
            if(map.containsKey(neighbor)){
                newNode.neighbors.add(map.get(neighbor));
            }else{
                UndirectedGraphNode newNeighbor = new UndirectedGraphNode(neighbor.label);
                newNode.neighbors.add(newNeighbor);
                map.put(neighbor, newNeighbor);
                cloneVerticesByDFS(neighbor, newNeighbor);
            }
        }
    }
}
