package com.ihc.pizzariadelivery.model;

import java.time.LocalDateTime;
import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_pedido")
public class Pedido {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Size(max=5)
  private String pedidoNumero;

  @Size(max = 100)
  private String nome;

  @Size(max = 20)
  private String bairro;

  @Size(max = 10)
  private String cep;

  @Size(max = 40)
  private String rua;

  @Size(max = 6)
  private String numero;

  @Size(max = 30)
  private String complemento;

  @Size(max = 30)
  private String observacoes;

  @Size(max = 12)
  private String celular;

  private String pagamento;

  private String totalPrice;

  private LocalDateTime dataHora;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getPedidoNumero() {
    return pedidoNumero;
  }

  public void setPedidoNumero(String pedidoNumero) {
    this.pedidoNumero = pedidoNumero;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public String getObservacoes() {
    return observacoes;
  }

  public void setObservacoes(String observacoes) {
    this.observacoes = observacoes;
  }

  public String getCelular() {
    return celular;
  }

  public void setCelular(String celular) {
    this.celular = celular;
  }

  public String getPagamento() {
    return pagamento;
  }

  public void setPagamento(String pagamento) {
    this.pagamento = pagamento;
  }

  public String getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
  }

  public LocalDateTime getDataHora() {
    return dataHora;
  }

  public void setDataHora(LocalDateTime dataHora) {
    this.dataHora = dataHora;
  }

  

  
}  