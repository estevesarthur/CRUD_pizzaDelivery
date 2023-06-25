package com.ihc.pizzariadelivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ihc.pizzariadelivery.model.Pedido;
import com.ihc.pizzariadelivery.repository.PedidoRepository;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    private PedidoRepository pedidoRepository;

    @Autowired
    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido cadastrar(Pedido Pedido) {
        return pedidoRepository.save(Pedido);
    }

    public Pedido atualizar(Pedido Pedido) {
        return pedidoRepository.save(Pedido);
    }

    public List<Pedido> buscarTodos() {
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> buscarPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    public Optional<Pedido> buscarPorPedidoNumero(String pedidoNumero) {
        return pedidoRepository.findByPedidoNumeroContainingIgnoreCase(pedidoNumero);
    }

    public void deletarPorId(Long id) {
        pedidoRepository.deleteById(id);
    }
}
