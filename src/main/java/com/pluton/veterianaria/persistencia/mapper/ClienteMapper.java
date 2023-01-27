package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.ClientePojo;
import com.pluton.veterianaria.persistencia.entity.Cliente;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface ClienteMapper {

	@Mappings({
		@Mapping(source = "idCliente", target = "idCliente"),
		@Mapping(source = "idUsuario", target = "idUsuario"),
		@Mapping(source = "idDistrito", target = "idDistrito"),
		@Mapping(source = "idEstado", target = "idEstado"),
		@Mapping(source = "direccionCli", target = "direccionCli"),
		@Mapping(source = "nombreCli", target = "nombreCli"),
		@Mapping(source = "apePaternoCli", target = "apePaternoCli"),
		@Mapping(source = "apeMaternoCli", target = "apeMaternoCli"),
		@Mapping(source = "ubicacionCli", target = "ubicacionCli"),
		@Mapping(source = "emailCli", target = "emailCli"),
		@Mapping(source = "celularCli", target = "celularCli"),
		@Mapping(source = "imgCli", target = "imgCli"),
		@Mapping(source = "imgBackCli", target = "imgBackCli"),
		@Mapping(source = "fechaMod", target = "fechaMod"),
		@Mapping(source = "userMod", target = "userMod")
	})
	ClientePojo toClientePojo(Cliente cliente);
	List<ClientePojo> toListClientePojo(List<Cliente> listcliente);
	@InheritInverseConfiguration
	@Mappings({
			@Mapping(target = "usuario", ignore = true),
			@Mapping(target = "estado", ignore = true),
			@Mapping(target = "distrito", ignore = true)
	})
	Cliente toCliente(ClientePojo clientepojo);
	List<Cliente> toListCliente(List<ClientePojo> listclientepojo);

}