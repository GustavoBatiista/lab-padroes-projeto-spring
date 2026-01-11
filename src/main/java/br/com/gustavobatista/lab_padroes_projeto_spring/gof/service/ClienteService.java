package br.com.gustavobatista.lab_padroes_projeto_spring.gof.service;

import br.com.gustavobatista.lab_padroes_projeto_spring.gof.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
