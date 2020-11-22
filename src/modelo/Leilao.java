/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.*;
/**
 *
 * @author MAICON
 */
public class Leilao {
    private String descricao;
    private ArrayList<Lance> lances;

    public Leilao(String descricao) {
        this.descricao = descricao;
        lances = new ArrayList<>();
    }
 
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Lance> getLances() {
        return lances;
    }

    public void propoe(Lance lance){
        lances.add(lance);
    }
    
}
