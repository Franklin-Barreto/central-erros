package br.com.centralerros;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.centralerros.model.Log;
import br.com.centralerros.service.LogService;

@RestController
@RequestMapping("/log")
public class LogController {

	private final LogService logService;

	public LogController(LogService logService) {
		this.logService = logService;
	}

	@PostMapping
	public ResponseEntity<Log> save(@RequestBody Log log) {

		return new ResponseEntity<Log>(logService.save(log), HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<Log>> findAll() {
		return new ResponseEntity<List<Log>>(logService.findAll(), HttpStatus.OK);
	}
}
