package oop.exams.goldDigger.models.operation;

import oop.exams.goldDigger.models.discoverer.Discoverer;
import oop.exams.goldDigger.models.spot.Spot;

import java.util.ArrayDeque;
import java.util.Collection;

public class OperationImpl implements Operation{
    @Override
    public void startOperation(Spot spot, Collection<Discoverer> discoverers) {
        ArrayDeque<String> exhibits = new ArrayDeque<>(spot.getExhibits());
        for(Discoverer discoverer : discoverers){
            while ((discoverer.canDig())&&!exhibits.isEmpty()){
                String tempExhibits = exhibits.poll();
                discoverer.dig();
                discoverer.getMuseum().getExhibits().add(tempExhibits);
                spot.getExhibits().remove(tempExhibits);
            }
            if(exhibits.isEmpty()){
                break;
            }
        }

    }
}
