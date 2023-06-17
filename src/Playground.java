import model.contato.ContatoVO;
import services.ContatoService;

public class Playground {

    private ContatoService service;



    public Playground(ContatoService service) {
        this.service = service;
    }

    public void executar() throws Exception{
        ContatoVO contato = new ContatoVO("Daniel", "dani@gmail.com");

        service.salvar(contato);
        
    }



    public static void main(String[] args) {

        

        //TODO: Criar os objetos necessários para persistir 3 contatos na base de dados [Factory, DAO e Service]

        //TODO: Realizar as chamadas do service executando toas as operações do DAO
    }
}
