import java.util.ArrayList;

public class ControlePessoa{

	private ArrayList<Pessoa> listaPessoas;


	public ControlePessoa(){
		this.listaPessoas = new ArrayList<Pessoa>();
	}

	public ArrayList<Pessoa> getListaPessoas() {
		return listaPessoas; 
	}
	
	public adicionar(String umNome) {
		String mensagem = "Pessoa adicionada com Sucesso!";
		Pessoa umaPessoa = new Pessoa(umNome);
		listaPessoas.add(umaPessoa);
		return mensagem;
	}
	
	public adicionar(String umNome, String umTelefone){
		String mensagem = "Pessoa adicionada com Sucesso!";
		Pessoa umaPessoa = new Pessoa(umNome, umTelefone);
		listaPessoas.add(umaPessoa);
		return mensagem;
	}
	
	public adicionar(Pessoa umaPessoa){
		String mensagem = "Pessoa adicionada com Sucesso!";
		listaPessoas.add(umaPessoa);
		return mensagem;
	}
	
	public remover(Pessoa umPessoa) {
	    	String mensagem = "Pessoa removida com Sucesso!";
	        listaPessoas.remove(umPessoa);
	        return mensagem;
        }
	
	public Pessoa pesquisar(String nome) {
	        for (Pessoa pessoa: listaPessoas) {
	            if (pessoa.getNome().equalsIgnoreCase(nome))
	            	return pessoa;
        	}
        	return null;
    	}
	
	
}
	
