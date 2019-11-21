package cr.ac.tec.graph.api.dto;

public class Edge {
	private int id, start, end, weight;
	private static int idStatic=0;

	public Edge(int start, int end, int weight) {
		idStatic++;
		this.id = idStatic;
		this.start = start;
		this.end = end;
		this.weight = weight;
	}
	
	
}
