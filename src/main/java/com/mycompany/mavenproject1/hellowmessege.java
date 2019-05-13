package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.Server.MessegeServer;
import com.mycompany.mavenproject1.model.Messege;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.POST;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hellowmessege")
public class hellowmessege {

    MessegeServer ms = new MessegeServer();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Messege> getmessge() {
        return ms.getAllmessage();
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("{messegeId}")
    public Messege getMessege(@PathParam("messegeId") Long messageId) {
        return ms.getMsg(messageId);
    }

    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Messege addMesseg(Messege msg) {
        return ms.addMessage(msg);
    }

    @PUT
    @Path("{messegeId}")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Messege updatemsg(Messege msg, @PathParam("messegeId") long id) {
        msg.setId(id);
        return ms.updateMessege(msg);
    }

    @DELETE
    @Path("{messegeId}")
    @Produces(MediaType.APPLICATION_XML)
    public Messege deletemsg(@PathParam("messegeId") long id) {
        return ms.RemoveMessege(id);
    }

}
