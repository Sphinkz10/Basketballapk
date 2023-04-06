package model;

import javax.persistence.*;

@Entity
@Table(name = "treinador")
public class Treinador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String nacionalidade;
    private int idade;
    private String equipaAtual;
    private String equipasAnterior;
    private int titulos;
    private int vitorias;
    private int temporadasComoTreinador;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEquipaAtual() {
        return equipaAtual;
    }

    public void setEquipaAtual(String equipaAtual) {
        this.equipaAtual = equipaAtual;
    }

    public String getEquipasAnterior() {
        return equipasAnterior;
    }

    public void setEquipasAnterior(String equipasAnterior) {
        this.equipasAnterior = equipasAnterior;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getTemporadasComoTreinador() {
        return temporadasComoTreinador;
    }

    public void setTemporadasComoTreinador(int temporadasComoTreinador) {
        this.temporadasComoTreinador = temporadasComoTreinador;
    }
}