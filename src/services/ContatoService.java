package services;

import java.util.List;
import java.util.logging.Logger;

import model.contato.ContatoVO;
import model.contato.dao.IContatoDAO;

public class ContatoService implements IContatoService {

    final private Logger logger = Logger.getLogger(ContatoService.class.getName());

    private final IContatoDAO dao;

    public ContatoService(IContatoDAO dao) {
        this.dao = dao;
    }

    @Override
    public void salvar(ContatoVO pContato) throws Exception {
        // TODO: Implementar método
        throw new UnsupportedOperationException("Unimplemented method 'salvar'");
    }

    @Override
    public ContatoVO atualizar(ContatoVO pContato) throws Exception {
        // TODO: Implementar método
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public ContatoVO buscarPorEmail(String pEmail) throws Exception {
        // TODO: Implementar método
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorEmail'");
    }

    @Override
    public ContatoVO buscarPorId(Integer pId) throws Exception {
        // TODO: Implementar método
        throw new UnsupportedOperationException("Unimplemented method 'buscarPorId'");
    }

    @Override
    public List<ContatoVO> buscarTodos() {
        // TODO: Implementar método
        throw new UnsupportedOperationException("Unimplemented method 'buscarTodos'");
    }

    @Override
    public void excluir(Integer pId) throws Exception {
        // TODO: Implementar método
        throw new UnsupportedOperationException("Unimplemented method 'excluir'");
    }
}
