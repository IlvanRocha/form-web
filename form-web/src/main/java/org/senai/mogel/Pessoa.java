/**
 * 
 */
package org.senai.mogel;

/**
 * @author ilvan
 *
 */
public class Pessoa {

	private int id;
	private String NomeCompleto;
	private String telefone;
	private String DtNascimento;
	private String email;
	private String sexo;
	private String[] tecnologias;
	private String escolaridade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeCompleto() {
		return NomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.NomeCompleto = nomeCompleto;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getDtNascimento() {
		return DtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.DtNascimento = dtNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String[] getTecnologias() {
		return tecnologias;
	}
	public void setTecnologias(String[] tecnologias) {
		this.tecnologias = tecnologias;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	
	
	
}
