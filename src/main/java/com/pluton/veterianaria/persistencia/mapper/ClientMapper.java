package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.ClientDomain;
import com.pluton.veterianaria.persistencia.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DistrictMapper.class})
public interface ClientMapper {

    @Mappings({
            @Mapping(source = "idCliente", target = "clientId"),
            @Mapping(source = "idDistrito", target = "districtId"),
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "celular", target = "cellPhone"),
            @Mapping(source = "direccion", target = "address"),
            @Mapping(source = "distrito", target = "districtDomain")
    })
    ClientDomain toClient(Cliente cliente);
    List<ClientDomain> toClients(List<Cliente> clientes);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "email", ignore = true),
            @Mapping(target = "apePaterno", ignore = true),
            @Mapping(target = "apeMaterno", ignore = true),
            @Mapping(target = "imgBack", ignore = true),
            @Mapping(target = "img", ignore = true),
            @Mapping(target = "ubicacion", ignore = true),
            @Mapping(target = "estado", ignore = true),
            @Mapping(target = "fechMod", ignore = true),
            @Mapping(target = "userMod", ignore = true),
            @Mapping(target = "usuario", ignore = true),
    })
    Cliente toCliente(ClientDomain clientDomain);
    List<Cliente> toClientes(List<ClientDomain> clientDomains);

}
