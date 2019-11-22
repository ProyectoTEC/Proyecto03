package cr.ac.tec.graph.api.resources;

import java.io.IOException;
import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import cr.ac.tec.graph.api.dto.DB;
import cr.ac.tec.graph.api.dto.Graph;
import cr.ac.tec.graph.api.dto.Persona;

public class GraphResource {
	private int currentId;
	
	public GraphResource(int graphId) {
		this.currentId = graphId;
	}

	@GET
	@Produces("application/json")
	public Response getGraphData() {
		
		
		return Response.status(200)
				.entity(DB.lista.Obtener(this.currentId))
				.build();
		
		
		/*
		Persona p = DB.db.get(currentId);
		if (p != null) {
			return Response.status(200)
					.entity(p)
					.build();
		}
		return Response.status(404)
				.entity("NO ESTA")
				.build();
				*/
				
	}
	
	
	@DELETE
	@Consumes("application/json")
	@Produces("applicatio/json")
	public Response eliminateGraph() {
		Graph temp=(Graph) DB.lista.Obtener(this.currentId);
		
		DB.lista.eliminar(this.currentId);
		
		return Response.status(200)
				.entity(temp)
				.build();
	}
	
	
}
