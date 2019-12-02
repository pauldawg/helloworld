package helloworld;

final class StatusType {
    static final StatusType APPLICATION = new StatusType("Application");
    static final StatusType AUDIENCE = new StatusType("Audience");
    private String name;

    StatusType(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
