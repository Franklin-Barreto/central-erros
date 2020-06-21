package br.com.centralerros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.centralerros.model.Log;

public interface LogRepository extends JpaRepository<Log, Long> {

}
