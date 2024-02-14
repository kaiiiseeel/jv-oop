package core.basesyntax;

public class MainApp {
    private static final Machine[] machines = new Machine[]
            {new Truck(), new Bulldozer(), new Excavator()};

    public static void main(String[] args) {
        for (Machine machine : machines) {
            machine.doWork();
            machine.stopWork();
        }
    }
}
