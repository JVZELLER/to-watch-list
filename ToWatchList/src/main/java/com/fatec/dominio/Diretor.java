
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fatec.dominio;

/**
 *
 * @author josev
 */
class Diretor extends Pessoa {

    private String paisOrigem;

    public Diretor(String paisOrigem, String nome) {
        super(nome);
        this.paisOrigem = paisOrigem;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

}