package app;

public class Client {
    int id;
    String fullName;
    String greeting;

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Client(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
