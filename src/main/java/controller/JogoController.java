package controller;

import model.Jogo;
import service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jogos")
public class JogoController {

    @Autowired
    private JogoService jogoService;

    @GetMapping
    public ResponseEntity<List<Jogo>> findAll() {
        List<Jogo> jogos = jogoService.findAll();
        return new ResponseEntity<>(jogos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Jogo> findById(@PathVariable Long id) {
        Jogo jogo = jogoService.findById(id);
        if (jogo != null) {
            return new ResponseEntity<>(jogo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Jogo> save(@RequestBody Jogo jogo) {
        Jogo savedJogo = jogoService.save(jogo);
        return new ResponseEntity<>(savedJogo, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Jogo> update(@PathVariable Long id, @RequestBody Jogo jogo) {
        Jogo existingJogo = jogoService.findById(id);
        if (existingJogo != null) {
            jogo.setId(id);
            Jogo updatedJogo = jogoService.save(jogo);
            return new ResponseEntity<>(updatedJogo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        Jogo jogo = jogoService.findById(id);
        if (jogo != null) {
            jogoService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
