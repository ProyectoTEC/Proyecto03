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
import cr.ac.tec.graph.api.dto.Graph;
import cr.ac.tec.graph.api.dto.Persona;

@Path("/graphs")
public class GraphsResource {	
	
	@GET
	@Produces("application/json")
	public Response getGraphs() {
		
		Graph [] temp =new Graph[DB.lista.getLargo()];
		for (int i=0; i<DB.lista.getLargo();i++) {
			temp[i]=(Graph) DB.lista.Obtener(i);
		}
		return Response.status(200)
				.entity(temp)
				.build();
	}
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response createGraph(Graph g){
		//DB.db.put(p.getId(), p);
		DB.lista.InsertarFinal(g);
		return Response.status(200)
				.entity(g)
				.build();
	}
	
	@Path("{id}")
	public GraphResource handleSigleGraph(@PathParam("id") int id) {
		return new GraphResource(id);
	}
}