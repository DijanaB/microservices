package put.ctrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import put.reps.KlijentRepository;
import put.jpa.Kredit;
import put.reps.KreditRepository;
import put.reps.RacunRepository;
import put.jpa.TipRacuna;
import put.reps.TipRacunaRepository;
import put.jpa.Racun;
import put.jpa.Klijent;

@RestController
public class PUTRestController {

	@Autowired
	private KlijentRepository klijentRepository;

	@Autowired
	private KreditRepository kreditRepository;

	@Autowired
	private RacunRepository racunRepository;

	@Autowired
	private TipRacunaRepository tipRacunaRepository;

	// update
	@CrossOrigin
	@PutMapping("klijent")
	public ResponseEntity<Klijent> updateKlijent(@RequestBody Klijent klijent) {
		if (!klijentRepository.existsById(klijent.getId()))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		klijentRepository.save(klijent);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// update
	@CrossOrigin
	@PutMapping("kredit")
	public ResponseEntity<Kredit> updateDobavljac(@RequestBody Kredit kredit) {
		if (!kreditRepository.existsById(kredit.getId()))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		kreditRepository.save(kredit);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	// update
	@CrossOrigin
	@PutMapping(value = "racun")
	public ResponseEntity<Void> updateRacun(@RequestBody Racun racun) {
		if (!racunRepository.existsById(racun.getId()))
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		racunRepository.save(racun);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	// update
	@CrossOrigin
	@PutMapping("tip_racuna")
	public ResponseEntity<TipRacuna> updateTipRacuna(@RequestBody TipRacuna tipRacuna) {
		if (!tipRacunaRepository.existsById(tipRacuna.getId()))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		tipRacunaRepository.save(tipRacuna);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
