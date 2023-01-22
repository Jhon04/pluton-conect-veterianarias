package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.ClientePojo;
import com.pluton.veterianaria.persistencia.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {DistrictMapper.class})
public interface ClienteMapper {

    @Mappings({
            @Mapping(source = "idCliente"   , target = "idCliente"  ),
            @Mapping(source = "idUsuario"   , target = "idUsuario"  ),
            @Mapping(source = "idDistrito"  , target = "idDistrito" ),
            @Mapping(source = "email"       , target = "email"      ),
            @Mapping(source = "nombre"      , target = "nombre"     ),
            @Mapping(source = "apePaterno"  , target = "apePaterno" ),
            @Mapping(source = "celular"     , target = "celular"    ),
            @Mapping(source = "imgBack"     , target = "imgBack"    ),
            @Mapping(source = "img"         , target = "img"        ),
            @Mapping(source = "direccion"   , target = "direccion"  ),
            @Mapping(source = "ubicacion"   , target = "ubicacion"  ),
            @Mapping(source = "fechMod"     , target = "fechMod"    ),
            @Mapping(source = "userMod"     , target = "userMod"    ),
            @Mapping(source = "distrito"    , target = "distrito"   )
    })
    ClientePojo toClientePojo(Cliente cliente);
    List<ClientePojo> toListClientesPojo(List<Cliente> clientes);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "usuario", ignore = true)
    })
    Cliente toCliente(ClientePojo clientePojo);
    List<Cliente> toListClientes(List<ClientePojo> clientesPojos);

}
