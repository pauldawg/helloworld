package helloworld;

public abstract class Greeting {
    public static final Greeting STANDARD = new StandardGreeting();

    public abstract String getGreetingText(Audience audiences);
    public abstract String getGreetingText(Performer performer, Audience audiences);
    public abstract String getGreetingText(Audience[] audiences);
    public abstract String getGreetingText(Performer performer, Audience[] audiences);

    public static final class StandardGreeting extends Greeting {
        @Override
        public String getGreetingText(Audience audience) {
            return getGreetingText(null, audience);
        }

        @Override
        public String getGreetingText(Audience[] audiences) {
            return getGreetingText(null, audiences);
        }

        @Override
        public String getGreetingText(Performer performer, Audience audience) {
            return getGreetingText(performer, new Audience[] {audience});
        }

        @Override
        public String getGreetingText(Performer performer, Audience[] audiences) {
            StringBuffer buf = new StringBuffer("Hello, ");
            for (int i = 0; i < audiences.length; i++) {
                Audience audience = audiences[i];
                buf.append(audience.getName());
                if (i < audiences.length - 1) {
                    if (audiences.length > 2) {
                        buf.append(", ");
                    }
                    if (i == audiences.length - 2) {
                        buf.append(" and ");
                    }
                }
            }
            buf.append("!");
            return buf.toString();
        }
    }
}
