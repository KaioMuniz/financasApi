package br.com.kaiomuniz.domain.entities;


import java.time.LocalDate;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import br.com.kaiomuniz.domain.enums.TipoConta;
import lombok.Data;

@Data
@Document(collection = "contas")
public class Conta {

	@Id	
	private UUID id;
	
	@Field("nome")
	private String nome;
	
	@Field("data")
	private LocalDate data;
	
	@Field("valor")
	private Double valor;
	
	@Field("tipo")
	private TipoConta tipo;
	
	@Field("usuario_id")
	private UUID usuarioId;
}
