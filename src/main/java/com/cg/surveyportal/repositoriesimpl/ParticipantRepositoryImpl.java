package com.cg.surveyportal.repositoriesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.cg.surveyportal.entities.Participant;
import com.cg.surveyportal.repositories.IParticipantRepository;

public class ParticipantRepositoryImpl implements IParticipantRepository {

	@Override
	public List<Participant> findAll() {
		
		return null;
	}

	@Override
	public List<Participant> findAll(Sort sort) {

		return null;
	}

	@Override
	public List<Participant> findAllById(Iterable<Long> ids) {
	
		return null;
	}

	@Override
	public <S extends Participant> List<S> saveAll(Iterable<S> entities) {
	
		return null;
	}

	@Override
	public void flush() {
	

	}

	@Override
	public <S extends Participant> S saveAndFlush(S entity) {
	
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<Participant> entities) {
	

	}

	@Override
	public void deleteAllInBatch() {
	

	}

	@Override
	public Participant getOne(Long id) {

		return null;
	}

	@Override
	public <S extends Participant> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Participant> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Participant> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Participant> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Participant> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Participant entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Participant> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public <S extends Participant> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Participant> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Participant> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Participant> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Participant findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
