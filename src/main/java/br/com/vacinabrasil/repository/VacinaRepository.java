package br.com.vacinabrasil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vacinabrasil.model.*;

@Repository
public interface VacinaRepository extends JpaRepository<Vacina, Integer>{

}
