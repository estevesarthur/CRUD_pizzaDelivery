package com.ihc.pizzariadelivery.model;

import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
@Table(name = "tb_pedido")
public class Pedido {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="ID")
  private long id;

  @Column(name = "PedidoNumero", nullable = false, length = 5)
  private String pedidoNumero;

  @Column(name = "Nome", nullable = false, length = 120)
  private String nome;

  @Column(name = "Bairro", nullable = false, length = 12)
  private String bairro;

  @Column(name = "Cep", nullable = false, length = 9)
  private String cep;

  @Column(name = "Rua", nullable = false, length = 20)
  private String rua;

  @Column(name = "Numero", nullable = false, length = 4)
  private String numero;

  @Column(name = "Complemento", nullable = false, length = 30)
  private String complemento;

  @Column(name = "Observacoes", nullable = false, length = 30)
  private String observacoes;

  @Column(name = "Celular", nullable = false, length = 12)
  private String celular;

  @Column(name = "Pagamento", nullable = false)
  private String pagamento;

  @Column(name = "TotalPrice", nullable = false)
  private String totalPrice;

  @Column(name = "DataHora", nullable = false)
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