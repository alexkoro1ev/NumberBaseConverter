package converter;

public class Converter {
    private final Controller controller;

    public Converter() {
        controller = new Controller();
    }

    public void run() {

        while (!controller.isFinished()) {
            controller.makeConversion();
        }
    }
}
