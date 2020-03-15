package entities;

public class QuartosVetor {
	private String nome, email;
	private Integer room;

	public QuartosVetor(String nome, String email, Integer room) {
		this.nome = nome;
		this.email = email;
		this.room = room;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getRoom() {
		return room;
	}

	public void setRoom(Integer room) {
		this.room = room;
	}

	public String toString() {
		return room +": "+ nome + ", " + email ;
	}
}
