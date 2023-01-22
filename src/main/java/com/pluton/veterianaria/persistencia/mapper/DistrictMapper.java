package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.DistrictPojo;
import com.pluton.veterianaria.persistencia.entity.Distrito;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface DistrictMapper {

    @Mappings({
            @Mapping(source = "idDistrito", target = "districtId"),
            @Mapping(source = "nombreDistrito", target = "name"),
    })
    DistrictPojo toDistrict(Distrito distrito);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "idProvincia", ignore = true),
            @Mapping(target = "provincia", ignore = true)
    })
    Distrito toDistrito(DistrictPojo districtPojo);
}
