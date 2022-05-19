/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fruteria.fruteria.apirest;

import com.fruteria.fruteria.apirest.interfaces.IInicio;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author Leudis Wan Der Biest
 */

@Path("inicio")
public class Inicio implements IInicio{
    
    @Override
    @GET
    @Path("iniciar_aplicacion")
    public Response inicarAplicacion() {
        return Response.accepted("Hola leudis como vas??").build();        
    }
}
