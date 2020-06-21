package br.com.centralerros.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.lang.NonNull;

@Entity
public class Log {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty
	private String description;
	@NonNull
	@Enumerated(EnumType.STRING)
	private Level level;
	@NotEmpty
	private String origin;
	@CreatedDate
	private LocalDateTime createAt;

	public Long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public Level getLevel() {
		return level;
	}

	public String getOrigin() {
		return origin;
	}
}
