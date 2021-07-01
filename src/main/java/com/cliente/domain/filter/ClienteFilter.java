package com.cliente.domain.filter;

import java.time.OffsetDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class ClienteFilter {

	@DateTimeFormat(iso = ISO.DATE_TIME)
	private OffsetDateTime dataCriacao;
}

