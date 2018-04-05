/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.registropersonaws.ws;

import com.hm.registropersonabusiness.service.PersonaService;
import com.hm.registropersonaentities.entities.Persona;
import com.hm.registropersonaws.util.Utilidades;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author HugoM
 */
@WebService(name = "personaWS")
public class PersonaWS {
    
    @EJB(mappedName = "PersonaService")
    private PersonaService personaService;
    
    @WebMethod(operationName = "getAllPersona")
    public List<Persona> getAllPersona() {
        try {
            personaService = (PersonaService) Utilidades.getEJBRemote("PersonaService", PersonaService.class.getName());
        } catch (Exception ex) {
        }
        return personaService.getAllPersons();
    }
    
    @WebMethod(operationName = "getByIdPerson")
    public Persona getByIdPerson(long idPersona) {
        try {
            personaService = (PersonaService) Utilidades.getEJBRemote("PersonaService", PersonaService.class.getName());
        } catch (Exception ex) {
        }
        return personaService.getByPersonId(idPersona);
    }
    
    @WebMethod(operationName = "insertPerson")
    public boolean insertPerson(Persona persona) {
        try {
            personaService = (PersonaService) Utilidades.getEJBRemote("PersonaService", PersonaService.class.getName());
        } catch (Exception ex) {
        }
        return personaService.insertPerson(persona);
    }
    
    @WebMethod(operationName = "updatePerson")
    public boolean updatePerson(Persona persona) {
        try {
            personaService = (PersonaService) Utilidades.getEJBRemote("PersonaService", PersonaService.class.getName());
        } catch (Exception e) {
        }
        return personaService.updatePerson(persona);
    }
    
    @WebMethod(operationName = "deletePerson")
    public boolean deletePerson(long idPersona) {
        try {
            personaService = (PersonaService) Utilidades.getEJBRemote("PersonaService", PersonaService.class.getName());
        } catch (Exception e) {
        }
        return personaService.DeletePerson(idPersona);
    }
    
}
