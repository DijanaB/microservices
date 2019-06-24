package put.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import put.jpa.Klijent;
import put.jpa.Racun;


public interface RacunRepository extends JpaRepository<Racun,Integer> {
	Collection<Racun> findByNazivContainingIgnoreCase(String naziv);
	Collection<Racun> findByKlijent(Klijent klijentn);

	
}