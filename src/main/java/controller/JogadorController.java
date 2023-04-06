package controller;

import model.Jogador;
import service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jogadores")
public class JogadorController {

    @Autowired
    private JogadorService jogadorService;

    @GetMapping
    public ResponseEntity<List<Jogador>> findAll() {
        List<Jogador> jogadores = jogadorService.findAll();
        return new ResponseEntity<>(jogadores, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Jogador> findById(@PathVariable Long id) {
        Jogador jogador = jogadorService.findById(id);
        if (jogador != null) {
            return new ResponseEntity<>(jogador, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Jogador> save(@RequestBody Jogador jogador) {
        Jogador savedJogador = jogadorService.save(jogador);
        return new ResponseEntity<>(savedJogador, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Jogador> update(@PathVariable Long id, @RequestBody Jogador jogador) {
        Jogador existingJogador = jogadorService.findById(id);
        if (existingJogador != null) {
            jogador.setId(id);
            Jogador updatedJogador = jogadorService.save(jogador);
            return new ResponseEntity<>(updatedJogador, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        Jogador jogador = jogadorService.findById(id);
        if (jogador != null) {
            jogadorService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
