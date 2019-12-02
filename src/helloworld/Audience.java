package helloworld;

public abstract class Audience {
    public static final Audience STANDARD = new StandardAudience();

    public abstract int getValue();
    public abstract String getName();
    public abstract String getDescription();

    static final class StandardAudience extends Audience {

        @Override
        public int getValue() {
            return 0;
        }

        @Override
        public String getName() {
            return "world";
        }

        @Override
        public String getDescription() {
            return "Everyone in the world, and not just people, but all living things, including the Earth itself.";
        }
    }
}
