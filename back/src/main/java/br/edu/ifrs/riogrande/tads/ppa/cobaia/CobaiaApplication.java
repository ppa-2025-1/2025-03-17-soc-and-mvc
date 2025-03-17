package br.edu.ifrs.riogrande.tads.ppa.cobaia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifrs.riogrande.tads.ppa.cobaia.model.Disciplina;
import br.edu.ifrs.riogrande.tads.ppa.cobaia.repository.DisciplinaRepository;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class CobaiaApplication {

	@Autowired
	private DisciplinaRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(CobaiaApplication.class, args);
	}

	@PostConstruct
	void populate() {
		Disciplina d = new Disciplina();
		d.setCodigo("PPA");
		d.setNome("Princípios e Padrões de Arquitetura");
		d.setCargaHoraria(66);
		System.out.println("Save " + repo.save(d));
		
		Disciplina d2 = new Disciplina();
		d2.setCodigo("TDS");
		d2.setNome("Tópicos em Desenvolvimento de Sistemas");
		d2.setCargaHoraria(33);
		d2.getPreRequisitos().add(d);
		System.out.println("Save " + repo.save(d2));
		
	}
}
