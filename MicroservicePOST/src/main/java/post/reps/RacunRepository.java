package post.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import post.jpa.Klijent;
import post.jpa.Racun;


public interface RacunRepository extends JpaRepository<Racun,Integer> {
	Collection<Racun> findByNazivContainingIgnoreCase(String naziv);
	Collection<Racun> findByKlijent(Klijent klijentn);

	
}