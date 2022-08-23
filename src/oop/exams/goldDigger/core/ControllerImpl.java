package oop.exams.goldDigger.core;

import oop.exams.goldDigger.common.ConstantMessages;
import oop.exams.goldDigger.common.ExceptionMessages;
import oop.exams.goldDigger.models.discoverer.Anthropologist;
import oop.exams.goldDigger.models.discoverer.Archaeologist;
import oop.exams.goldDigger.models.discoverer.Discoverer;
import oop.exams.goldDigger.models.discoverer.Geologist;
import oop.exams.goldDigger.models.operation.Operation;
import oop.exams.goldDigger.models.operation.OperationImpl;
import oop.exams.goldDigger.models.spot.Spot;
import oop.exams.goldDigger.models.spot.SpotImpl;
import oop.exams.goldDigger.repositories.DiscovererRepository;
import oop.exams.goldDigger.repositories.SpotRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller{
    private DiscovererRepository discovererRepository;
    private SpotRepository spotRepository;
    private int spotCount;

    public ControllerImpl() {
        this.discovererRepository = new DiscovererRepository();
        this.spotRepository = new SpotRepository();
    }

    @Override
    public String addDiscoverer(String kind, String discovererName) {
        Discoverer discoverer = null;
        switch (kind){
            case"Anthropologist":
                discoverer = new Anthropologist(discovererName);
                break;
            case"Archaeologist":
                discoverer = new Archaeologist(discovererName);
                break;
            case"Geologist":
                discoverer = new Geologist(discovererName);
                break;
            default:
                throw new IllegalArgumentException(ExceptionMessages.DISCOVERER_INVALID_KIND);
        }
        discovererRepository.add(discoverer);
        return String.format(ConstantMessages.DISCOVERER_ADDED,kind,discovererName);
    }

    @Override
    public String addSpot(String spotName, String... exhibits) {
        Spot spot = new SpotImpl(spotName);
        for(String exhibit : exhibits){
            spot.getExhibits().add(exhibit);
        }
        spotRepository.add(spot);

        return String.format(ConstantMessages.SPOT_ADDED,spotName);
    }

    @Override
    public String excludeDiscoverer(String discovererName) {
        Discoverer discoverer = discovererRepository.byName(discovererName);

        if(discoverer == null){
            throw new IllegalArgumentException(String.format(ExceptionMessages.DISCOVERER_DOES_NOT_EXIST,discovererName));
        }

        discovererRepository.remove(discoverer);

        return String.format(ConstantMessages.DISCOVERER_EXCLUDE,discovererName);
    }

    @Override
    public String inspectSpot(String spotName) {
        List<Discoverer> discoverers = discovererRepository.getCollection().stream().filter(s -> s.getEnergy() > 45).collect(Collectors.toList());
        if(discoverers.isEmpty()){
            throw new IllegalArgumentException(ExceptionMessages.SPOT_DISCOVERERS_DOES_NOT_EXISTS);
        }
        Spot spot = spotRepository.byName((spotName));
        Operation operation = new OperationImpl();
        operation.startOperation(spot,discoverers);
        spotCount++;
        long retiredDiscoverers = discoverers.stream().filter(s -> !s.canDig()).count();

        return String.format(ConstantMessages.INSPECT_SPOT,spotName,retiredDiscoverers);
    }

    @Override
    public String getStatistics() {
        return String.format(ConstantMessages.FINAL_SPOT_INSPECT,spotCount) + System.lineSeparator()+
                ConstantMessages.FINAL_DISCOVERER_INFO + System.lineSeparator()+
                discovererRepository.getCollection().stream().map((Discoverer::toString)).collect(Collectors.joining(System.lineSeparator()));
    }
}
