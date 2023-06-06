package main.model.contato.dao;

import java.util.List;
import java.util.Optional;

import main.model.contato.ContatoVO;

public interface IContatoDAO {
    void salvar(ContatoVO pContato) throws Exception;

    void atualizar(ContatoVO pContato) throws Exception;

    Optional<ContatoVO> buscarPorEmail(String pEmail) throws Exception;

    void excluir(Integer pId) throws Exception;

    List<ContatoVO> buscarTodos() throws Exception;

}
