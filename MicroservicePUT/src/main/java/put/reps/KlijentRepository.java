package put.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import put.jpa.Klijent;

public interface KlijentRepository extends JpaRepository<Klijent,Integer> {
	Collection<Klijent> findByPrezimeContainingIgnoreCase(String prezime);
	Collection<Klijent> findByImeContainingIgnoreCase(String ime);

}