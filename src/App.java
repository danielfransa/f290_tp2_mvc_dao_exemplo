import java.sql.Connection;
import java.util.List;

import model.contato.ContatoVO;
import model.contato.dao.ConexaoFactory;
import model.contato.dao.ContatoDAO;
import services.ContatoService;

public class App {

    static Connection connection;
    static ContatoDAO contatoDAO;
    static ContatoService service;

    public static void main(String[] args) {

        // Segunda parte 
        try {
            setUp();
            Playground playground = new Playground(service);
            playground.executar();
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        // Primeira parte sem ContatoService e sem Playground 
        // try {
        //     Connection connection = ConexaoFactory.getConexao();
        //     System.out.println(connection);
        //     ContatoDAO dao = new ContatoDAO(connection);
        //     ContatoVO c1 = new ContatoVO("José", "jose@gmail.com");
        //     dao.salvar(c1);
        //     List<ContatoVO> contatos = dao.buscarTodos();
        //     System.out.println(contatos);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }


    }

    static void setUp() throws Exception {
        connection = ConexaoFactory.getConexao();
        contatoDAO = new ContatoDAO(connection);
        service = new ContatoService(contatoDAO);
    }
}
