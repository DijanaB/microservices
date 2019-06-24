package delete.ctrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import delete.reps.KlijentRepository;
import delete.reps.KreditRepository;
import delete.jpa.Kredit;
import delete.jpa.Klijent;

@RestController
public class DELETERestController {

	@Autowired
	private KlijentRepository klijentRepository;
	
	@Autowired
	private KreditRepository kreditRepository;
	
	@DeleteMapping (value = "klijent/{id}")
	public ResponseEntity<Klijent> deleteKlijent(@PathVariable("id") Integer id){
		if(!klijentRepository.existsById(id))
			return new ResponseEntity<Klijent>(HttpStatus.NO_CONTENT);
		klijentRepository.deleteById(id);
		return new ResponseEntity<Klijent>(HttpStatus.OK);
	}
	
	@DeleteMapping("kredit/{id}")
	public ResponseEntity<Kredit> deleteKredit(@PathVariable ("id") Integer id){
		if(!kreditRepository.existsById(id))
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		kreditRepository.deleteById(id);
		/*if(id == -100)
			jdbcTemplate.execute("INSERT INTO \"kredit\"(\"id\", \"naziv\", \"oznaka\", \"opis\")VALUES(-100, 'Naziv test', 'Oznaka test', 'Opis test')");
		 */
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
