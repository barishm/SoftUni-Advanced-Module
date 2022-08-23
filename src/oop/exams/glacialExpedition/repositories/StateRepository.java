package oop.exams.glacialExpedition.repositories;

import oop.exams.glacialExpedition.models.states.State;

import java.util.ArrayList;
import java.util.Collection;

public class StateRepository implements Repository<State>{
    private Collection<State> states;

    public StateRepository() {
        this.states = new ArrayList<>();
    }

    @Override
    public Collection<State> getCollection() {
        return null;
    }

    @Override
    public void add(State state) {

    }

    @Override
    public boolean remove(State state) {
        return false;
    }

    @Override
    public State byName(String name) {
        return null;
    }
}
