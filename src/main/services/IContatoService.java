package main.services;

import java.util.List;

import main.model.contato.ContatoVO;

public interface IContatoService {
    void salvar(ContatoVO pContato) throws Exception;
    ContatoVO buscarPorEmail(String pEmail) throws Exception;
    List<ContatoVO> buscarTodos();
    void excluir(Integer pId) throws Exception;
}
