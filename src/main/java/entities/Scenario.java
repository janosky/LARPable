/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author aejan
 */
@Entity
@Table(name = "scenario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Scenario.findAll", query = "SELECT s FROM Scenario s")
    , @NamedQuery(name = "Scenario.findByScenarioId", query = "SELECT s FROM Scenario s WHERE s.scenarioId = :scenarioId")
         , @NamedQuery(name = "Scenario.findNextScenarioID", query = "SELECT DISTINCT(s.scenarioId) FROM Scenario s")
    , @NamedQuery(name = "Scenario.findByScenarioNotes", query = "SELECT s FROM Scenario s WHERE s.scenarioNotes = :scenarioNotes")
    , @NamedQuery(name = "Scenario.findByScenarioCreated", query = "SELECT s FROM Scenario s WHERE s.scenarioCreated = :scenarioCreated")
    , @NamedQuery(name = "Scenario.findByScenarioCreatedBy", query = "SELECT s FROM Scenario s WHERE s.scenarioCreatedBy = :scenarioCreatedBy")})
public class Scenario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "SCENARIO_ID")
    private String scenarioId;
    @Size(max = 300)
    @Column(name = "SCENARIO_NOTES")
    private String scenarioNotes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "SCENARIO_CREATED")
    private String scenarioCreated;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "SCENARIO_CREATED_BY")
    private String scenarioCreatedBy;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "scenarioId")
    private Collection<ScenarioDetails> scenarioDetailsCollection;

    public Scenario() {
    }

    public Scenario(String scenarioId) {
        this.scenarioId = scenarioId;
    }

    public Scenario(String scenarioId, String scenarioCreated, String scenarioCreatedBy) {
        this.scenarioId = scenarioId;
        this.scenarioCreated = scenarioCreated;
        this.scenarioCreatedBy = scenarioCreatedBy;
    }

    public String getScenarioId() {
        return scenarioId;
    }

    public void setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
    }

    public String getScenarioNotes() {
        return scenarioNotes;
    }

    public void setScenarioNotes(String scenarioNotes) {
        this.scenarioNotes = scenarioNotes;
    }

    public String getScenarioCreated() {
        return scenarioCreated;
    }

    public void setScenarioCreated(String scenarioCreated) {
        this.scenarioCreated = scenarioCreated;
    }

    public String getScenarioCreatedBy() {
        return scenarioCreatedBy;
    }

    public void setScenarioCreatedBy(String scenarioCreatedBy) {
        this.scenarioCreatedBy = scenarioCreatedBy;
    }

    @XmlTransient
    public Collection<ScenarioDetails> getScenarioDetailsCollection() {
        return scenarioDetailsCollection;
    }

    public void setScenarioDetailsCollection(Collection<ScenarioDetails> scenarioDetailsCollection) {
        this.scenarioDetailsCollection = scenarioDetailsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (scenarioId != null ? scenarioId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Scenario)) {
            return false;
        }
        Scenario other = (Scenario) object;
        if ((this.scenarioId == null && other.scenarioId != null) || (this.scenarioId != null && !this.scenarioId.equals(other.scenarioId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Scenario[ scenarioId=" + scenarioId + " ]";
    }
    
    
    
}
