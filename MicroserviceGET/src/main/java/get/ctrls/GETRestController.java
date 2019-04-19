package get.ctrls;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import get.jpa.Klijent;
import get.jpa.Kredit;
import get.jpa.Racun;
import get.jpa.TipRacuna;
import get.reps.KlijentRepository;
import get.reps.KreditRepository;
import get.reps.RacunRepository;
import get.reps.TipRacunaRepository;

@RestController
public class GETRestController {

	@Autowired
	private KlijentRepository klijentRepository;
	
	@Autowired
	private KreditRepository kreditRepository;
	
	@Autowired
	private RacunRepository racunRepository;
	
	@Autowired
	private TipRacunaRepository tipRacunaRepository;
	
	@GetMapping("kredit")
	public Collection<Kredit> getKrediti(){
		return kreditRepository.findAll();
	}
	@GetMapping("kredit/{id}")
	public Kredit getKredit(@PathVariable ("id") Integer id){
		return kreditRepository.getOne(id);
	}
	@GetMapping("kreditNaziv/{naziv}")
	public Collection<Kredit> getKreditByNaziv(@PathVariable ("naziv") String naziv){
		return kreditRepository.findByNazivContainingIgnoreCase(naziv);
	}
	@GetMapping("klijent")
	public Collection<Klijent> getKlijent(){
		return klijentRepository.findAll();
	}
	@GetMapping("klijent/{id}")
	public Klijent getKlijent(@PathVariable ("id") Integer id){
		return klijentRepository.getOne(id);
	}
	@GetMapping("klijentPrezime/{prezime}")
	public Collection<Klijent> getKlijentByPrezime(@PathVariable ("prezime") String prezime){
		return klijentRepository.findByPrezimeContainingIgnoreCase(prezime);
	}
	@GetMapping("klijentIme/{ime}")
	public Collection<Klijent> getKlijentByIme(@PathVariable ("ime") String ime){
		//KlijentRepository klijentRepository;
		return klijentRepository.findByImeContainingIgnoreCase(ime);
	}
	@GetMapping("racun")
	public Collection<Racun> getRacun(){
		return racunRepository.findAll();
	}
	@GetMapping("racun/{id}")
	public Racun getRacun(@PathVariable ("id") Integer id){
		return racunRepository.getOne(id);
	}
	@GetMapping("racunNaziv/{naziv}")
	public Collection<Racun> getRacunByNaziv(@PathVariable ("naziv") String naziv){
		return racunRepository.findByNazivContainingIgnoreCase(naziv);
	}
	
	@GetMapping(value = "racuniZaKlijenta/{id}")
	public Collection<Racun> racunZaKlijenta(@PathVariable("id") int id){
		Klijent k = klijentRepository.getOne(id);
		return racunRepository.findByKlijent(k);
	}
	@GetMapping("tip_racuna")
	public Collection<TipRacuna> getTipoviRacuna(){
		return tipRacunaRepository.findAll();
	}
	@GetMapping("tip_racuna/{id}")
	public TipRacuna getTipRacuna(@PathVariable ("id") Integer id){
		return tipRacunaRepository.getOne(id);
	}
	@GetMapping("tip_racunaNaziv/{naziv}")
	public Collection<TipRacuna> getTipRacunaByNaziv(@PathVariable ("naziv") String naziv){
		return tipRacunaRepository.findByNazivContainingIgnoreCase(naziv);
	}
}
