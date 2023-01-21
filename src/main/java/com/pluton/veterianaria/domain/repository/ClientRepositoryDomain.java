package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.ClientDomain;

import java.util.List;
import java.util.Optional;

public interface ClientRepositoryDomain {
    List<ClientDomain> getAll();
    Optional<List<ClientDomain>> getByDistrict(int districtId);
    Optional<ClientDomain> getClient(int clientId);
    ClientDomain save(ClientDomain clientDomain);
    void delete(int clientId);

}
