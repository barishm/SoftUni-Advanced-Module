package oop.exams.goldDigger;

import oop.exams.goldDigger.core.Controller;
import oop.exams.goldDigger.core.ControllerImpl;
import oop.exams.goldDigger.core.Engine;
import oop.exams.goldDigger.core.EngineImpl;

public class Main {

    public static void main(String[] args) {
        Controller controller = new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
