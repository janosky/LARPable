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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "archtypes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Archtypes.findAll", query = "SELECT a FROM Archtypes a")
    , @NamedQuery(name = "Archtypes.findByArchytypeId", query = "SELECT a FROM Archtypes a WHERE a.archytypeId = :archytypeId")
    , @NamedQuery(name = "Archtypes.findByArchytyeClass", query = "SELECT a FROM Archtypes a WHERE a.archytyeClass = :archytyeClass")
    , @NamedQuery(name = "Archtypes.findByArchytypeHitPoints", query = "SELECT a FROM Archtypes a WHERE a.archytypeHitPoints = :archytypeHitPoints")
    , @NamedQuery(name = "Archtypes.findByArchytypeHtP", query = "SELECT a FROM Archtypes a WHERE a.archytypeHtP = :archytypeHtP")
    , @NamedQuery(name = "Archtypes.findByArchytypeArmorType", query = "SELECT a FROM Archtypes a WHERE a.archytypeArmorType = :archytypeArmorType")
    , @NamedQuery(name = "Archtypes.findByArchytypeArmorWorn", query = "SELECT a FROM Archtypes a WHERE a.archytypeArmorWorn = :archytypeArmorWorn")
    , @NamedQuery(name = "Archtypes.findByArchytypeWeaponType", query = "SELECT a FROM Archtypes a WHERE a.archytypeWeaponType = :archytypeWeaponType")
    , @NamedQuery(name = "Archtypes.findByArchytypeDamage", query = "SELECT a FROM Archtypes a WHERE a.archytypeDamage = :archytypeDamage")
     , @NamedQuery(name = "Archtypes.findByArchytypeCreatureID", query = "SELECT a FROM Archtypes a WHERE a.creatureId = :creatureID")   
    , @NamedQuery(name = "Archtypes.findByArchytypeDescription", query = "SELECT a FROM Archtypes a WHERE a.archytypeDescription = :archytypeDescription")
    , @NamedQuery(name = "Archtypes.findByArchytypeBackground", query = "SELECT a FROM Archtypes a WHERE a.archytypeBackground = :archytypeBackground")
    , @NamedQuery(name = "Archtypes.findByArchytypeRoleplay", query = "SELECT a FROM Archtypes a WHERE a.archytypeRoleplay = :archytypeRoleplay")})
public class Archtypes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "ARCHYTYPE_ID")
    private String archytypeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "ARCHYTYE_CLASS")
    private String archytyeClass;
    @Size(max = 25)
    @Column(name = "ARCHYTYPE_HIT_POINTS")
    private String archytypeHitPoints;
    @Column(name = "ARCHYTYPE_HT_P")
    private Integer archytypeHtP;
    @Size(max = 25)
    @Column(name = "ARCHYTYPE_ARMOR_TYPE")
    private String archytypeArmorType;
    @Size(max = 25)
    @Column(name = "ARCHYTYPE_ARMOR_WORN")
    private String archytypeArmorWorn;
    @Size(max = 25)
    @Column(name = "ARCHYTYPE_WEAPON_TYPE")
    private String archytypeWeaponType;
    @Size(max = 25)
    @Column(name = "ARCHYTYPE_DAMAGE")
    private String archytypeDamage;
    @Size(max = 300)
    @Column(name = "ARCHYTYPE_DESCRIPTION")
    private String archytypeDescription;
    @Size(max = 300)
    @Column(name = "ARCHYTYPE_BACKGROUND")
    private String archytypeBackground;
    @Size(max = 300)
    @Column(name = "ARCHYTYPE_ROLEPLAY")
    private String archytypeRoleplay;
    @JoinColumn(name = "CREATURE_ID", referencedColumnName = "CREATURE_ID")
    @ManyToOne(optional = false)
    private Creature creatureId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "archytypeId")
    private Collection<ScenarioDetails> scenarioDetailsCollection;

    public Archtypes() {
    }

    public Archtypes(String archytypeId) {
        this.archytypeId = archytypeId;
    }

    public Archtypes(String archytypeId, String archytyeClass) {
        this.archytypeId = archytypeId;
        this.archytyeClass = archytyeClass;
    }

    public String getArchytypeId() {
        return archytypeId;
    }

    public void setArchytypeId(String archytypeId) {
        this.archytypeId = archytypeId;
    }

    public String getArchytyeClass() {
        return archytyeClass;
    }

    public void setArchytyeClass(String archytyeClass) {
        this.archytyeClass = archytyeClass;
    }

    public String getArchytypeHitPoints() {
        return archytypeHitPoints;
    }

    public void setArchytypeHitPoints(String archytypeHitPoints) {
        this.archytypeHitPoints = archytypeHitPoints;
    }

    public Integer getArchytypeHtP() {
        return archytypeHtP;
    }

    public void setArchytypeHtP(Integer archytypeHtP) {
        this.archytypeHtP = archytypeHtP;
    }

    public String getArchytypeArmorType() {
        return archytypeArmorType;
    }

    public void setArchytypeArmorType(String archytypeArmorType) {
        this.archytypeArmorType = archytypeArmorType;
    }

    public String getArchytypeArmorWorn() {
        return archytypeArmorWorn;
    }

    public void setArchytypeArmorWorn(String archytypeArmorWorn) {
        this.archytypeArmorWorn = archytypeArmorWorn;
    }

    public String getArchytypeWeaponType() {
        return archytypeWeaponType;
    }

    public void setArchytypeWeaponType(String archytypeWeaponType) {
        this.archytypeWeaponType = archytypeWeaponType;
    }

    public String getArchytypeDamage() {
        return archytypeDamage;
    }

    public void setArchytypeDamage(String archytypeDamage) {
        this.archytypeDamage = archytypeDamage;
    }

    public String getArchytypeDescription() {
        return archytypeDescription;
    }

    public void setArchytypeDescription(String archytypeDescription) {
        this.archytypeDescription = archytypeDescription;
    }

    public String getArchytypeBackground() {
        return archytypeBackground;
    }

    public void setArchytypeBackground(String archytypeBackground) {
        this.archytypeBackground = archytypeBackground;
    }

    public String getArchytypeRoleplay() {
        return archytypeRoleplay;
    }

    public void setArchytypeRoleplay(String archytypeRoleplay) {
        this.archytypeRoleplay = archytypeRoleplay;
    }

    public Creature getCreatureId() {
        return creatureId;
    }

    public void setCreatureId(Creature creatureId) {
        this.creatureId = creatureId;
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
        hash += (archytypeId != null ? archytypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Archtypes)) {
            return false;
        }
        Archtypes other = (Archtypes) object;
        if ((this.archytypeId == null && other.archytypeId != null) || (this.archytypeId != null && !this.archytypeId.equals(other.archytypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Archtypes[ archytypeId=" + archytypeId + " ]";
    }
    
}
