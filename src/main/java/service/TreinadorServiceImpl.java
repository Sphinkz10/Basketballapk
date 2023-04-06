package service;

import model.Treinador;
import repository.TreinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TreinadorServiceImpl implements TreinadorService {

    @Autowired
    private TreinadorRepository treinadorRepository;

    @Override
    public List<Treinador> findAll() {
        return treinadorRepository.findAll();
    }

    @Override
    public Treinador findById(Long id) {
        Optional<Treinador> treinadorOptional = treinadorRepository.findById(id);
        return treinadorOptional.orElse(null);
    }

    @Override
    public Treinador save(Treinador treinador) {
        return treinadorRepository.save(treinador);
    }

    @Override
    public void deleteById(Long id) {
        treinadorRepository.deleteById(id);
    }
}
