package oop.exams.goldDigger.models.operation;

import oop.exams.goldDigger.models.discoverer.Discoverer;
import oop.exams.goldDigger.models.spot.Spot;

import java.util.Collection;

public interface Operation {
    void startOperation(Spot spot, Collection<Discoverer> discoverers);

}
