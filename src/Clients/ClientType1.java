package Clients;

public class ClientType1 extends BaseClient {

    private ClientType1(String name) {
        super(name);
    }
    public static ClientType1 create(String name) {
        return new ClientType1(name);
    }

    public String getName(){
        return super.name;
    }
    @Override
    public String toString() {
        return "Клиент типа Clients.ClientType1 с именем " + super.name;
    }
}
