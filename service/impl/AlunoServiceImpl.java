package br.com.techugo.academia.service.impl;


import br.com.techugo.academia.model.Aluno;
import br.com.techugo.academia.model.AvaliacaoFisica;
import br.com.techugo.academia.model.form.AlunoForm;
import br.com.techugo.academia.model.form.AlunoUpdateForm;
import br.com.techugo.academia.respository.AlunoRepository;
import br.com.techugo.academia.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        return null;
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll(String dataDeNascimento) {
        return  repository.findAll();

    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
        return null;
    }
}
