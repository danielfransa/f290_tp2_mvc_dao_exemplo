package services;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import org.junit.platform.commons.function.Try;

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
        try {
            dao.salvar(pContato);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Falha ao Salvar", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public ContatoVO atualizar(ContatoVO pContato) throws Exception {
        try {
            if(pContato.getId() == null){
                throw new Exception("Id obrigatório");
            }
            if(buscarPorId(pContato.getId()) == null){
                throw new Exception("Id não encontrado");
            }
            dao.atualizar(pContato);
            return buscarPorId(pContato.getId());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Falha ao Atualizar", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
    }

    @Override
    public ContatoVO buscarPorEmail(String pEmail) throws Exception {
        try {
            return dao.buscarPorEmail(pEmail);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Falha ao Buscar", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
    }

    @Override
    public ContatoVO buscarPorId(Integer pId) throws Exception {
        try {
            return dao.buscarPorId(pId);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Falha ao Buscar", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
    }

    @Override
    public List<ContatoVO> buscarTodos() {
        try {
            return dao.buscarTodos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Falha ao Buscar", JOptionPane.ERROR_MESSAGE);
            throw new Error(e);
        }
    }

    @Override
    public void excluir(Integer pId) throws Exception {
        try {
            if(buscarPorId(pId) == null){
                throw new Exception("Id não encontrado");
            }
            dao.excluir(pId);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Falha ao Excluir", JOptionPane.ERROR_MESSAGE);
        }
    }
}
