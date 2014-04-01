import java.util.ArrayList;

public class ControlePessoa{

	private ArrayList<Pessoa> listaPessoas;


	public ControlePessoa(){
		this.listaPessoas = new ArrayList<Pessoa>();
	}

	public ArrayList<Pessoa> getListaPessoas() {
		return listaPessoa; 
	}
	
	public void adicionar(String umNome) {
	    Pessoa umaPessoa = new Pessoa(umNome);
	    listaPessoas.add(umaPessoa);
	}
	
	public void adicionar(String umNome, String umTelefone){
	    Pessoa umaPessoa = new Pessoa(umNome, umTelefone);
	    listaPessoas.add(umaPessoa);
	}

    public void adicionar(Pessoa umaPessoa){
        listaPessoas.add(umaPessoa);
    }
	
	
	
}
	
