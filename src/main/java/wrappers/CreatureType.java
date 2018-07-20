/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrappers;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aejan
 */

@XmlRootElement
public class CreatureType {
    String creatureTypeString;

    public CreatureType(CreatureType types) {
       
       this.creatureTypeString = types.getCreatureType();
     
    }

    public CreatureType() {
    
    }

    public String getCreatureType() {
        return creatureTypeString;
    }

    public void setCreatureType(String creatureType) {
        this.creatureTypeString = creatureType;
    }
    
    
}
