package com.pluton.veterianaria.persistencia;

import com.pluton.veterianaria.domain.EmpresaPojo;
import com.pluton.veterianaria.domain.repository.EmpresaRepositoryDomain;
import com.pluton.veterianaria.persistencia.crud.ComentarioCrudRepository;
import com.pluton.veterianaria.persistencia.crud.EmpresaCrudRepository;
import com.pluton.veterianaria.persistencia.entity.Comentario;
import com.pluton.veterianaria.persistencia.entity.Empresa;
import com.pluton.veterianaria.persistencia.mapper.EmpresaMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class EmpresaRepository implements EmpresaRepositoryDomain {

	@Autowired
	private EmpresaCrudRepository empresaCrudRepository;

	@Autowired
	private ComentarioCrudRepository comentarioCrudRepository;

	@Autowired
	private EmpresaMapper empresaMapper;

	@Override
	public List<EmpresaPojo> getAll() {
		List<Empresa> listEmpresa = (List<Empresa>) empresaCrudRepository.findAll();
		return empresaMapper.toListEmpresaPojo(listEmpresa);
	}

	@Override
	public Optional<EmpresaPojo> getEmpresaPojo(int idEmpresa){
		return empresaCrudRepository.findById(idEmpresa).map(empresa -> empresaMapper.toEmpresaPojo(empresa));
	}

	@Override
	public EmpresaPojo save(EmpresaPojo empresaPojo){
		Empresa empresa = empresaMapper.toEmpresa(empresaPojo);
		return empresaMapper.toEmpresaPojo(empresaCrudRepository.save(empresa));
	}

	@Override
	public void delete (int idEmpresa){
		empresaCrudRepository.deleteById(idEmpresa);
	}

	@Override
	public EmpresaPojo saveComentario(EmpresaPojo empresaPojo) {
		try {
			/*
			Empresa empresa = empresaCrudRepository.findById(empresaPojo.getIdEmpresa()).get();
			Optional<Comentario> comentarioOptional = comentarioCrudRepository.findById(empresaPojo.getComentarios().get(0).getIdComentario());


			if(comentarioOptional.isPresent()){
				Comentario comentario =  comentarioOptional.get();

				empresaMapper.toEmpresa(empresaPojo).getComentarios().get(0);
				empresa.getComentarios().add(comentario);
			}

			return empresaMapper.toEmpresaPojo(empresaCrudRepository.save(empresa));
			 */
			return null;
		} catch (Exception e) {
			System.out.println("ERROR saveComentario: " + e);
			return null;
		}

	}

}