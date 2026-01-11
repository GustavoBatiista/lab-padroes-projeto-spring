package br.com.gustavobatista.lab_padraoes_projeto_spring.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String>{

}
