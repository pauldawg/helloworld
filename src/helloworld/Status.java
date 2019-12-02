package helloworld;

public class Status {
    public static final Status STARTING = new Status(StatusType.APPLICATION, 0b00000001, "Starting", "The application is currently starting up.");
    public static final Status RUNNING = new Status(StatusType.APPLICATION, 0b00000010, "Running", "The application is initialized and running.");
    public static final Status BUSY = new Status(StatusType.APPLICATION, 0b00000100, "Busy", "The application is busy performing one or more operations.");
    public static final Status STOPPING = new Status(StatusType.APPLICATION, 0b00001000, "Stopping", "The application is stopping.");
    public static final Status ERROR = new Status(StatusType.APPLICATION, 0b10000000, "Error", "The application has encountered an error.");

    private String name = null;
    private String description = null;
    private StatusType type = null;
    private int value = 0;

    public Status(StatusType type, int value, String name, String description) {
        this.type = type;
        this.value = value;
        this.name = name;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public StatusType getType() {
        return type;
    }

    ;
}
