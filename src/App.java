import java.sql.Connection;
import java.util.List;

import model.contato.ContatoVO;
import model.contato.dao.ConexaoFactory;
import model.contato.dao.ContatoDAO;

public class App {

    public static void main(String[] args) {

        try {
            Connection connection = ConexaoFactory.getConexao();
            System.out.println(connection);
            ContatoDAO dao = new ContatoDAO(connection);
            ContatoVO c1 = new ContatoVO("José", "jose@gmail.com");
            //dao.salvar(c1);
            ContatoVO contatos = dao.buscarPorId(4);
            System.out.println(contatos);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
