package com.cliente.domain.repositories.filter;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class ClienteFilter {
	private Long id;
	private String nome;
	private String nomeMae;
	private LocalDate dataNascimento;
	private boolean ativo;
}
