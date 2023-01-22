package com.pluton.veterianaria.persistencia.mapper;

import com.pluton.veterianaria.domain.ClientePojo;
import com.pluton.veterianaria.domain.ComentarioPojo;
import com.pluton.veterianaria.persistencia.entity.Cliente;
import com.pluton.veterianaria.persistencia.entity.Comentario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ComentarioMapper {

    @Mappings({
            @Mapping(source = "idComentario"    , target = "idComentario"   ),
            @Mapping(source = "idCliente"       , target = "idCliente"      ),
            @Mapping(source = "tituloCom"       , target = "tituloCom"      ),
            @Mapping(source = "comentario"      , target = "comentario"     ),
            @Mapping(source = "fechaCom"        , target = "fechaCom"       ),
            @Mapping(source = "calificacionCom" , target = "calificacionCom"),
            @Mapping(source = "estado"          , target = "estado"         ),
            @Mapping(source = "cliente"         , target = "cliente"        )
    })
    ComentarioPojo toComentarioPojo(Comentario comentario);
    List<ComentarioPojo> toComentariosPojo(List<Comentario> comentarios);

    @InheritInverseConfiguration
    Comentario toComentario(ComentarioPojo comentarioPojo);
    List<Comentario> toComentarios(List<ComentarioPojo> ComentariosPojo);
}
