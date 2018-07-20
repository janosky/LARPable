package entities;

import entities.Creature;
import entities.ScenarioDetails;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-20T10:11:05")
@StaticMetamodel(Archtypes.class)
public class Archtypes_ { 

    public static volatile CollectionAttribute<Archtypes, ScenarioDetails> scenarioDetailsCollection;
    public static volatile SingularAttribute<Archtypes, String> archytypeArmorWorn;
    public static volatile SingularAttribute<Archtypes, String> archytypeDescription;
    public static volatile SingularAttribute<Archtypes, Integer> archytypeHtP;
    public static volatile SingularAttribute<Archtypes, String> archytypeRoleplay;
    public static volatile SingularAttribute<Archtypes, String> archytyeClass;
    public static volatile SingularAttribute<Archtypes, String> archytypeDamage;
    public static volatile SingularAttribute<Archtypes, String> archytypeHitPoints;
    public static volatile SingularAttribute<Archtypes, Creature> creatureId;
    public static volatile SingularAttribute<Archtypes, String> archytypeArmorType;
    public static volatile SingularAttribute<Archtypes, String> archytypeBackground;
    public static volatile SingularAttribute<Archtypes, String> archytypeId;
    public static volatile SingularAttribute<Archtypes, String> archytypeWeaponType;

}