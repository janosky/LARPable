/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestClasses;

import java.util.Set;
import javax.ws.rs.core.Application;
import org.glassfish.jersey.jackson.JacksonFeature;

/**
 *
 * @author aejan
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(RestClasses.ArchtypesFacadeREST.class);
        resources.add(RestClasses.CreatureFacadeREST.class);
        resources.add(RestClasses.CrossDomain.class);
      //  resources.add(RestClasses.ScenarioFacadeREST.class);
        resources.add(RestClasses.GetCreatureData.class);
        resources.add(RestClasses.ScenarioDetailsFacadeREST.class);
        resources.add(RestClasses.ScenarioFacadeREST.class);
        resources.add(servlets.NewCrossOriginResourceSharingFilter.class);
    }
    
}