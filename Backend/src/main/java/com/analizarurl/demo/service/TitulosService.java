package com.analizarurl.demo.service;

import com.analizarurl.demo.model.Titulos;
import com.analizarurl.demo.repository.TitulosRepositorio;
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
public class TitulosService implements TitulosRepositorio{
    private final TitulosRepositorio titulosRepositorio;

    public TitulosService(final TitulosRepositorio titulosRepositorio){
        this.titulosRepositorio = titulosRepositorio;
    }

    @Override
    public void flush() {
        titulosRepositorio.flush();
    }

    @Override
    public <S extends Titulos> S saveAndFlush(S entity) {
        return titulosRepositorio.saveAndFlush(entity);
    }

    @Override
    public <S extends Titulos> List<S> saveAllAndFlush(Iterable<S> entities) {
        return titulosRepositorio.saveAllAndFlush(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Titulos> entities) {
        titulosRepositorio.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        titulosRepositorio.deleteAllByIdInBatch(longs);
    }

    @Override
    public void deleteAllInBatch() {
        titulosRepositorio.deleteAllInBatch();
    }

    @Override
    public Titulos getOne(Long aLong) {
        return titulosRepositorio.getOne(aLong);
    }

    @Override
    public Titulos getById(Long aLong) {
        return titulosRepositorio.getById(aLong);
    }

    @Override
    public Titulos getReferenceById(Long aLong) {
        return titulosRepositorio.getReferenceById(aLong);
    }

    @Override
    public <S extends Titulos> Optional<S> findOne(Example<S> example) {
        return titulosRepositorio.findOne(example);
    }

    @Override
    public <S extends Titulos> List<S> findAll(Example<S> example) {
        return titulosRepositorio.findAll(example);
    }

    @Override
    public <S extends Titulos> List<S> findAll(Example<S> example, Sort sort) {
        return titulosRepositorio.findAll(example);
    }

    @Override
    public <S extends Titulos> Page<S> findAll(Example<S> example, Pageable pageable) {
        return titulosRepositorio.findAll(example, pageable);
    }

    @Override
    public <S extends Titulos> long count(Example<S> example) {
        return titulosRepositorio.count(example);
    }

    @Override
    public <S extends Titulos> boolean exists(Example<S> example) {
        return titulosRepositorio.exists(example);
    }

    @Override
    public <S extends Titulos, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return titulosRepositorio.findBy(example, queryFunction);
    }

    @Override
    public <S extends Titulos> S save(S entity) {
        return titulosRepositorio.save(entity);
    }

    @Override
    public <S extends Titulos> List<S> saveAll(Iterable<S> entities) {
        return titulosRepositorio.saveAll(entities);
    }

    @Override
    public Optional<Titulos> findById(Long aLong) {
        return titulosRepositorio.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return titulosRepositorio.existsById(aLong);
    }

    @Override
    public List<Titulos> findAll() {
        return titulosRepositorio.findAll();
    }

    @Override
    public List<Titulos> findAllById(Iterable<Long> longs) {
        return titulosRepositorio.findAllById(longs);
    }

    @Override
    public long count() {
        return titulosRepositorio.count();
    }

    @Override
    public void deleteById(Long aLong) {
        titulosRepositorio.deleteById(aLong);
    }

    @Override
    public void delete(Titulos entity) {
        titulosRepositorio.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        titulosRepositorio.deleteAllById(longs);
    }

    @Override
    public void deleteAll(Iterable<? extends Titulos> entities) {
        titulosRepositorio.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        titulosRepositorio.deleteAll();
    }

    @Override
    public List<Titulos> findAll(Sort sort) {
        return titulosRepositorio.findAll(sort);
    }

    @Override
    public Page<Titulos> findAll(Pageable pageable) {
        return titulosRepositorio.findAll(pageable);
    }
}
