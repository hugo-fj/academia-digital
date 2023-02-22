package br.com.techugo.academia.service;

import br.com.techugo.academia.model.Matricula;
import br.com.techugo.academia.model.form.MatriculaForm;

import java.util.List;

public interface MatriculaService {

    Matricula create(MatriculaForm form);

    Matricula get(Long id);

    List<Matricula> getAll(String bairro);


    void delete(Long id);
}
