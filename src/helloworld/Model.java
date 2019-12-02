package helloworld;

public abstract class Model {
    private Controller controller;

    private Model() {
    }

    protected Model(Controller controller) {
        super();
        this.controller = controller;
    }

    public abstract Audience getAudience();

    public abstract Greeting getGreeting();

    static final class StandardModel extends Model {
        protected StandardModel(Controller controller) {
            super(controller);
        }

        @Override
        public Audience getAudience() {
            return Audience.STANDARD;
        }

        @Override
        public Greeting getGreeting() {
            return Greeting.STANDARD;
        }
    }
}
