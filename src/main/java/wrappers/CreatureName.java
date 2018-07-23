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
public class CreatureName {
    String CreatureName = "";

    public CreatureName() {
    }

    public CreatureName(String nam) {
        
        this.CreatureName = nam;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCreatureName() {
        return CreatureName;
    }

    public void setCreatureName(String CreatureName) {
        this.CreatureName = CreatureName;
    }
    
}
