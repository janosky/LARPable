/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import entities.Archtypes;
import entities.Creature;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import wrappers.CreatureType;

/**
 *
 * @author aejan
 */
public interface GetCreatureDataInterface extends Serializable{
    
    
  public List<CreatureType> getCreatureTypes();
    
    public List<Creature> getCreatureByType(String CreatureType);
    
    public Collection <Archtypes> getArchtypesByCreatureID(String creatureID);
}
