package oop.exams.glacialExpedition.repositories;

import oop.exams.glacialExpedition.models.explorers.Explorer;

import java.util.ArrayList;
import java.util.Collection;

public class ExplorerRepository implements Repository<Explorer>{
    private Collection<Explorer> explorers;

    public ExplorerRepository() {
        this.explorers = new ArrayList<>();
    }

    @Override
    public Collection<Explorer> getCollection() {
        return null;
    }

    @Override
    public void add(Explorer explorer) {

    }

    @Override
    public boolean remove(Explorer explorer) {
        return false;
    }

    @Override
    public Explorer byName(String name) {
        return null;
    }
}
