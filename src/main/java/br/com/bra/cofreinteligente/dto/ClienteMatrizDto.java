package br.com.bra.cofreinteligente.dto;

import lombok.Data;

import java.io.Serializable;


@Data
public class ClienteMatrizDto implements Serializable {
    private final Long id;
    private final Long id_Endereco;
    private final String cnpj;
    private final String nome;
}