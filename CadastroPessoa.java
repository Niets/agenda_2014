import java.io.*;

public class CadastroPessoa {

    public static void main(String[] args) throws IOException {
        
        //Iniciando leitor
        InputStream entradaSistema = System.in;
        InputStreamReader leitor = new InputStreamReader(entradaSistema);
        BufferedReader leitorEntrada = new BufferedReader(leitor);
        String entradaTeclado;
        
        //Criação dos objetos do sistema
        ControlePessoa umControle = new ControlePessoa();
        Pessoa umaPessoa = new Pessoa();
        
        //Interação programa-usuãrio
        System.out.println("Digite o nome da Pessoa:");
        entradaTeclado = leitorEntrada.readLine();
        String umNome = entradaTeclado;
        umaPessoa.setNome(umNome);
        
        System.out.println("Digite o telefone da Pessoa:");
        entradaTeclado = leitorEntrada.readLine();
        String umTelefone = entradaTeclado;
        umaPessoa.setTelefone(umTelefone);    
        
        umControle.adicionar(umaPessoa);
        
    
    }


}
