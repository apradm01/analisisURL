package com.analizarurl.demo.service;

import com.analizarurl.demo.model.Keyword;
import com.analizarurl.demo.repository.KeywordRepositorio;
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
public class KeywordService implements KeywordRepositorio{
    private final KeywordRepositorio keywordRepositorio;

    public KeywordService(final KeywordRepositorio keywordRepositorio){
        this.keywordRepositorio = keywordRepositorio;
    }

    @Override
    public void flush() {
        keywordRepositorio.flush();
    }

    @Override
    public <S extends Keyword> S saveAndFlush(S entity) {
        return keywordRepositorio.saveAndFlush(entity);
    }

    @Override
    public <S extends Keyword> List<S> saveAllAndFlush(Iterable<S> entities) {
        return keywordRepositorio.saveAllAndFlush(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Keyword> entities) {
        keywordRepositorio.deleteAllInBatch();
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        keywordRepositorio.deleteAllByIdInBatch(longs);
    }

    @Override
    public void deleteAllInBatch() {
        keywordRepositorio.deleteAllInBatch();
    }

    @Override
    public Keyword getOne(Long aLong) {
        return keywordRepositorio.getOne(aLong);
    }

    @Override
    public Keyword getById(Long aLong) {
        return keywordRepositorio.getById(aLong);
    }

    @Override
    public Keyword getReferenceById(Long aLong) {
        return keywordRepositorio.getReferenceById(aLong);
    }

    @Override
    public <S extends Keyword> Optional<S> findOne(Example<S> example) {
        return keywordRepositorio.findOne(example);
    }

    @Override
    public <S extends Keyword> List<S> findAll(Example<S> example) {
        return keywordRepositorio.findAll(example);
    }

    @Override
    public <S extends Keyword> List<S> findAll(Example<S> example, Sort sort) {
        return keywordRepositorio.findAll(example,sort);
    }

    @Override
    public <S extends Keyword> Page<S> findAll(Example<S> example, Pageable pageable) {
        return keywordRepositorio.findAll(example,pageable);
    }

    @Override
    public <S extends Keyword> long count(Example<S> example) {
        return keywordRepositorio.count(example);
    }

    @Override
    public <S extends Keyword> boolean exists(Example<S> example) {
        return keywordRepositorio.exists(example);
    }

    @Override
    public <S extends Keyword, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return keywordRepositorio.findBy(example, queryFunction);
    }

    @Override
    public <S extends Keyword> S save(S entity) {
        return keywordRepositorio.save(entity);
    }

    @Override
    public <S extends Keyword> List<S> saveAll(Iterable<S> entities) {
        return keywordRepositorio.saveAll(entities);
    }

    @Override
    public Optional<Keyword> findById(Long aLong) {
        return keywordRepositorio.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return keywordRepositorio.existsById(aLong);
    }

    @Override
    public List<Keyword> findAll() {
        return keywordRepositorio.findAll();
    }

    @Override
    public List<Keyword> findAllById(Iterable<Long> longs) {
        return keywordRepositorio.findAllById(longs);
    }

    @Override
    public long count() {
        return keywordRepositorio.count();
    }

    @Override
    public void deleteById(Long aLong) {
        keywordRepositorio.deleteById(aLong);
    }

    @Override
    public void delete(Keyword entity) {
        keywordRepositorio.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        keywordRepositorio.deleteAllById(longs);
    }

    @Override
    public void deleteAll(Iterable<? extends Keyword> entities) {
        keywordRepositorio.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        keywordRepositorio.deleteAll();
    }

    @Override
    public List<Keyword> findAll(Sort sort) {
        return keywordRepositorio.findAll(sort);
    }

    @Override
    public Page<Keyword> findAll(Pageable pageable) {
        return keywordRepositorio.findAll(pageable);
    }
}
