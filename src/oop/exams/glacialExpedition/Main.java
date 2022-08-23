package oop.exams.glacialExpedition;

import oop.exams.glacialExpedition.core.Controller;
import oop.exams.glacialExpedition.core.ControllerImpl;
import oop.exams.glacialExpedition.core.Engine;
import oop.exams.glacialExpedition.core.EngineImpl;

public class Main {

    public static void main(String[] args) {
        Controller controller = new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
