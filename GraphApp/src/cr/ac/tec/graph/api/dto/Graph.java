package cr.ac.tec.graph.api.dto;

public class Graph {
	private int id;
	private Node nodes;
	private Edge edges;
	private static int idStatic;
	
	public Graph() {
		idStatic++;
		this.id = idStatic;
		this.nodes = null;
		this.edges = null;
	}
	
	public Graph(String nombre) {
		idStatic++;
		this.id = idStatic;
		this.nodes = null;
		this.edges = null;
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
