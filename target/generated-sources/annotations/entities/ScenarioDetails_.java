package entities;

import entities.Archtypes;
import entities.Creature;
import entities.Scenario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-21T12:34:28")
@StaticMetamodel(ScenarioDetails.class)
public class ScenarioDetails_ { 

    public static volatile SingularAttribute<ScenarioDetails, Creature> creatureId;
    public static volatile SingularAttribute<ScenarioDetails, String> scenarioDetailsGmNotes;
    public static volatile SingularAttribute<ScenarioDetails, Archtypes> archytypeId;
    public static volatile SingularAttribute<ScenarioDetails, String> scenarioDetailsRoleplay;
    public static volatile SingularAttribute<ScenarioDetails, Scenario> scenarioId;
    public static volatile SingularAttribute<ScenarioDetails, Integer> scenarioDetailsLevel;
    public static volatile SingularAttribute<ScenarioDetails, String> scenarioDetails;

}