package oop.exams.glacialExpedition.models.states;

import java.util.ArrayList;
import java.util.Collection;

public class StateImpl implements State{
    private String name;
    private Collection<String>exhibits;

    public StateImpl(String name) {
        this.name = name;
        this.exhibits = new ArrayList<>();
    }

    @Override
    public Collection<String> getExhibits() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
