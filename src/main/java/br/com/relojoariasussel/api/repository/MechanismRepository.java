package br.com.relojoariasussel.api.repository;

import br.com.relojoariasussel.api.models.Mechanism;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MechanismRepository extends JpaRepository<Mechanism, Long> {
}
