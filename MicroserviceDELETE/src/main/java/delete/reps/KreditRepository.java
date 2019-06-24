package delete.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import delete.jpa.Kredit;

public interface KreditRepository extends JpaRepository<Kredit,Integer> {

	Collection<Kredit> findByNazivContainingIgnoreCase(String naziv);
}