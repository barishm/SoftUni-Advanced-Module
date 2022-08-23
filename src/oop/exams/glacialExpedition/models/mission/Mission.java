package oop.exams.glacialExpedition.models.mission;

import oop.exams.glacialExpedition.models.explorers.Explorer;
import oop.exams.glacialExpedition.models.states.State;


import java.util.Collection;

public interface Mission {
    void explore(State state, Collection<Explorer> explorers);
}
