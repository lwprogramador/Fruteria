/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fruteria.fruteria.apirest.interfaces;

import jakarta.jws.WebMethod;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author Leudis Wan Der Biest
 */
public interface IInicio {
    
    @WebMethod
    public Response inicarAplicacion();
}
