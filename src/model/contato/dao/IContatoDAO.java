package model.contato.dao;

import java.util.List;

import model.contato.ContatoVO;

public interface IContatoDAO {
    void salvar(ContatoVO pContato) throws Exception;

    void atualizar(ContatoVO pContato) throws Exception;

    ContatoVO buscarPorEmail(String pEmail) throws Exception;

    ContatoVO buscarPorId(Integer pId) throws Exception;

    void excluir(Integer pId) throws Exception;

    List<ContatoVO> buscarTodos() throws Exception;

}
