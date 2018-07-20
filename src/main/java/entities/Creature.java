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
@Table(name = "creature")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Creature.findAll", query = "SELECT c FROM Creature c")
      ,
    @NamedQuery(name = "Creature.findAllCreatureTypes", query = "SELECT distinct(c.creatureType) FROM Creature c")
    , @NamedQuery(name = "Creature.findByCreatureId", query = "SELECT c FROM Creature c WHERE c.creatureId = :creatureId")
    , @NamedQuery(name = "Creature.findByCreatureName", query = "SELECT c FROM Creature c WHERE c.creatureName = :creatureName")
    , @NamedQuery(name = "Creature.findByCreatureType", query = "SELECT c FROM Creature c WHERE c.creatureType = :creatureType")
    , @NamedQuery(name = "Creature.findByCreatureFrequency", query = "SELECT c FROM Creature c WHERE c.creatureFrequency = :creatureFrequency")
    , @NamedQuery(name = "Creature.findByCreatureRandomMonster", query = "SELECT c FROM Creature c WHERE c.creatureRandomMonster = :creatureRandomMonster")
    , @NamedQuery(name = "Creature.findByCreatureTerrain", query = "SELECT c FROM Creature c WHERE c.creatureTerrain = :creatureTerrain")
    , @NamedQuery(name = "Creature.findByCreatureDescription", query = "SELECT c FROM Creature c WHERE c.creatureDescription = :creatureDescription")
    , @NamedQuery(name = "Creature.findByCreatureBackground", query = "SELECT c FROM Creature c WHERE c.creatureBackground = :creatureBackground")
    , @NamedQuery(name = "Creature.findByCreatureSpecialAttacks", query = "SELECT c FROM Creature c WHERE c.creatureSpecialAttacks = :creatureSpecialAttacks")
    , @NamedQuery(name = "Creature.findByCreatureSpecialDefenses", query = "SELECT c FROM Creature c WHERE c.creatureSpecialDefenses = :creatureSpecialDefenses")})
public class Creature implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "CREATURE_ID")
    private String creatureId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "CREATURE_NAME")
    private String creatureName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "CREATURE_TYPE")
    private String creatureType;
    @Size(max = 10)
    @Column(name = "CREATURE_FREQUENCY")
    private String creatureFrequency;
    @Size(max = 15)
    @Column(name = "CREATURE_RANDOM_MONSTER")
    private String creatureRandomMonster;
    @Size(max = 25)
    @Column(name = "CREATURE_TERRAIN")
    private String creatureTerrain;
    @Size(max = 300)
    @Column(name = "CREATURE_DESCRIPTION")
    private String creatureDescription;
    @Size(max = 300)
    @Column(name = "CREATURE_BACKGROUND")
    private String creatureBackground;
    @Size(max = 300)
    @Column(name = "CREATURE_SPECIAL_ATTACKS")
    private String creatureSpecialAttacks;
    @Size(max = 300)
    @Column(name = "CREATURE_SPECIAL_DEFENSES")
    private String creatureSpecialDefenses;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "creatureId")
    private Collection<Archtypes> archtypesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "creatureId")
    private Collection<ScenarioDetails> scenarioDetailsCollection;

    public Creature() {
    }

    public Creature(String creatureId) {
        this.creatureId = creatureId;
    }

    public Creature(String creatureId, String creatureName, String creatureType) {
        this.creatureId = creatureId;
        this.creatureName = creatureName;
        this.creatureType = creatureType;
    }

    public String getCreatureId() {
        return creatureId;
    }

    public void setCreatureId(String creatureId) {
        this.creatureId = creatureId;
    }

    public String getCreatureName() {
        return creatureName;
    }

    public void setCreatureName(String creatureName) {
        this.creatureName = creatureName;
    }

    public String getCreatureType() {
        return creatureType;
    }

    public void setCreatureType(String creatureType) {
        this.creatureType = creatureType;
    }

    public String getCreatureFrequency() {
        return creatureFrequency;
    }

    public void setCreatureFrequency(String creatureFrequency) {
        this.creatureFrequency = creatureFrequency;
    }

    public String getCreatureRandomMonster() {
        return creatureRandomMonster;
    }

    public void setCreatureRandomMonster(String creatureRandomMonster) {
        this.creatureRandomMonster = creatureRandomMonster;
    }

    public String getCreatureTerrain() {
        return creatureTerrain;
    }

    public void setCreatureTerrain(String creatureTerrain) {
        this.creatureTerrain = creatureTerrain;
    }

    public String getCreatureDescription() {
        return creatureDescription;
    }

    public void setCreatureDescription(String creatureDescription) {
        this.creatureDescription = creatureDescription;
    }

    public String getCreatureBackground() {
        return creatureBackground;
    }

    public void setCreatureBackground(String creatureBackground) {
        this.creatureBackground = creatureBackground;
    }

    public String getCreatureSpecialAttacks() {
        return creatureSpecialAttacks;
    }

    public void setCreatureSpecialAttacks(String creatureSpecialAttacks) {
        this.creatureSpecialAttacks = creatureSpecialAttacks;
    }

    public String getCreatureSpecialDefenses() {
        return creatureSpecialDefenses;
    }

    public void setCreatureSpecialDefenses(String creatureSpecialDefenses) {
        this.creatureSpecialDefenses = creatureSpecialDefenses;
    }

    @XmlTransient
    public Collection<Archtypes> getArchtypesCollection() {
        return archtypesCollection;
    }

    public void setArchtypesCollection(Collection<Archtypes> archtypesCollection) {
        this.archtypesCollection = archtypesCollection;
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
        hash += (creatureId != null ? creatureId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Creature)) {
            return false;
        }
        Creature other = (Creature) object;
        if ((this.creatureId == null && other.creatureId != null) || (this.creatureId != null && !this.creatureId.equals(other.creatureId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Creature[ creatureId=" + creatureId + " ]";
    }
    
}
