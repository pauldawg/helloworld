package helloworld;

public abstract class Controller {

    private Model model;
    private View view;

    protected Controller() {
        initialize();
        start();
    }

    private final void initialize() {
        model = _initModel(this);
        view = _initView(this);
    }

    private View _initView(Controller controller) {
        return createView(this);
    }

    private Model _initModel(Controller controller) {
        return createModel(this);
    }

    public abstract void start();

    public abstract void stop();

    public abstract boolean isStatus(Status status);

    public abstract void setStatus(Status status, boolean state);

    public abstract Status[] getStatus();

    public abstract Status[] getStatus(StatusType type);

    protected abstract View createView(Controller controller);

    protected abstract Model createModel(Controller controller);

    public Model getModel() {
        return model;
    }

    public View getView() {
        return view;
    }
}
