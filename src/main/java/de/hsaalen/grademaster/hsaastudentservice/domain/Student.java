package de.hsaalen.grademaster.hsaastudentservice.domain;

public class Student {
    private String matrikelnummer;
    private String name;
    private String email;

    public Student(String matrikelnummer, String name, String email) {
        this.matrikelnummer = matrikelnummer;
        this.name = name;
        this.email = email;
    }

    public String getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(String matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
