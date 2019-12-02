package helloworld;

import java.util.Vector;

public final class ConsoleApplication extends Controller{
    private final Vector<Status> statuses = new Vector<>();

    @Override
    public void start() {
        getView().welcome();
    }

    @Override
    public void stop() {
        setStatus(Status.STOPPING, true);
        getView().farewell();
        System.exit(0);
    }

    @Override
    public boolean isStatus(Status status) {
        return statuses.contains(status);
    }

    @Override
    public void setStatus(Status status, boolean state) {
        if (state == true) {
            if (!statuses.contains(status)) {
                statuses.add(status);
            }
        }
    }

    @Override
    public Status[] getStatus() {
        return getStatus(null);
    }

    @Override
    public Status[] getStatus(StatusType type) {
        Vector<Status> filterStatuses = new Vector<>();
        for (int i = 0; i < statuses.size(); i++) {
            Status status = statuses.elementAt(i);
            if (type == null || status.getType() == type) {
                filterStatuses.add(status);
            }
        }
        Status[] val = new Status[filterStatuses.size()];
        filterStatuses.toArray(val);
        return val;
    }

    @Override
    protected View createView(Controller controller) {
        return new ConsoleView(controller);
    }

    @Override
    public Model createModel(Controller controller) {
        return new Model.StandardModel(controller);
    }
}
