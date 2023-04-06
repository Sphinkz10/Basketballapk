package service;

import model.Jogador;
import repository.JogadorRepository;
import service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorServiceImpl implements JogadorService {

    @Autowired
    private JogadorRepository jogadorRepository;

    @Override
    public List<Jogador> findAll() {
        return jogadorRepository.findAll();
    }

    @Override
    public Jogador findById(Long id) {
        return jogadorRepository.findById(id).orElse(null);
    }

    @Override
    public Jogador save(Jogador jogador) {
        return jogadorRepository.save(jogador);
    }

    @Override
    public void deleteById(Long id) {
        jogadorRepository.deleteById(id);
    }
}
