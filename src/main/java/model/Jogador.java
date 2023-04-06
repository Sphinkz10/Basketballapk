package model;


import javax.persistence.*;

@Entity
@Table(name = "jogador")
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String nacionalidade;
    private float altura;
    private int idade;
    private String equipaAtual;
    private String equipasAnterior;
    private String posicao;
    @Lob
    private String estatisticasIndividuais;
    private int titulos;
    private float indicePerformanceTreino;

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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
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

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getEstatisticasIndividuais() {
        return estatisticasIndividuais;
    }

    public void setEstatisticasIndividuais(String estatisticasIndividuais) {
        this.estatisticasIndividuais = estatisticasIndividuais;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    public float getIndicePerformanceTreino() {
        return indicePerformanceTreino;
    }

    public void setIndicePerformanceTreino(float indicePerformanceTreino) {
        this.indicePerformanceTreino = indicePerformanceTreino;
    }
}
