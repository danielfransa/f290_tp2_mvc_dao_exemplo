package main.services;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.model.contato.ContatoVO;
import main.model.contato.dao.IContatoDAO;

public class ContatoService implements IContatoService{

    final private Logger logger = Logger
            .getLogger(ContatoService.class.getName());

    private final IContatoDAO dao;

    public ContatoService(IContatoDAO dao) {
        this.dao = dao;
    }

    @Override
    public void salvar(ContatoVO pContato) {
        try {
            dao.salvar(pContato);
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getLocalizedMessage());
        }
    }

    @Override
    public ContatoVO buscarPorEmail(String pEmail) throws Exception{
        try {
            Optional<ContatoVO> optional = dao.buscarPorEmail(pEmail);
            if(optional.isPresent()) {
                return optional.get(); 
            }
            
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Falha ao buscar contato.", e);
        }
        throw new RuntimeException(String.format("Contato não localizado. E-mail: %s\n", pEmail));
    }

    @Override
    public List<ContatoVO> buscarTodos() {
        try {
            return dao.buscarTodos();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Falha ao buscar contatos.", e);
            return Collections.emptyList();
        }
    }
    

    @Override
    public void excluir(Integer pId) throws Exception{
        try {
            dao.excluir(pId);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Falha ao excluir contato.", e);
            throw e;
        }
    }
    
}
