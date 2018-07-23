package entities;

import entities.ScenarioDetails;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-21T14:17:43")
@StaticMetamodel(Scenario.class)
public class Scenario_ { 

    public static volatile SingularAttribute<Scenario, String> scenarioNotes;
    public static volatile CollectionAttribute<Scenario, ScenarioDetails> scenarioDetailsCollection;
    public static volatile SingularAttribute<Scenario, String> scenarioCreatedBy;
    public static volatile SingularAttribute<Scenario, String> scenarioCreated;
    public static volatile SingularAttribute<Scenario, String> scenarioId;

}