package cr.ac.tec.graph.api.resources;

import java.util.UUID;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import cr.ac.tec.graph.api.dto.DB;
import cr.ac.tec.graph.api.dto.Persona;

@Path("/graphs")
public class GraphsResource {	
	
	@GET
	@Produces("application/json")
	public Response getGraphs() {
		return Response.status(200)
				.entity(DB.db)
				.build();
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response createGraph(Persona p){
		DB.db.put(p.getId(), p);
		return Response.status(200)
				.entity(p)
				.build();
	}
	
	@Path("{id}")
	public GraphResource handleSigleGraph(@PathParam("id") UUID graphId) {
		return new GraphResource(graphId);
	}
}