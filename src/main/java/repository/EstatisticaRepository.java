package repository;

import model.Estatistica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstatisticaRepository extends JpaRepository<Estatistica, Long> {
}
