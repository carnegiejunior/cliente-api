package com.cliente.infraestructure.repository.specs;

import java.util.ArrayList;

import javax.persistence.criteria.Predicate;

import org.springframework.data.jpa.domain.Specification;

import com.cliente.domain.models.Cliente;
import com.cliente.domain.repositories.filter.ClienteFilter;

public class ClienteSpecs {

	public static Specification<Cliente> usandoFiltro(ClienteFilter filtro) {
		
		return (root, query, builder) -> {
			var predicates = new ArrayList<Predicate>();

			if (filtro.getId() != null) {
				predicates.add(builder.equal(root.get("clientes"), filtro.getId()));
			}

			return builder.and(predicates.toArray(new Predicate[0]));
		};
	}
}
