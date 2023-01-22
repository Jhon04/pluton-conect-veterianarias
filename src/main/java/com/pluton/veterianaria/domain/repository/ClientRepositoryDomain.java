package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.ClientePojo;

import java.util.List;
import java.util.Optional;

public interface ClientRepositoryDomain {
    List<ClientePojo> getAll();
    Optional<List<ClientePojo>> getByDistrict(int districtId);
    Optional<ClientePojo> getClient(int clientId);
    ClientePojo save(ClientePojo clientePojo);
    void delete(int clientId);

}
