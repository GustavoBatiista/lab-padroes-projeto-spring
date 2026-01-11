package br.com.gustavobatista.lab_padraoes_projeto_spring.gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gustavobatista.lab_padraoes_projeto_spring.gof.model.Cliente;
import br.com.gustavobatista.lab_padraoes_projeto_spring.gof.model.ClienteRepository;
import br.com.gustavobatista.lab_padraoes_projeto_spring.gof.model.Endereco;
import br.com.gustavobatista.lab_padraoes_projeto_spring.gof.model.EnderecoRepository;
import br.com.gustavobatista.lab_padraoes_projeto_spring.gof.service.ClienteService;
import br.com.gustavobatista.lab_padraoes_projeto_spring.gof.service.ViaCepService;



@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    public ClienteRepository clienteRepository;

    @Autowired
    public EnderecoRepository enderecoRepository;

    @Autowired
    public ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos(){
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente){
        getEndereco(cliente);
    }

    private void getEndereco(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
           Endereco novoEndereco = viaCepService.consultarCep(cep);
           enderecoRepository.save(novoEndereco); 
           return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente){
      Optional<Cliente> clienteBd = clienteRepository.findById(id);
      if(clienteBd.isPresent()){
        cliente.setId(id);
        salvarClienteComCep(cliente);
      }
    }

    @Override
    public void deletar(Long id){
      clienteRepository.deleteById(id);
    }
}
