package com.thx.agregadordeprojetovoluntario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Organizacao
 */

@Entity @Table(name="organization")
public class OrganizationModel {

    @Id
    public Integer id;

    @Column(nullable = false, length = 18)
    public String cnpj;

    @Column(nullable = false, length = 200)
    public String imagem;

    @Column(nullable = false, length = 100)
    public String razaosocial;  

    @Column(nullable = false, length = 100)
    public String nomefantasia;

    @Column(columnDefinition = "TEXT")
    public String missao;

    @Column(columnDefinition = "TEXT")
    private String valores;

    @Column(nullable = false, length = 100)
    public String representante;

    @Column(nullable = false, length = 100)
    public String endereco;

    @Column(nullable = false, length = 14)
    public String fone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public String getValores() {
        return valores;
    }

    public void setValores(String valores) {
        this.valores = valores;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}