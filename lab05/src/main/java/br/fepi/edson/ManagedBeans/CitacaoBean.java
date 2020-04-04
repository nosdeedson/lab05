package br.fepi.edson.ManagedBeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CitacaoBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String nome;
	private String sobrenome;
	private String nomeCompleto;
	
	public CitacaoBean() {
		super();
	}
	
	public void citacao() {
		String t = this.sobrenome.toUpperCase();
		this.nomeCompleto = t + ", " + this.nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	

}
