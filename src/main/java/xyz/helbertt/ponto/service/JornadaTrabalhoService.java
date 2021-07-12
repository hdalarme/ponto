package xyz.helbertt.ponto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.helbertt.ponto.model.JornadaTrabalho;
import xyz.helbertt.ponto.repository.JornadaTrabalhoRepositoty;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {

    JornadaTrabalhoRepositoty jornadaTrabalhoRepositoty;

    @Autowired
    public JornadaTrabalhoService(JornadaTrabalhoRepositoty jornadaTrabalhoRepositoty){
        this.jornadaTrabalhoRepositoty = jornadaTrabalhoRepositoty;
    }

    public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepositoty.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaTrabalhoRepositoty.findAll();
    }

    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return jornadaTrabalhoRepositoty.findById(idJornada);
    }

    public JornadaTrabalho update(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepositoty.save(jornadaTrabalho);
    }

    public void deleteById(Long idJornada) {
        jornadaTrabalhoRepositoty.deleteById(idJornada);
    }
}
