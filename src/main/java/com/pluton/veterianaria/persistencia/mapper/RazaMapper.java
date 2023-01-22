package com.pluton.veterianaria.persistencia.mapper;


import com.pluton.veterianaria.domain.RazaPojo;
import com.pluton.veterianaria.persistencia.entity.Raza;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RazaMapper {

    @Mappings({
            @Mapping(source = "idRaza", target = "idRaza"),
            @Mapping(source = "nomRaza", target = "nomRaza"),
    })
    RazaPojo toRazaPojo(Raza raza);

    List<RazaPojo> toRazasPojo(List<Raza> razas);

    @InheritInverseConfiguration
    Raza toRaza(RazaPojo razaPojo);

    List<Raza> toRazas(List<RazaPojo> razaPojos);
}
