package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "jogo")
public class Jogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date data;
    private String adversario;
    private String jogadoresParticipantes;
    private String resultado;
    private int resultadoP1;
    private int resultadoP2;
    private int resultadoP3;
    private int resultadoP4;
    private String competicao;
    private String arbitros;
    private String escalao;
    private String local;
    private String climaApi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getAdversario() {
        return adversario;
    }

    public void setAdversario(String adversario) {
        this.adversario = adversario;
    }

    public String getJogadoresParticipantes() {
        return jogadoresParticipantes;
    }

    public void setJogadoresParticipantes(String jogadoresParticipantes) {
        this.jogadoresParticipantes = jogadoresParticipantes;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public int getResultadoP1() {
        return resultadoP1;
    }

    public void setResultadoP1(int resultadoP1) {
        this.resultadoP1 = resultadoP1;
    }

    public int getResultadoP2() {
        return resultadoP2;
    }

    public void setResultadoP2(int resultadoP2) {
        this.resultadoP2 = resultadoP2;
    }

    public int getResultadoP3() {
        return resultadoP3;
    }

    public void setResultadoP3(int resultadoP3) {
        this.resultadoP3 = resultadoP3;
    }

    public int getResultadoP4() {
        return resultadoP4;
    }

    public void setResultadoP4(int resultadoP4) {
        this.resultadoP4 = resultadoP4;
    }

    public String getCompeticao() {
        return competicao;
    }

    public void setCompeticao(String competicao) {
        this.competicao = competicao;
    }

    public String getArbitros() {
        return arbitros;
    }

    public void setArbitros(String arbitros) {
        this.arbitros = arbitros;
    }

    public String getEscalao() {
        return escalao;
    }

    public void setEscalao(String escalao) {
        this.escalao = escalao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getClimaApi() {
        return climaApi;
    }

    public void setClimaApi(String climaApi) {
        this.climaApi = climaApi;
    }
}


