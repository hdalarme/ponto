package xyz.helbertt.ponto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.helbertt.ponto.model.JornadaTrabalho;

@Repository
public interface JornadaTrabalhoRepositoty extends JpaRepository<JornadaTrabalho, Long> {
}
