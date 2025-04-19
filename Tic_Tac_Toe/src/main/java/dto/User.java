package dto;

import java.util.UUID;

public class User {
    private String id = UUID.randomUUID().toString();
    private String name;
    private char symbol;

    public User(String name, char symbol){
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }
}
