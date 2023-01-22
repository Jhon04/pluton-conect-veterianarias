package com.pluton.veterianaria.domain.repository;

import com.pluton.veterianaria.domain.ClientPojo;

import java.util.List;
import java.util.Optional;

public interface ClientRepositoryDomain {
    List<ClientPojo> getAll();
    Optional<List<ClientPojo>> getByDistrict(int districtId);
    Optional<ClientPojo> getClient(int clientId);
    ClientPojo save(ClientPojo clientPojo);
    void delete(int clientId);

}
