package by.pvt.hw3.domain;

public enum Role {
    ADMIN("Администратор"),
    CLIENT("Клиент");
    String name;

    Role(String name) {
        this.name = name;
    }
}
