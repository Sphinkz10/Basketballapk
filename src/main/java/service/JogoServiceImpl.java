package service;

import model.Jogo;
import repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JogoServiceImpl implements JogoService {

    @Autowired
    private JogoRepository jogoRepository;

    @Override
    public List<Jogo> findAll() {
        return jogoRepository.findAll();
    }

    @Override
    public Jogo findById(Long id) {
        Optional<Jogo> jogoOptional = jogoRepository.findById(id);
        return jogoOptional.orElse(null);
    }

    @Override
    public Jogo save(Jogo jogo) {
        return jogoRepository.save(jogo);
    }

    @Override
    public void deleteById(Long id) {
        jogoRepository.deleteById(id);
    }
}
