
package cr.ac.tec.graph.api.dto;

public class Node {
	private int id, inDregree, outDregree;
	private static int idStatic;
	
	public Node(int inDregree, int outDregree) {
		idStatic++;
		this.id = idStatic;
		this.inDregree = inDregree;
		this.outDregree = outDregree;
		
	}

	public int getInDregree() {
		return inDregree;
	}

	public void setInDregree(int inDregree) {
		this.inDregree = inDregree;
	}

	public int getOutDregree() {
		return outDregree;
	}

	public void setOutDregree(int outDregree) {
		this.outDregree = outDregree;
	}
	
	public int getID(){
		return this.id;
	}
	
}
