package com.aninfo.repository;

import com.aninfo.model.Transaccion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface TransaccionRepository extends CrudRepository<Transaccion, Long> {

    Transaccion findTransaccionById(Long id);

    List<Transaccion> findByCbu(Long cbu);
    @Override
    List<Transaccion> findAll();

}
