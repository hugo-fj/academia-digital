package br.com.techugo.academia.service;

import br.com.techugo.academia.model.AvaliacaoFisica;
import br.com.techugo.academia.model.form.AvaliacaoFisicaForm;
import br.com.techugo.academia.model.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface AvaliacaoFisicaService {

    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    void delete(Long id);

}
