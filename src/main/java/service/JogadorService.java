package service;

import model.Jogador;
import java.util.List;

public interface JogadorService {
    List<Jogador> findAll();
    Jogador findById(Long id);
    Jogador save(Jogador jogador);
    void deleteById(Long id);
}
