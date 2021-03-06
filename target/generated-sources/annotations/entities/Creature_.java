package entities;

import entities.Archtypes;
import entities.ScenarioDetails;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-01T17:16:09")
@StaticMetamodel(Creature.class)
public class Creature_ { 

    public static volatile SingularAttribute<Creature, String> creatureId;
    public static volatile CollectionAttribute<Creature, ScenarioDetails> scenarioDetailsCollection;
    public static volatile SingularAttribute<Creature, String> creatureSpecialDefenses;
    public static volatile SingularAttribute<Creature, String> creatureDescription;
    public static volatile CollectionAttribute<Creature, Archtypes> archtypesCollection;
    public static volatile SingularAttribute<Creature, String> creatureTerrain;
    public static volatile SingularAttribute<Creature, String> creatureSpecialAttacks;
    public static volatile SingularAttribute<Creature, String> creatureType;
    public static volatile SingularAttribute<Creature, String> creatureName;
    public static volatile SingularAttribute<Creature, String> creatureFrequency;
    public static volatile SingularAttribute<Creature, String> creatureBackground;
    public static volatile SingularAttribute<Creature, String> creatureRandomMonster;

}