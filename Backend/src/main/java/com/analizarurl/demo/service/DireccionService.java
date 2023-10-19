package com.analizarurl.demo.service;

import com.analizarurl.demo.model.Direccion;
import com.analizarurl.demo.repository.DireccionRepositorio;
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
public class DireccionService implements DireccionRepositorio{
    private final DireccionRepositorio direccionRepositorio;

    public DireccionService(final DireccionRepositorio direccionRepositorio){
        this.direccionRepositorio = direccionRepositorio;
    }

    @Override
    public void flush() {
        direccionRepositorio.flush();
    }

    @Override
    public <S extends Direccion> S saveAndFlush(S entity) {
        return direccionRepositorio.saveAndFlush(entity);
    }

    @Override
    public <S extends Direccion> List<S> saveAllAndFlush(Iterable<S> entities) {
        return direccionRepositorio.saveAllAndFlush(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Direccion> entities) {
        direccionRepositorio.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        direccionRepositorio.deleteAllByIdInBatch(longs);
    }

    @Override
    public void deleteAllInBatch() {
        direccionRepositorio.deleteAllInBatch();
    }

    @Override
    public Direccion getOne(Long aLong) {
        return direccionRepositorio.getOne(aLong);
    }

    @Override
    public Direccion getById(Long aLong) {
        return direccionRepositorio.getById(aLong);
    }

    @Override
    public Direccion getReferenceById(Long aLong) {
        return direccionRepositorio.getReferenceById(aLong);
    }

    @Override
    public <S extends Direccion> Optional<S> findOne(Example<S> example) {
        return direccionRepositorio.findOne(example);
    }

    @Override
    public <S extends Direccion> List<S> findAll(Example<S> example) {
        return direccionRepositorio.findAll(example);
    }

    @Override
    public <S extends Direccion> List<S> findAll(Example<S> example, Sort sort) {
        return direccionRepositorio.findAll(example,sort);
    }

    @Override
    public <S extends Direccion> Page<S> findAll(Example<S> example, Pageable pageable) {
        return direccionRepositorio.findAll(example, pageable);
    }

    @Override
    public <S extends Direccion> long count(Example<S> example) {
        return direccionRepositorio.count(example);
    }

    @Override
    public <S extends Direccion> boolean exists(Example<S> example) {
        return direccionRepositorio.exists(example);
    }

    @Override
    public <S extends Direccion, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return direccionRepositorio.findBy(example, queryFunction);
    }

    @Override
    public <S extends Direccion> S save(S entity) {
        return direccionRepositorio.save(entity);
    }

    @Override
    public <S extends Direccion> List<S> saveAll(Iterable<S> entities) {
        return direccionRepositorio.saveAll(entities);
    }

    @Override
    public Optional<Direccion> findById(Long aLong) {
        return direccionRepositorio.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return direccionRepositorio.existsById(aLong);
    }

    @Override
    public List<Direccion> findAll() {
        return direccionRepositorio.findAll();
    }

    @Override
    public List<Direccion> findAllById(Iterable<Long> longs) {
        return direccionRepositorio.findAllById(longs);
    }

    @Override
    public long count() {
        return direccionRepositorio.count();
    }

    @Override
    public void deleteById(Long aLong) {
        direccionRepositorio.deleteById(aLong);
    }

    @Override
    public void delete(Direccion entity) {
        direccionRepositorio.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        direccionRepositorio.deleteAllById(longs);
    }

    @Override
    public void deleteAll(Iterable<? extends Direccion> entities) {
        direccionRepositorio.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        direccionRepositorio.deleteAll();
    }

    @Override
    public List<Direccion> findAll(Sort sort) {
        return direccionRepositorio.findAll(sort);
    }

    @Override
    public Page<Direccion> findAll(Pageable pageable) {
        return direccionRepositorio.findAll(pageable);
    }
}
