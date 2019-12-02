package helloworld;

public class ConsoleView extends View {
    public ConsoleView(Controller controller) {
        super(controller);
    }

    @Override
    public String welcome() {
        Model model = getController().getModel();
        Greeting greeting = model.getGreeting();
        Audience audience = model.getAudience();
        String message = greeting.getGreetingText(audience);
        System.out.println(message);
        return message;
    }

    @Override
    public String farewell() {
        return null;
    }
}
