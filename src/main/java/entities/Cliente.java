package entities;

import java.time.LocalDate;

public class Cliente {
    private String name;
    private String email;
    private LocalDate birthDate;

    public Cliente(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
