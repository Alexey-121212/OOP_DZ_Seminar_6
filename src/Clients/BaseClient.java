package Clients;

public class BaseClient {
    protected String name;
    protected BaseClient(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Клиент типа Clients.BaseClient с именем " + name;
    }
}
