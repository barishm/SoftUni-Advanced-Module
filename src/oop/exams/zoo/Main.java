package oop.exams.zoo;

import oop.exams.zoo.core.Engine;
import oop.exams.zoo.core.EngineImpl;

public class Main {

    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();
    }
}
