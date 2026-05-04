package br.com.fiap.cs2_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "competitivos")
public class Competitivo{

    @Id
    private Long id;

    @Column(
            name= "qtd_players",
            length = 100,
            columnDefinition="char(100)",
            nullable = false)
    private String players;

    @Column(
            name= "escolher_lados",
            length = 100,
            columnDefinition="char(100)",
            nullable = false)
    private String lados;

    @Column(
            name= "max_players",
            length = 100,
            columnDefinition="char(100)",
            nullable = false)
    private String max_players;

    @Column(
            name= "min_players",
            length = 100,
            columnDefinition="char(100)",
            nullable = false)
    private String min_players;

    @Column(
            name= "nicknames",
            length = 100,
            columnDefinition="char(100)",
            nullable = false)
    private String nicknames;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayers() {
        return players;
    }

    public void setPlayers(String players) {
        this.players = players;
    }

    public String getLados() {
        return lados;
    }

    public void setLados(String lados) {
        this.lados = lados;
    }

    public String getMax_players() {
        return max_players;
    }

    public void setMax_players(String max_players) {
        this.max_players = max_players;
    }

    public String getMin_players() {
        return min_players;
    }

    public void setMin_players(String min_players) {
        this.min_players = min_players;
    }

    public String getNicknames() {
        return nicknames;
    }

    public void setNicknames(String nicknames) {
        this.nicknames = nicknames;
    }
}
