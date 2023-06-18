import java.util.List;

import model.contato.ContatoVO;
import services.ContatoService;

public class Playground {

    private ContatoService service;



    public Playground(ContatoService service) {
        this.service = service;
    }

    public void executar() throws Exception{
        ContatoVO contato = new ContatoVO("Daniel", "dani@gmail.com");
        ContatoVO contato1 = new ContatoVO("João", "jao@gmail.com");
        ContatoVO contato2 = new ContatoVO("José", "jose@gmail.com");
        
        System.out.println("Salvando contato1");
        service.salvar(contato);
         System.out.println("Salvando contato2");
        service.salvar(contato1);
         System.out.println("Salvando contato3");
        service.salvar(contato2);
        System.out.println();

        System.out.println("Burcar todos");
        List<ContatoVO> contatos = service.buscarTodos();
        System.out.println("Contatos Cadastrados: " + contatos);
        System.out.println("-------------------------------------------------------");

        System.out.println("Burcar por e-mail");
        ContatoVO contato4 = service.buscarPorEmail("dani@gmail.com");
        System.out.println("Contato E-mail = dani@gmail.com" + contato4.toString());
        System.out.println("-----------------------------------------------------------");

        System.out.println("Burcar por id");
        ContatoVO contato5 = service.buscarPorId(1);
        System.out.println("Contato by Id = 1 " + contato5.toString());
        System.out.println("-----------------------------------------------------------");
        
        System.out.println("Atualizar");
        contato5.setNome("Daniel França");
        service.atualizar(contato5);
        System.out.println("O contato com id 1 foi Atualizado: " + contato5.toString());
        System.out.println("-----------------------------------------------------------");

        System.out.println("Excluir");
        ContatoVO contato6 = service.buscarPorId(3);
        System.out.println("Excluir Contato com Id 3");
        service.excluir(contato6.getId());
        System.out.println("Contato Excluido");
        System.out.println("-----------------------------------------------------------");

        contatos = service.buscarTodos();
        System.out.println("Contatos Cadastrados: " + contatos);

        
    }
        //TODO: Criar os objetos necessários para persistir 3 contatos na base de dados [Factory, DAO e Service]

        //TODO: Realizar as chamadas do service executando toas as operações do DAO
    
}
