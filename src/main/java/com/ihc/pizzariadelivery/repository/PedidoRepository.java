package com.ihc.pizzariadelivery.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ihc.pizzariadelivery.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Long> {
    Optional<Pedido>findByPedidoNumeroContainingIgnoreCase(String pedidoNumero);


}
