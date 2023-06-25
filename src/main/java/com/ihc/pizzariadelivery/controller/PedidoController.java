package com.ihc.pizzariadelivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import com.ihc.pizzariadelivery.model.Pedido;
import com.ihc.pizzariadelivery.service.PedidoService;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/pedido")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PedidoController {
    private PedidoService pedidoService;

    @Autowired
    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<Pedido> cadastrar(@RequestBody Pedido pedido) {
        return ResponseEntity.status(HttpStatus.CREATED).body(pedidoService.cadastrar(pedido));
    }

    @PutMapping("/atualizarid/{id}")
    public ResponseEntity<Pedido> atualizarId(@RequestBody Pedido pedido) {
        ResponseEntity<Pedido> response = null;
        if (Objects.nonNull(pedido.getId()) && pedidoService.buscarPorId(pedido.getId()).isPresent()) {
            response = ResponseEntity.status(HttpStatus.OK).body(pedidoService.atualizar(pedido));
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

    @PutMapping("/atualizarped/{pedidoNumero}")
    public ResponseEntity<Pedido> atualizarped(@RequestBody Pedido pedido) {
        ResponseEntity<Pedido> response = null;
        if (Objects.nonNull(pedido.getPedidoNumero()) && pedidoService.buscarPorPedidoNumero(pedido.getPedidoNumero()).isPresent()) {
            response = ResponseEntity.status(HttpStatus.OK).body(pedidoService.atualizar(pedido));
        } else {
            response = ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return response;
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Pedido>> buscarTodos() {
        return ResponseEntity.status(HttpStatus.OK).body(pedidoService.buscarTodos());
    }

    @GetMapping("/buscarid/{id}")
    public ResponseEntity<Optional<Pedido>> buscarPorId(@PathVariable Long id) {
        ResponseEntity<Optional<Pedido>> response = null;
        try {
            response = ResponseEntity.status(HttpStatus.OK).body(pedidoService.buscarPorId(id));
        } catch (HttpClientErrorException.NotFound ex) {
            ex.printStackTrace();
        }
        return response;
    }

    @GetMapping("/buscarped/{pedidoNumero}")
    public ResponseEntity<Optional<Pedido>> buscarPorPedidoNumero(@PathVariable String pedidoNumero) {
        ResponseEntity<Optional<Pedido>> response = null;
        try {
            response = ResponseEntity.status(HttpStatus.OK).body(pedidoService.buscarPorPedidoNumero(pedidoNumero));
        } catch (HttpClientErrorException.NotFound ex) {
            ex.printStackTrace();
        }
        return response;
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarPorId(@PathVariable Long id) {
        if (pedidoService.buscarPorId(id).isPresent()) {
            pedidoService.deletarPorId(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Pedido deletado com sucesso!!");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Pedido não encontrado");
        }
    }
}
