package oop.exams.goldDigger.repositories;

import oop.exams.goldDigger.models.discoverer.Discoverer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DiscovererRepository implements Repository<Discoverer>{
    private Collection<Discoverer>discoverers;

    public DiscovererRepository() {
        this.discoverers = new ArrayList<>();
    }

    @Override
    public Collection<Discoverer> getCollection() {
        return Collections.unmodifiableCollection(discoverers);
    }

    @Override
    public void add(Discoverer discoverer) {
        discoverers.add(discoverer);
    }

    @Override
    public boolean remove(Discoverer discoverer) {
        return discoverers.remove(discoverer);
    }

    @Override
    public Discoverer byName(String name) {
        return discoverers.stream().filter(s -> s.getName().equals(name)).findFirst().orElse(null);
    }
}
