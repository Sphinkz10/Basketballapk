package service;

import model.Jogo;

import java.util.List;

public interface JogoService {
    List<Jogo> findAll();
    Jogo findById(Long id);
    Jogo save(Jogo jogo);
    void deleteById(Long id);
}
