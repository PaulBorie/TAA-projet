package sample.data.jpa.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Professional implements Serializable {

    private Long id;
    private String nom;
    private  String username;
    private String password;
    private String agenda;
    private List<Meeting> meetings = new ArrayList<Meeting>();

    public Professional() {}

    public Professional(String nom, String username, String password, String agenda) {
        this.nom = nom;
        this.username = username;
        this.password = password;
        this.agenda = agenda;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    @OneToMany(mappedBy = "professional", cascade= CascadeType.ALL)
    public List<Meeting> getMeetings() {
        return meetings;
    }

    public void setMeetings(List<Meeting> meetings) {
        this.meetings = meetings;
    }
}
