package br.com.centralerros.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.centralerros.model.Log;
import br.com.centralerros.repository.LogRepository;

@Service
public class LogService {

	private final LogRepository logRepository;

	@Autowired
	public LogService(LogRepository logRepository) {
		this.logRepository = logRepository;
	}

	public Log save(Log log) {
		return logRepository.save(log);
	}

	public List<Log> findAll() {
		return logRepository.findAll();
	}

}
