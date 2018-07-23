/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestClasses;

import Interfaces.GetCreatureDataInterface;
import entities.Archtypes;
import entities.Creature;
import java.util.ArrayList;
import java.util.Collection;
import static java.util.Collections.list;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MediaType.*;
import jdk.nashorn.internal.objects.NativeArray;
import wrappers.CreatureName;
import wrappers.CreatureType;

/**
 *
 * @author aejan
 */
@Path("getCreatureData")
public class GetCreatureData implements  GetCreatureDataInterface {

     
    @PersistenceContext(unitName = "LARPPU")
    EntityManager em;
    
    
    @GET
    @Path("getCreatureNames")
    @Produces(MediaType.APPLICATION_JSON)
    public List<CreatureName> getCreatureNames()
    {
      List<String> creatureNames = em.createNamedQuery("Creature.findAllCreatureNames",String.class).getResultList();
      List<CreatureName> names= new LinkedList<>();
      CreatureName name;
      
      for(String nam : creatureNames)
      {
          names.add(new CreatureName(nam));
      }
        
      return names;
    }
    
    
    
    @Override
    @GET    
    @Path("getCreatureTypes")
    // @Produces({ MediaType.APPLICATION_JSON })
    
    @Produces(MediaType.APPLICATION_JSON)
   public List<CreatureType> getCreatureTypes() {
     
    
 List<String> creatures = em.createNamedQuery("Creature.findAllCreatureTypes",String.class).getResultList();
   

         List<CreatureType> creatureTypes = new LinkedList<>();
         
         CreatureType types  = new CreatureType();
         
                  
       for(int i = 0; i < creatures.size(); i++)
       {
         
      types.setCreatureType(creatures.get(i));
      
      creatureTypes.add(new CreatureType(types));
             
       }
      return  creatureTypes;

    }

   
    @Override
    @GET
    @Path("getCreatureByType/{type}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Creature> getCreatureByType(@PathParam("type") String creatureType) {
      
        return em.createNamedQuery("Creature.findByCreatureType", Creature.class).
                setParameter("creatureType", creatureType ).getResultList();
//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
        @GET
    @Path("getCreatureByName/{name}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Creature> getCreatureByName(@PathParam("name") String creatureName) {
      
        return em.createNamedQuery("Creature.findByCreatureName", Creature.class).
                setParameter("creatureName", creatureName ).getResultList();
//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    @GET
    @Path("GetArchtypeByCreatureID/{creatureID}")
    
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Archtypes> getArchtypesByCreatureID(@PathParam("creatureID") String creatureID) {
       
       Creature creature = em.createNamedQuery("Creature.findByCreatureId", Creature.class).setParameter("creatureId", creatureID).getSingleResult();
       
       
     
   // em.createNamedQuery("Creature.findByCreatureId", Creature.class).setParameter("creatureID", ).getResultList();
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
Collection<Archtypes> archtypes = creature.getArchtypesCollection();
return  archtypes;
    }
    
}
