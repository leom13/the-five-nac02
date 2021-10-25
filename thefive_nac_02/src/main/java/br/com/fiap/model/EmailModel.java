package br.com.fiap.model;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class EmailModel {

	private String id;
	private Long clienteId;
	private String nomeCliente;
	private String para;
	private String de;
	private String titulo;
	private String texto;
	private LocalDateTime dataEnvio;
	private StatusEmail statusEmail;
	
	
}
