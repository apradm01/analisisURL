package com.analizarurl.demo.service;

import com.analizarurl.demo.model.Titulo;
import com.analizarurl.demo.repository.TituloRepositorio;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class TituloService implements TituloRepositorio {
    private final TituloRepositorio tituloRepositorio;

    public TituloService(final TituloRepositorio tituloRepositorio){
        this.tituloRepositorio = tituloRepositorio;
    }

    @Override
    public void flush() {
        tituloRepositorio.flush();
    }

    @Override
    public <S extends Titulo> S saveAndFlush(S entity) {
        return tituloRepositorio.saveAndFlush(entity);
    }

    @Override
    public <S extends Titulo> List<S> saveAllAndFlush(Iterable<S> entities) {
        return tituloRepositorio.saveAllAndFlush(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Titulo> entities) {
        tituloRepositorio.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        tituloRepositorio.deleteAllByIdInBatch(longs);
    }

    @Override
    public void deleteAllInBatch() {
        tituloRepositorio.deleteAllInBatch();
    }

    @Override
    public Titulo getOne(Long aLong) {
        return tituloRepositorio.getOne(aLong);
    }

    @Override
    public Titulo getById(Long aLong) {
        return tituloRepositorio.getById(aLong);
    }

    @Override
    public Titulo getReferenceById(Long aLong) {
        return tituloRepositorio.getReferenceById(aLong);
    }

    @Override
    public <S extends Titulo> Optional<S> findOne(Example<S> example) {
        return tituloRepositorio.findOne(example);
    }

    @Override
    public <S extends Titulo> List<S> findAll(Example<S> example) {
        return tituloRepositorio.findAll(example);
    }

    @Override
    public <S extends Titulo> List<S> findAll(Example<S> example, Sort sort) {
        return tituloRepositorio.findAll(example);
    }

    @Override
    public <S extends Titulo> Page<S> findAll(Example<S> example, Pageable pageable) {
        return tituloRepositorio.findAll(example, pageable);
    }

    @Override
    public <S extends Titulo> long count(Example<S> example) {
        return tituloRepositorio.count(example);
    }

    @Override
    public <S extends Titulo> boolean exists(Example<S> example) {
        return tituloRepositorio.exists(example);
    }

    @Override
    public <S extends Titulo, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return tituloRepositorio.findBy(example, queryFunction);
    }

    @Override
    public <S extends Titulo> S save(S entity) {
        return tituloRepositorio.save(entity);
    }

    @Override
    public <S extends Titulo> List<S> saveAll(Iterable<S> entities) {
        return tituloRepositorio.saveAll(entities);
    }

    @Override
    public Optional<Titulo> findById(Long aLong) {
        return tituloRepositorio.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return tituloRepositorio.existsById(aLong);
    }

    @Override
    public List<Titulo> findAll() {
        return tituloRepositorio.findAll();
    }

    @Override
    public List<Titulo> findAllById(Iterable<Long> longs) {
        return tituloRepositorio.findAllById(longs);
    }

    @Override
    public long count() {
        return tituloRepositorio.count();
    }

    @Override
    public void deleteById(Long aLong) {
        tituloRepositorio.deleteById(aLong);
    }

    @Override
    public void delete(Titulo entity) {
        tituloRepositorio.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        tituloRepositorio.deleteAllById(longs);
    }

    @Override
    public void deleteAll(Iterable<? extends Titulo> entities) {
        tituloRepositorio.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        tituloRepositorio.deleteAll();
    }

    @Override
    public List<Titulo> findAll(Sort sort) {
        return tituloRepositorio.findAll(sort);
    }

    @Override
    public Page<Titulo> findAll(Pageable pageable) {
        return tituloRepositorio.findAll(pageable);
    }
}
