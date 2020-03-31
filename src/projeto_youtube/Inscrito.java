package projeto_youtube;

public class Inscrito extends Pessoa{
	private String login;
	private int toAssistindo;
	
	public Inscrito(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.toAssistindo = 0;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getToAssistindo() {
		return toAssistindo;
	}

	public void setToAssistindo(int toAssistindo) {
		this.toAssistindo = toAssistindo;
	}

	@Override
	public String toString() {
		return "Inscrito: " + super.toString() + "login = " + login + 
			   ",\ntoAssistindo = " + toAssistindo;
	}
	
	
	
	
	
	

}
