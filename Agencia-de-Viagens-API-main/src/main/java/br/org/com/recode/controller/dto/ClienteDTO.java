package br.org.com.recode.controller.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import br.org.com.recode.model.Cliente;

public class ClienteDTO {
	
	private long id;
	private String cpf, nome, tel, senha, email, cidade;
	private LocalDate data_nascimento;
	
	public ClienteDTO() {
		super();
	}

	public ClienteDTO(Cliente cliente) {
		super();
		this.id=cliente.getId();
		this.cpf = cliente.getCpf();
		this.nome = cliente.getNome();
		this.tel = cliente.getTel();
		this.senha = cliente.getSenha();
		this.email = cliente.getEmail();
		this.data_nascimento = cliente.getNasc();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public LocalDate getNasc() {
		return data_nascimento;
	}

	public void setNasc(LocalDate nasc) {
		this.data_nascimento = nasc;
	}
	
	public static List<ClienteDTO> converter(List<Cliente> cliente){
		return cliente.stream().map(ClienteDTO::new).collect(Collectors.toList());
	}
	
}
