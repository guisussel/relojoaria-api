package br.com.relojoariasussel.api.repository;

import br.com.relojoariasussel.api.models.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository  extends JpaRepository<Material, Long> {
}
