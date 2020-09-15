package org.generation.PlanteUmaArvore.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.hibernate.type.BlobType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "Postagem")
public class Postagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	@NotNull
	private boolean privacidade;
	
	@NotNull
	@Size(min = 10, max = 500)
	private String descricao;
	
	private BlobType midia;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public boolean isPrivacidade() {
		return privacidade;
	}
	public void setPrivacidade(boolean privacidade) {
		this.privacidade = privacidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BlobType getMidia() {
		return midia;
	}
	public void setMidia(BlobType midia) {
		this.midia = midia;
	}
	
	
}
