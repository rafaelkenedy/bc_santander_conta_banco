package org.example;

import java.math.BigDecimal;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.lang3.tuple.Pair;

public class ContaTerminal {

    private static final AtomicInteger proxNumeroConta = new AtomicInteger(1);
    private final Pair<Integer, String> numero;
    private String agencia;
    private String cliente;
    private BigDecimal saldo;

    public ContaTerminal() {
        int numeroConta = proxNumeroConta.getAndIncrement();
        String uuid = UUID.randomUUID().toString();
        this.numero = Pair.of(numeroConta, uuid);
    }

    public Pair<Integer, String> getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
