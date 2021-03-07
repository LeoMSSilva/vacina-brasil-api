package br.com.vacinabrasil.model;

import javax.persistence.*;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

@Getter
@Setter
@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false, length = 50)
	private String nome;
	
	@Column(nullable = false, unique = true, length = 50)
	private String email;
	
	@Column(nullable = false, unique = true, length = 11)
	private long cpf;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Column(nullable = false)
	private LocalDate data_de_nascimento;

}