package br.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
     LocalDate data ;
     
     public Mentoria () {
    	 
     }




	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
	}




	@Override
	public double calcularXp() {
		
		return  xp_padrao + 20;
	}
     
     
}