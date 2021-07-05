package com.thx.agregadordeprojetovoluntario.repository;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

import com.thx.agregadordeprojetovoluntario.model.OrganizationModel;

public interface OrganizationRepository extends CrudRepository<OrganizationModel, Integer> {
    List<OrganizationModel> findAll();
}