package br.com.techugo.academia.model.form;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

    private Long alunoId;

    private double peso;

    private double altura;
}
