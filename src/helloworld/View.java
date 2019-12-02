package helloworld;

public abstract class View {
    private Controller controller;

    protected View() {
    }

    protected View(Controller controller) {
        super();
        this.controller = controller;
    }

    public final Controller getController() {
        return controller;
    }

    public abstract String welcome();

    public abstract String farewell();

}
