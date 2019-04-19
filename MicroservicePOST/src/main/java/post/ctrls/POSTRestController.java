package post.ctrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import post.reps.KreditRepository;
import post.reps.RacunRepository;
import post.reps.TipRacunaRepository;
import post.jpa.Klijent;
import post.jpa.Kredit;
import post.jpa.Racun;
import post.jpa.TipRacuna;
import post.reps.KlijentRepository;;

@RestController
public class POSTRestController {
	
	@Autowired
	private KlijentRepository klijentRepository;
	
	@Autowired
	private KreditRepository kreditRepository;
	
	@Autowired
	private RacunRepository racunRepository;
	
	@Autowired
	private TipRacunaRepository tipRacunaRepository;
	
	
	
	// insert
		@CrossOrigin
		@PostMapping("klijent")
		public ResponseEntity<Klijent> insertKlijent(@RequestBody Klijent klijent){
			if(!klijentRepository.existsById(klijent.getId())){
				klijentRepository.save(klijent);
				return new ResponseEntity<>(HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
		
		// insert
		@CrossOrigin
		@PostMapping("kredit")
		public ResponseEntity<Kredit> insertKredit(@RequestBody Kredit kredit){
			if(!kreditRepository.existsById(kredit.getId())){
				kreditRepository.save(kredit);
				return new ResponseEntity<>(HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
		
		//insert
		@CrossOrigin
		@PostMapping(value = "racun")
		public ResponseEntity<Void> insertRacun(@RequestBody Racun racun){
			if(racunRepository.existsById(racun.getId()))
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			
			//racun.setRedniBroj(racunRepository.nextRBr(racun.getKlijentBean().getId())); //red koji sam dodala
			racunRepository.save(racun);
			return new ResponseEntity<Void>(HttpStatus.OK);	
		
		}
		
		// insert
		@CrossOrigin
		@PostMapping("tip_racuna")
		public ResponseEntity<TipRacuna> insertTipRacuna(@RequestBody TipRacuna tipRacuna){
			if(!tipRacunaRepository.existsById(tipRacuna.getId())){
				tipRacunaRepository.save(tipRacuna);
				return new ResponseEntity<>(HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}

	
}
