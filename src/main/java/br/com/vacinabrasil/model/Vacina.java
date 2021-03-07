package br.com.vacinabrasil.model;

import javax.persistence.*;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

@Getter
@Setter
@Entity
public class Vacina {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 50)
	private String nome_da_vacina;

	@Column(nullable = false, unique = true, length = 50)
	private String email_do_usuario;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(nullable = false)
	private LocalDate data_da_vacinacao;
	
}