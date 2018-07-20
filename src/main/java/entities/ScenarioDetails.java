/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aejan
 */
@Entity
@Table(name = "scenario_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScenarioDetails.findAll", query = "SELECT s FROM ScenarioDetails s")
    , @NamedQuery(name = "ScenarioDetails.findByScenarioDetails", query = "SELECT s FROM ScenarioDetails s WHERE s.scenarioDetails = :scenarioDetails")
    , @NamedQuery(name = "ScenarioDetails.findByScenarioDetailsGmNotes", query = "SELECT s FROM ScenarioDetails s WHERE s.scenarioDetailsGmNotes = :scenarioDetailsGmNotes")
    , @NamedQuery(name = "ScenarioDetails.findByScenarioDetailsLevel", query = "SELECT s FROM ScenarioDetails s WHERE s.scenarioDetailsLevel = :scenarioDetailsLevel")
    , @NamedQuery(name = "ScenarioDetails.findByScenarioDetailsRoleplay", query = "SELECT s FROM ScenarioDetails s WHERE s.scenarioDetailsRoleplay = :scenarioDetailsRoleplay")})
public class ScenarioDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "SCENARIO_DETAILS")
    private String scenarioDetails;
    @Size(max = 300)
    @Column(name = "SCENARIO_DETAILS_GM_NOTES")
    private String scenarioDetailsGmNotes;
    @Column(name = "SCENARIO_DETAILS_LEVEL")
    private Integer scenarioDetailsLevel;
    @Size(max = 300)
    @Column(name = "SCENARIO_DETAILS_ROLEPLAY")
    private String scenarioDetailsRoleplay;
    @JoinColumn(name = "CREATURE_ID", referencedColumnName = "CREATURE_ID")
    @ManyToOne(optional = false)
    private Creature creatureId;
    @JoinColumn(name = "ARCHYTYPE_ID", referencedColumnName = "ARCHYTYPE_ID")
    @ManyToOne(optional = false)
    private Archtypes archytypeId;
    @JoinColumn(name = "SCENARIO_ID", referencedColumnName = "SCENARIO_ID")
    @ManyToOne(optional = false)
    private Scenario scenarioId;

    public ScenarioDetails() {
    }

    public ScenarioDetails(String scenarioDetails) {
        this.scenarioDetails = scenarioDetails;
    }

    public String getScenarioDetails() {
        return scenarioDetails;
    }

    public void setScenarioDetails(String scenarioDetails) {
        this.scenarioDetails = scenarioDetails;
    }

    public String getScenarioDetailsGmNotes() {
        return scenarioDetailsGmNotes;
    }

    public void setScenarioDetailsGmNotes(String scenarioDetailsGmNotes) {
        this.scenarioDetailsGmNotes = scenarioDetailsGmNotes;
    }

    public Integer getScenarioDetailsLevel() {
        return scenarioDetailsLevel;
    }

    public void setScenarioDetailsLevel(Integer scenarioDetailsLevel) {
        this.scenarioDetailsLevel = scenarioDetailsLevel;
    }

    public String getScenarioDetailsRoleplay() {
        return scenarioDetailsRoleplay;
    }

    public void setScenarioDetailsRoleplay(String scenarioDetailsRoleplay) {
        this.scenarioDetailsRoleplay = scenarioDetailsRoleplay;
    }

    public Creature getCreatureId() {
        return creatureId;
    }

    public void setCreatureId(Creature creatureId) {
        this.creatureId = creatureId;
    }

    public Archtypes getArchytypeId() {
        return archytypeId;
    }

    public void setArchytypeId(Archtypes archytypeId) {
        this.archytypeId = archytypeId;
    }

    public Scenario getScenarioId() {
        return scenarioId;
    }

    public void setScenarioId(Scenario scenarioId) {
        this.scenarioId = scenarioId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (scenarioDetails != null ? scenarioDetails.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScenarioDetails)) {
            return false;
        }
        ScenarioDetails other = (ScenarioDetails) object;
        if ((this.scenarioDetails == null && other.scenarioDetails != null) || (this.scenarioDetails != null && !this.scenarioDetails.equals(other.scenarioDetails))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ScenarioDetails[ scenarioDetails=" + scenarioDetails + " ]";
    }
    
}
