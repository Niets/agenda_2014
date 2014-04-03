public class Pessoa {

    private String nome;
    private int idade;
    private String telefone;
    private char sexo;
    private String email;
    private String endereco;
    private String rg;
    private String cpf;

//construtor

	public Pessoa(){
		
	}
	
	public Pessoa(String umNome){
		nome = umNome;
	}
	
	public Pessoa(String umNome, String umTelefone){
		nome = umNome;
		telefone = umTelefone;
	}




//métodos

    public void setNome(String umNome){
            nome = umNome;

    }

	public String getNome(){
		return nome;
	}

    public void setIdade(int umaIdade){
            idade = umaIdade;

    }

	public int getIdade(){
		return idade;
	}
	
	public void setTelefone(String umTelefone){
		telefone = umTelefone;

	}

	public String getTelefone(){
		return telefone;
	}

	public void setSexo(char umSexo){
		sexo = umSexo;

	}

	public char getSexo(){
		return sexo;
	}	

	public void setEmail(String umEmail){
		email = umEmail;

	}	

	public String getEmail(){
		return email;
	}

	public void setEndereco(String umEndereco){
		endereco = umEndereco;

	}

	public String getEndereco(){
		return endereco;
	}

	public void setRg(String umRG){
		rg = umRG;
	
	}

		public String getRg(){
			return rg;
		}

	public void setCpf(String umCpf){
		cpf = umCpf;

	}

	public String getCpf(){
		return cpf;
	}

}
		
