package model;

import javax.persistence.*;

@Entity
@Table(name = "estatistica")
public class Estatistica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "jogo_id")
    private Jogo jogo;

    @ManyToOne
    @JoinColumn(name = "jogador_id")
    private Jogador jogador;

    private int pontos;
    private int tiros2;
    private int tiros2Marcados;
    private int tiros3;
    private int tiros3Marcados;
    private int lancLiv;
    private int lancLivMarcados;
    private int ressaltoDef;
    private int ressaltoOf;
    private int faltasP;
    private int roubosDeBola;
    private int bloqueios;
    private int assistencias;
    private int tempoJogado;
    private int turnovers;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getTiros2() {
        return tiros2;
    }

    public void setTiros2(int tiros2) {
        this.tiros2 = tiros2;
    }

    public int getTiros2Marcados() {
        return tiros2Marcados;
    }

    public void setTiros2Marcados(int tiros2Marcados) {
        this.tiros2Marcados = tiros2Marcados;
    }

    public int getTiros3() {
        return tiros3;
    }

    public void setTiros3(int tiros3) {
        this.tiros3 = tiros3;
    }

    public int getTiros3Marcados() {
        return tiros3Marcados;
    }

    public void setTiros3Marcados(int tiros3Marcados) {
        this.tiros3Marcados = tiros3Marcados;
    }

    public int getLancLiv() {
        return lancLiv;
    }

    public void setLancLiv(int lancLiv) {
        this.lancLiv = lancLiv;
    }

    public int getLancLivMarcados() {
        return lancLivMarcados;
    }

    public void setLancLivMarcados(int lancLivMarcados) {
        this.lancLivMarcados = lancLivMarcados;
    }

    public int getRessaltoDef() {
        return ressaltoDef;
    }

    public void setRessaltoDef(int ressaltoDef) {
        this.ressaltoDef = ressaltoDef;
    }

    public int getRessaltoOf() {
        return ressaltoOf;
    }

    public void setRessaltoOf(int ressaltoOf) {
        this.ressaltoOf = ressaltoOf;
    }

    public int getFaltasP() {
        return faltasP;
    }


    public void setFaltasP(int faltasP) {
        this.faltasP = faltasP;
    }

    public int getRoubosDeBola() {
        return roubosDeBola;
    }

    public void setRoubosDeBola(int roubosDeBola) {
        this.roubosDeBola = roubosDeBola;
    }

    public int getBloqueios() {
        return bloqueios;
    }

    public void setBloqueios(int bloqueios) {
        this.bloqueios = bloqueios;
    }

    public int getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(int assistencias) {
        this.assistencias = assistencias;
    }

    public int getTempoJogado() {
        return tempoJogado;
    }

    public void setTempoJogado(int tempoJogado) {
        this.tempoJogado = tempoJogado;
    }

    public int getTurnovers() {
        return turnovers;
    }

    public void setTurnovers(int turnovers) {
        this.turnovers = turnovers;
    }
}
