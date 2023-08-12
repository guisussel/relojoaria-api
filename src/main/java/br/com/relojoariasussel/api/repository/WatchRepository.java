package br.com.relojoariasussel.api.repository;

import br.com.relojoariasussel.api.models.Watch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchRepository extends JpaRepository<Watch, Long> {
}