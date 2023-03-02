package servico.qi.webservice_un_1;

import java.util.ArrayList;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/alunos")
@Produces(MediaType.APPLICATION_JSON)
public class AlunoResource {

	  	@GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public ArrayList<Aluno> getAlunos() {
	        return BancoAlunos.getListaAlunos();
	    }

	    @GET
	    @Path("{id}")
	    @Produces(MediaType.APPLICATION_JSON)
	    public Aluno getAluno(@PathParam("id") int id) {
	        return BancoAlunos.getAluno(id);
	    }

}
