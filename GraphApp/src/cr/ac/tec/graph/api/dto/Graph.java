package cr.ac.tec.graph.api.dto;

public class Graph {
	private int id;
	private Node nodes;
	private Edge edges;
	public Graph(Node nodes, Edge edges) {
		super();
		this.nodes = nodes;
		this.edges = edges;
	}
	public Node getNodes() {
		return nodes;
	}
	public void setNodes(Node nodes) {
		this.nodes = nodes;
	}
	public Edge getEdges() {
		return edges;
	}
	public void setEdges(Edge edges) {
		this.edges = edges;
	}

	public int getID(){
		return this.id;
	}
	
}
