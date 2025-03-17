package br.edu.ifrs.riogrande.tads.ppa.cobaia.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifrs.riogrande.tads.ppa.cobaia.model.Disciplina;

@Repository
public interface DisciplinaRepository extends ListCrudRepository<Disciplina, Integer> {
    
}
