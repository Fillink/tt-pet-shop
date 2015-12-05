package br.com.tt.web.pet.controller.bean;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;

@ManagedBean
public class ValidadoConversorBean {

	private Double preco;
	private Long quantidade;
	private Date dataNascimento;
	private String nome;

	public void salvar(){
		System.out.println("Salvando os dados");
	}
	
	public void cancelar(){
		preco = null;
		quantidade = null;
		dataNascimento = null;
		nome = null;
		System.out.println("Cancelar dados da tela");
	}
	
	public void verificar(ActionEvent event){
		String clientId = event.getComponent().getClientId();
		System.out.println("Chamando evento antes do Action");
		System.out.println("Evento lançado por "+clientId);
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Long getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
