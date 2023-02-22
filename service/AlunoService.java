package br.com.techugo.academia.service;

import br.com.techugo.academia.model.Aluno;
import br.com.techugo.academia.model.AvaliacaoFisica;
import br.com.techugo.academia.model.form.AlunoForm;
import br.com.techugo.academia.model.form.AlunoUpdateForm;

import java.util.List;

public interface AlunoService {
    Aluno create(AlunoForm form);

    Aluno get(Long id);

    List<Aluno> getAll(String dataDeNascimento);

    Aluno update(Long id, AlunoUpdateForm formUpdate);

    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}
