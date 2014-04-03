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
        
        System.out.println("Digite a idade da Pessoa");
        entradaTeclado = leitorEntrada.readLine();
        int umaIdade = entradaTeclado;
        umaPessoa.setIdade(umaIdade);
        
        System.out.println("Digite o sexo da Pessoa (Válido apenas M ou F)");
        entradaTeclado = leitorEntrada.readLine();
        char umSexo = entradaTeclado;
        umaPessoa.setSexo(umSexo);
        
        System.out.println("Digite o email da Pessoa:");
        entradaTeclado = leitorEntrada.readLine();
        String umEmail = entradaTeclado;
        umaPessoa.setEmail(umEmail);
        
        System.out.println("Digite o endereço da Pessoa:");
        entradaTeclado = leitorEntrada.readLine();
        String umEndereco = entradaTeclado;
        umaPessoa.setEndereco(umEndereco);
        
        System.out.println("Digite o RG da Pessoa:");
        entradaTeclado = leitorEntrada.readLine();
        String umRg = entradaTeclado;
        umaPessoa.setRg(umRg);
        
        System.out.println("Digite o cpf da Pessoa:");
        entradaTeclado = leitorEntrada.readLine();
        String umCpf = entradaTeclado;
        umaPessoa.setCpf(umCpf);
        
        
        String mensagem = umControle.adicionar(umaPessoa);
        
         //conferindo saída
        System.out.println("=================================");
        System.out.println(mensagem);
        System.out.println("=)");
    
    }


}
