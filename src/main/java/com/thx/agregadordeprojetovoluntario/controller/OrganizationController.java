package com.thx.agregadordeprojetovoluntario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;
import java.util.Optional;
import com.thx.agregadordeprojetovoluntario.model.OrganizationModel;
import com.thx.agregadordeprojetovoluntario.repository.OrganizationRepository;

@RestController
public class OrganizationController {

    @Autowired
    private OrganizationRepository repository;

    @GetMapping(path = "/api/organization")
    public ResponseEntity <Collection<OrganizationModel>> getAll() {
        Collection<OrganizationModel> collection = repository.findAll();
        
        return ResponseEntity.ok().body(collection);
    }

    @GetMapping(path = "/api/organization/{id}")
    public ResponseEntity<OrganizationModel> query(@PathVariable("id") Integer id) {
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/organization/save")
    public OrganizationModel save(@RequestBody OrganizationModel organization) {
        return repository.save(organization);
    }

    @DeleteMapping(path = "/api/organization/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }

    @PutMapping("/api/organization/{id}")
    public ResponseEntity<OrganizationModel> update(@PathVariable("id") Integer id, @RequestBody OrganizationModel organization) {

        Optional<OrganizationModel> organizationData = repository.findById(id);

        if (!organizationData.isPresent()) {
            OrganizationModel _organization = organizationData.get();
            
            _organization.setCnpj(organization.getCnpj());
            _organization.setEndereco(organization.getEndereco());
            _organization.setFone(organization.getFone());
            _organization.setMissao(organization.getMissao());
            _organization.setNomefantasia(organization.getNomefantasia());
            _organization.setImagem(organization.getImagem());
            _organization.setRazaosocial(organization.getRazaosocial());
            _organization.setRepresentante(organization.getRepresentante());
            _organization.setValores(organization.getValores());

            return new ResponseEntity<>(repository.save(_organization), HttpStatus.OK);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
