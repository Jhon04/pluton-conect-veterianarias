package com.pluton.veterianaria.utils.generadorDeClases;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static tabla tablaByEntidad = new tabla();
    static tabla tablaByPojo = new tabla();
    static tabla tablaByMapper = new tabla();
    static tabla tablaByCrudRepository = new tabla();
    static tabla tablaByRepositoryDomain = new tabla();
    static tabla tablaByService = new tabla();
    static tabla tablaByRepository = new tabla();
    static tabla tablaByController = new tabla();
    static String stringTablaBd = "";
    static String URL_BASE = "D:/Archivos de Programas/ProyectoTesis/" + "pluton-conect-veterianarias/src/main/java/com/pluton/veterianaria/";
    static String URL_ENTIDAD = "";
    static String NOMBRE_ARCHIVO = "";
    static String EXTENXION = ".java";
    static String archivoAGenerar = "";

    public static void main(String[] args) {

        try {
            /*----------------------------------------------------*/
            /*  ARCHIVO A CREAR (todos, 1      , 2             , 3   , 4               , 5      , 6     , 7         , 8         ) */
            /*  ARCHIVO A CREAR (todos, entidad, crudRepository, pojo, repositoryDomain, service, mapper, repository, controller) */
            /*----------------------------------------------------*/
            archivoAGenerar = "todos";

            /*------------------------------------------------------------*/
            /* TABLA DE BASE DE DATOS DE REFERENCIA PARA CREAR EL ARCHIVO */
            /*------------------------------------------------------------*/
            stringTablaBd = "CREATE TABLE EMPRESA (\n" +
                    "\tid_empresa INT PRIMARY KEY NOT NULL AUTO_INCREMENT UNIQUE,\n" +
                    "    id_usuario INT NOT NULL,\n" +
                    "    id_distrito INT NOT NULL,\n" +
                    "\n" +
                    "    nombre_emp VARCHAR(255) NOT NULL,\n" +
                    "    descripcion_emp TEXT NOT NULL,\n" +
                    "    email_emp VARCHAR(255),\n" +
                    "    celular_emp CHAR(9),\n" +
                    "\n" +
                    "    img_back_emp VARCHAR(255),\n" +
                    "    img_emp VARCHAR(255) NOT NULL,\n" +
                    "\n" +
                    "    direccion_emp VARCHAR(255) NOT NULL,\n" +
                    "    ubicacion_emp VARCHAR(255) NOT NULL,\n" +
                    "\n" +
                    "    calificacion_emp CHAR(1) NOT NULL,\n" +
                    "    verificacion_emp BOOLEAN NOT NULL,\n" +
                    "\n" +
                    "    estado BOOLEAN NOT NULL,\n" +
                    "    fecha_mod DATE,\n" +
                    "    user_mod INT\n" +
                    ");";

            generarArchivos();
        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo. " +  e);
            e.printStackTrace();
        }
    }

    public static void generarArchivos(){

        if(!archivoAGenerar.isEmpty() && !stringTablaBd.isEmpty()) {
            switch (archivoAGenerar) {
                case "todos":
                    crearArchivoEntidad();
                    crearArchivoPojo();
                    crearArchivoMapper();
                    crearArchivoCrudRepository();
                    crearArchivoRepositoryDomain();
                    crearArchivoService();
                    crearArchivoRepository();
                    crearArchivoController();
                    break;
                case "entidad":
                    crearArchivoEntidad();
                    break;
                case "pojo":
                    crearArchivoPojo();
                    break;
                case "mapper":
                    crearArchivoMapper();
                    break;
                case "crudRepository":
                    crearArchivoCrudRepository();
                    break;
                case "repositoryDomain":
                    crearArchivoRepositoryDomain();
                    break;
                case "service":
                    crearArchivoService();
                    break;
                case "repository":
                    crearArchivoRepository();
                    break;
                case "controller":
                    crearArchivoController();
                    break;
                default:
                    break;
            }
        }
    }

    /*-------------------------------*/
    /*    PARA CREAR CONTROLLER      */
    /*-------------------------------*/
    public static void crearArchivoController() {
        try {
            String contenidoController  = crearController();
            URL_ENTIDAD     = URL_BASE + "web/controller" + "/";
            NOMBRE_ARCHIVO  = tablaByController.getNombreClase();

            FileWriter fileCrearRepository = new FileWriter( URL_ENTIDAD + NOMBRE_ARCHIVO + EXTENXION);
            fileCrearRepository.write(contenidoController);
            fileCrearRepository.close();
        } catch (Exception e){
            System.out.println("ERROR crearArchivoService" + e);
        }
    }

    public static String crearController() {

        /*--------------------*/
        /* NOMBRE DE LA CLASE */
        /*--------------------*/
        if (tablaByEntidad.getNombreClase() == null || tablaByEntidad.getNombreClase().isEmpty()) {
            crearEntidad();
            crearCrudRepository();
            crearPojo();
            crearRepositoryDomain();
            crearService();
            crearMapper();
            crearArchivoRepository();
        }

        tablaByController.setNombreClase(tablaByEntidad.getNombreClase() + "Controller");

        /*---------------------------*/
        /*          HEADER           */
        /*---------------------------*/
        String claseHeader =
                "package com.pluton.veterianaria.web.controller;" + System.lineSeparator() + System.lineSeparator() +

                "import com.pluton.veterianaria.domain." + tablaByPojo.getNombreClase() + ";" + System.lineSeparator() +
                "import com.pluton.veterianaria.domain.services." + tablaByService.getNombreClase() + ";" + System.lineSeparator() +

                "import org.springframework.beans.factory.annotation.Autowired;" + System.lineSeparator() +
                "import org.springframework.web.bind.annotation.*;" + System.lineSeparator() +

                "@RestController" + System.lineSeparator() +
                "@RequestMapping(\"/" + lowerCaseTexto(tablaByEntidad.getNombreClase())  + "\")" + System.lineSeparator() +
                "public class " + tablaByController.getNombreClase() + " {" + System.lineSeparator();

        /*---------------------------*/
        /*           BODY            */
        /*---------------------------*/
        String claseBody = "";
        claseBody += "\t" + "@Autowired" + System.lineSeparator();
        claseBody += "\t" + "private " + tablaByService.getNombreClase() + " " + minusculaPrimeraLetra(tablaByService.getNombreClase()) + ";" + System.lineSeparator() + System.lineSeparator();

        /*---------------------------*/
        /*          FOOTER           */
        /*---------------------------*/
        String claseFooter = "}";

        return  claseHeader + System.lineSeparator() +
                claseBody + System.lineSeparator() +
                claseFooter;
    }


    /*----------------------------------------*/
    /*    PARA CREAR DOMAIN PERSISTENCIA      */
    /*----------------------------------------*/
    public static void crearArchivoRepository() {
        try {
            String contenidoRepository  = crearRepository();
            URL_ENTIDAD     = URL_BASE + "persistencia" + "/";
            NOMBRE_ARCHIVO  = tablaByRepository.getNombreClase();

            FileWriter fileCrearRepository = new FileWriter( URL_ENTIDAD + NOMBRE_ARCHIVO + EXTENXION);
            fileCrearRepository.write(contenidoRepository);
            fileCrearRepository.close();
        } catch (Exception e){
            System.out.println("ERROR crearArchivoService" + e);
        }
    }

    public static String crearRepository() {

        /*--------------------*/
        /* NOMBRE DE LA CLASE */
        /*--------------------*/
        if (tablaByEntidad.getNombreClase() == null || tablaByEntidad.getNombreClase().isEmpty()) {
            crearEntidad();
            crearCrudRepository();
            crearPojo();
            crearRepositoryDomain();
            crearService();
            crearMapper();
        }

        tablaByRepository.setNombreClase(tablaByEntidad.getNombreClase() + "Repository");

        /*---------------------------*/
        /*          HEADER           */
        /*---------------------------*/
        String claseHeader =
                "package com.pluton.veterianaria.persistencia;" + System.lineSeparator() + System.lineSeparator() +

                "import com.pluton.veterianaria.domain." + tablaByPojo.getNombreClase() + ";" + System.lineSeparator() +
                "import com.pluton.veterianaria.domain.repository." + tablaByRepositoryDomain.getNombreClase() + ";" + System.lineSeparator() +
                "import com.pluton.veterianaria.persistencia.crud." + tablaByCrudRepository.getNombreClase() + ";" + System.lineSeparator() +
                "import com.pluton.veterianaria.persistencia.entity." + tablaByEntidad.getNombreClase() + ";" + System.lineSeparator() +
                "import com.pluton.veterianaria.persistencia.mapper." + tablaByMapper.getNombreClase() + ";" + System.lineSeparator() + System.lineSeparator() +

                "import org.springframework.beans.factory.annotation.Autowired;" + System.lineSeparator() +
                "import org.springframework.stereotype.Repository;" + System.lineSeparator() +

                "@Repository" + System.lineSeparator() +
                "public class " + tablaByRepository.getNombreClase() + " implements " + tablaByRepositoryDomain.getNombreClase() + " {" + System.lineSeparator();

        /*---------------------------*/
        /*           BODY            */
        /*---------------------------*/
        String claseBody = "";
        claseBody += "\t" + "@Autowired" + System.lineSeparator();
        claseBody += "\t" + "private " + tablaByCrudRepository.getNombreClase() + " " + minusculaPrimeraLetra(tablaByCrudRepository.getNombreClase()) + ";" + System.lineSeparator() + System.lineSeparator();

        claseBody += "\t" + "@Autowired" + System.lineSeparator();
        claseBody += "\t" + "private " + tablaByMapper.getNombreClase() + " " + minusculaPrimeraLetra(tablaByMapper.getNombreClase()) + ";" + System.lineSeparator();

        /*---------------------------*/
        /*          FOOTER           */
        /*---------------------------*/
        String claseFooter = "}";

        return  claseHeader + System.lineSeparator() +
                claseBody + System.lineSeparator() +
                claseFooter;
    }

    /*----------------------------------*/
    /*    PARA CREAR DOMAIN SERVICE     */
    /*----------------------------------*/
    public static void crearArchivoService() {
        try {
            String contenidoService  = crearService();
            URL_ENTIDAD     = URL_BASE + "domain/services" + "/";
            NOMBRE_ARCHIVO  = tablaByService.getNombreClase();

            FileWriter fileCrearRepositoryDomain = new FileWriter( URL_ENTIDAD + NOMBRE_ARCHIVO + EXTENXION);
            fileCrearRepositoryDomain.write(contenidoService);
            fileCrearRepositoryDomain.close();
        } catch (Exception e){
            System.out.println("ERROR crearArchivoService" + e);
        }
    }

    public static String crearService() {

        /*--------------------*/
        /* NOMBRE DE LA CLASE */
        /*--------------------*/
        if (tablaByEntidad.getNombreClase() == null || tablaByEntidad.getNombreClase().isEmpty()) {
            crearEntidad();
            crearPojo();
            crearRepositoryDomain();
        }

        tablaByService.setNombreClase(tablaByEntidad.getNombreClase() + "Service");

        /*---------------------------*/
        /*          HEADER           */
        /*---------------------------*/
        String claseHeader =
                "package com.pluton.veterianaria.domain.services;" + System.lineSeparator() + System.lineSeparator() +

                "import com.pluton.veterianaria.domain." + tablaByPojo.getNombreClase() + ";" + System.lineSeparator() + System.lineSeparator() +
                "import com.pluton.veterianaria.domain.repository." + tablaByRepositoryDomain.getNombreClase() + ";" + System.lineSeparator() + System.lineSeparator() +

                "import org.springframework.beans.factory.annotation.Autowired;" + System.lineSeparator() +
                "import org.springframework.stereotype.Service;" + System.lineSeparator() + System.lineSeparator() +

                "@Service" + System.lineSeparator() +
                "public class " + tablaByService.getNombreClase() + " {" + System.lineSeparator();

        /*---------------------------*/
        /*           BODY            */
        /*---------------------------*/
        String claseBody = "";
        claseBody += "\t" + "@Autowired" + System.lineSeparator();
        claseBody += "\t" + "private " + tablaByRepositoryDomain.getNombreClase() + " " + minusculaPrimeraLetra(tablaByRepositoryDomain.getNombreClase()) + ";" +System.lineSeparator();

        /*---------------------------*/
        /*          FOOTER           */
        /*---------------------------*/
        String claseFooter = "}";

        return  claseHeader + System.lineSeparator() +
                claseBody + System.lineSeparator() +
                claseFooter;
    }

    /*----------------------------------*/
    /*    PARA CREAR CRUD REPOSITORY    */
    /*----------------------------------*/
    public static void crearArchivoRepositoryDomain() {
        try {
            String contenidoRepositoryDomain  = crearRepositoryDomain();
            URL_ENTIDAD     = URL_BASE + "domain/repository" + "/";
            NOMBRE_ARCHIVO  = tablaByRepositoryDomain.getNombreClase();

            FileWriter fileCrearRepositoryDomain = new FileWriter( URL_ENTIDAD + NOMBRE_ARCHIVO + EXTENXION);
            fileCrearRepositoryDomain.write(contenidoRepositoryDomain);
            fileCrearRepositoryDomain.close();
        } catch (Exception e){
            System.out.println("ERROR crearArchivoRepositoryDomain" + e);
        }
    }

    public static String crearRepositoryDomain() {

        /*--------------------*/
        /* NOMBRE DE LA CLASE */
        /*--------------------*/
        if (tablaByEntidad.getNombreClase() == null || tablaByEntidad.getNombreClase().isEmpty()) {
            crearEntidad();
            crearPojo();
        }

        tablaByRepositoryDomain.setNombreClase(tablaByEntidad.getNombreClase() + "RepositoryDomain");

        /*---------------------------*/
        /*          HEADER           */
        /*---------------------------*/
        String claseHeader =
                "package com.pluton.veterianaria.domain.repository;" + System.lineSeparator() + System.lineSeparator() +

                "import com.pluton.veterianaria.domain." + tablaByPojo.getNombreClase() + ";" + System.lineSeparator() + System.lineSeparator() +

                "public interface " + tablaByRepositoryDomain.getNombreClase() + " {" + System.lineSeparator();

        /*---------------------------*/
        /*           BODY            */
        /*---------------------------*/
        String claseBody = "";

        /*---------------------------*/
        /*          FOOTER           */
        /*---------------------------*/
        String claseFooter = "}";

        return  claseHeader + System.lineSeparator() +
                claseBody + System.lineSeparator() +
                claseFooter;
    }


    /*----------------------------------*/
    /*    PARA CREAR CRUD REPOSITORY    */
    /*----------------------------------*/
    public static void crearArchivoCrudRepository() {
        try {
            String contenidoCrudRepository  = crearCrudRepository();
            URL_ENTIDAD     = URL_BASE + "persistencia/crud" + "/";
            NOMBRE_ARCHIVO  = tablaByCrudRepository.getNombreClase();

            FileWriter fileCrearCrudRepository = new FileWriter( URL_ENTIDAD + NOMBRE_ARCHIVO + EXTENXION);
            fileCrearCrudRepository.write(contenidoCrudRepository);
            fileCrearCrudRepository.close();
        } catch (Exception e){
            System.out.println("ERROR crearArchivoCrudRepository" + e);
        }
    }

    public static String crearCrudRepository() {

        /*--------------------*/
        /* NOMBRE DE LA CLASE */
        /*--------------------*/
        if (tablaByEntidad.getNombreClase() == null || tablaByEntidad.getNombreClase().isEmpty()) {
            crearEntidad();
            crearPojo();
        }

        tablaByCrudRepository.setNombreClase(tablaByEntidad.getNombreClase() + "CrudRepository");

        /*---------------------------*/
        /*          HEADER           */
        /*---------------------------*/
        String claseHeader =
                "package com.pluton.veterianaria.persistencia.crud;" + System.lineSeparator() + System.lineSeparator() +

                "import com.pluton.veterianaria.persistencia.entity." + tablaByEntidad.getNombreClase() + ";" + System.lineSeparator() + System.lineSeparator() +
                "import org.springframework.data.repository.CrudRepository;" + System.lineSeparator() + System.lineSeparator() +

                "public interface " +  tablaByCrudRepository.getNombreClase() + " extends CrudRepository<" + tablaByCrudRepository.getNombreClase() + ", Integer> {" + System.lineSeparator();

        /*---------------------------*/
        /*           BODY            */
        /*---------------------------*/
        String claseBody = "";

        /*---------------------------*/
        /*          FOOTER           */
        /*---------------------------*/
        String claseFooter = "}";

        return  claseHeader + System.lineSeparator() +
                claseBody + System.lineSeparator() +
                claseFooter;
    }




    /*-------------------------*/
    /*    PARA CREAR MAPPER    */
    /*-------------------------*/
    public static void crearArchivoMapper() {
        try {
            String contenidoMapper  = crearMapper();
            URL_ENTIDAD     = URL_BASE + "persistencia/mapper" + "/";
            NOMBRE_ARCHIVO  = tablaByMapper.getNombreClase();

            FileWriter fileCrearMapper = new FileWriter( URL_ENTIDAD + NOMBRE_ARCHIVO + EXTENXION);
            fileCrearMapper.write(contenidoMapper);
            fileCrearMapper.close();
        } catch (Exception e){
            System.out.println("ERROR crearArchivoMapper" + e);
        }
    }

    public static String crearMapper() {

        /*--------------------*/
        /* NOMBRE DE LA CLASE */
        /*--------------------*/
        if (tablaByEntidad.getNombreClase() == null || tablaByEntidad.getNombreClase().isEmpty()) {
            crearEntidad();
            crearPojo();
        }

        tablaByMapper.setNombreClase(tablaByEntidad.getNombreClase() + "Mapper");

        /*---------------------------*/
        /*          HEADER           */
        /*---------------------------*/
        String claseHeader =
            "package com.pluton.veterianaria.persistencia.mapper;" + System.lineSeparator() + System.lineSeparator() +

            "import com.pluton.veterianaria.domain." + tablaByPojo.getNombreClase() + ";" + System.lineSeparator() +
            "import com.pluton.veterianaria.persistencia.entity." + tablaByEntidad.getNombreClase() + ";" + System.lineSeparator() + System.lineSeparator() +

            "import org.mapstruct.InheritInverseConfiguration;" + System.lineSeparator() +
            "import org.mapstruct.Mapper;" + System.lineSeparator() +
            "import org.mapstruct.Mapping;" + System.lineSeparator() +
            "import org.mapstruct.Mappings;" + System.lineSeparator() + System.lineSeparator() +
            "import java.util.List;" + System.lineSeparator() +

            System.lineSeparator() +
            "@Mapper(componentModel = \"spring\", uses = {})" + System.lineSeparator() +
            "public interface " +  tablaByMapper.getNombreClase() + " {" + System.lineSeparator();

        /*---------------------------*/
        /*           BODY            */
        /*---------------------------*/
        String claseBody = "";

        claseBody += "\t" + "@Mappings({" + System.lineSeparator();

        for (ColumnaTabla columna : tablaByPojo.getColumnas()){
            claseBody += "\t\t" + "@Mapping(source = \"" + columna.getNombreVariable() +
                         "\", target = \"" + columna.getNombreVariable() + "\")," + System.lineSeparator();
        }
        claseBody += "\t" + "})" + System.lineSeparator();

        claseBody +=
            "\t" + tablaByPojo.getNombreClase() + " to" + tablaByPojo.getNombreClase() +
            "(" + tablaByEntidad.getNombreClase() + " " +
            lowerCaseTexto(tablaByEntidad.getNombreClase()) + ");" + System.lineSeparator();
        claseBody +=
            "\t" + "List<" + tablaByPojo.getNombreClase() + "> toList" + tablaByPojo.getNombreClase() +
            "(List<" + tablaByEntidad.getNombreClase() + "> list" +
            lowerCaseTexto(tablaByEntidad.getNombreClase()) + ");" + System.lineSeparator();


        claseBody += "\t" + "@InheritInverseConfiguration" + System.lineSeparator();
        claseBody +=
            "\t" + tablaByEntidad.getNombreClase() + " to" + tablaByEntidad.getNombreClase() +
            "(" + tablaByPojo.getNombreClase() + " " +
            lowerCaseTexto(tablaByPojo.getNombreClase()) + ");" + System.lineSeparator();

        claseBody +=
            "\t" + "List<" +tablaByEntidad.getNombreClase() + "> toList" + tablaByEntidad.getNombreClase() +
            "(List<" + tablaByPojo.getNombreClase() + "> list" +
            lowerCaseTexto(tablaByPojo.getNombreClase()) + ");" + System.lineSeparator();
        /*---------------------------*/
        /*          FOOTER           */
        /*---------------------------*/
        String claseFooter = "}";

        return  claseHeader + System.lineSeparator() +
                claseBody + System.lineSeparator() +
                claseFooter;
    }





    /*-------------------------*/
    /*     PARA CREAR POJO     */
    /*-------------------------*/
    public static void crearArchivoPojo() {
        try {
            String contenidoPojo    = crearPojo();
            URL_ENTIDAD             = URL_BASE + "domain" + "/";
            NOMBRE_ARCHIVO          = tablaByPojo.getNombreClase();

            FileWriter fileCrearPojo = new FileWriter( URL_ENTIDAD + NOMBRE_ARCHIVO + EXTENXION);
            fileCrearPojo.write(contenidoPojo);
            fileCrearPojo.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static String crearPojo() {

        /*--------------------*/
        /* NOMBRE DE LA CLASE */
        /*--------------------*/
        if (tablaByEntidad.getNombreClase() == null || tablaByEntidad.getNombreClase().isEmpty()){
            crearEntidad();
        }

        tablaByPojo.setNombreClase(tablaByEntidad.getNombreClase()+"Pojo");

        getColumnasByPojo();

        /*---------------------------*/
        /*          HEADER           */
        /*---------------------------*/
        boolean tieneVarTipDate =
                tablaByPojo.getColumnas().stream()
                        .anyMatch(columna -> columna.getTipoDeDato().equals("Date"));

        String claseHeader = "";
            claseHeader += "package com.pluton.veterianaria.domain;" + System.lineSeparator() + System.lineSeparator();
            if(tieneVarTipDate)
                claseHeader += "import java.util.Date;" + System.lineSeparator();
            claseHeader += "public class " +  tablaByPojo.getNombreClase() + " {" + System.lineSeparator();

        /*---------------------------*/
        /*           BODY            */
        /*---------------------------*/
        String claseBody = "";

        for (ColumnaTabla columna : tablaByPojo.getColumnas()){
            claseBody += "\t" + "private " + columna.getTipoDeDato() + " " + columna.getNombreVariable() + ";" + System.lineSeparator() + System.lineSeparator();
        }

        /*---------------------------*/
        /*          FOOTER           */
        /*---------------------------*/
        String claseFooter = "";
        claseFooter += "\t" + "public " + tablaByPojo.getNombreClase() +"() { }" + System.lineSeparator();

        /*    GETTER AND SETTER     */
        /*--------------------------*/
        for (ColumnaTabla columna : tablaByPojo.getColumnas()) {
            claseFooter += "\t" + "public " +
                    columna.getTipoDeDato() + " get" + mayusculaPrimeraLetra(columna.getNombreVariable()) +
                    "(){ return " + columna.getNombreVariable() + "; }" + System.lineSeparator() + System.lineSeparator();

            claseFooter += "\t" + "public void" + " set" + mayusculaPrimeraLetra(columna.getNombreVariable()) +
                    "("+ columna.getTipoDeDato() + " " + columna.getNombreVariable() +")" +
                    "{this."+ columna.getNombreVariable() + " = " + columna.getNombreVariable() + ";}" + System.lineSeparator() + System.lineSeparator();
        }

        claseFooter += "}";




        return  claseHeader + System.lineSeparator() +
                claseBody + System.lineSeparator() +
                claseFooter;
    }

    public static void getColumnasByPojo() {
        try {
            for (ColumnaTabla columna : tablaByEntidad.getColumnas()) {
                switch (columna.getTipoDeDato()) {
                    case "Boolean":
                        columna.setTipoDeDato("boolean");
                        break;
                    case "Integer":
                        columna.setTipoDeDato("int");
                        break;
                    default:
                        break;
                }
            }
            tablaByPojo.setColumnas(tablaByEntidad.getColumnas());
        }catch (Exception e){
            System.out.println("ERROR getColumnasByPojo: " + e);
        }
    }





    /*-------------------------*/
    /*   PARA CREAR ENTIDAD    */
    /*-------------------------*/
    public static void crearArchivoEntidad() {
        try {
            String contenidoEntidad = crearEntidad();
            URL_ENTIDAD     = URL_BASE + "persistencia/entity" + "/";
            NOMBRE_ARCHIVO  = tablaByEntidad.getNombreClase();

            FileWriter fileCrearEntidad = new FileWriter( URL_ENTIDAD + NOMBRE_ARCHIVO + EXTENXION);
            fileCrearEntidad.write(contenidoEntidad);
            fileCrearEntidad.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static String crearEntidad() {

        /*----------------------------*/
        /* NOMBRE DE LA TABLA Y CLASE */
        /*----------------------------*/
        getNombreTablaAndClass(stringTablaBd);
        getColumnasByEntidad(stringTablaBd);

        /*---------------------------*/
        /*          HEADER           */
        /*---------------------------*/
        boolean tieneVarTipDate =
            tablaByEntidad.getColumnas().stream()
            .anyMatch(columna -> columna.getTipoDeDato().equals("Date"));

        String claseHeader = "";
        claseHeader += "package com.pluton.veterianaria.persistencia.entity;" + System.lineSeparator() + System.lineSeparator();
        claseHeader += "import javax.persistence.*;" + System.lineSeparator();
        claseHeader += "import java.io.Serializable;" + System.lineSeparator();

        if(tieneVarTipDate)
            claseHeader += "import java.util.Date;" + System.lineSeparator();

        claseHeader += System.lineSeparator() + "@Entity" + System.lineSeparator();
        claseHeader += "@Table(name =\""   + tablaByEntidad.getNombreTabla() + "\")" + System.lineSeparator();
        claseHeader += "public class "     + tablaByEntidad.getNombreClase() + " implements Serializable {" + System.lineSeparator();


        /*---------------------------*/
        /*           BODY            */
        /*---------------------------*/
        String claseBody = "";
        claseBody += "\t" + "private static final long serialVersionUID = 1L;" + System.lineSeparator();
        claseBody += "\t" + "@Id" + System.lineSeparator();
        claseBody += "\t" + "@GeneratedValue(strategy = GenerationType.IDENTITY)" + System.lineSeparator();

        for (ColumnaTabla columna : tablaByEntidad.getColumnas()) {
            claseBody += "\t" + "@Column(name = \"" + columna.getNombreColumna() + "\")" + System.lineSeparator();
            claseBody += "\t" + "private " + columna.getTipoDeDato() + " " + columna.getNombreVariable() + ";" + System.lineSeparator() + System.lineSeparator();
        }

        /*---------------------------*/
        /*          FOOTER           */
        /*---------------------------*/
        String claseFooter = "";
        boolean primeraVuelta = true;

        /*  RELACION DE OBJ/TABLA   */
        /*--------------------------*/
        for (ColumnaTabla columnaNew : tablaByEntidad.getColumnas()) {

            if (primeraVuelta) {
                primeraVuelta = false;
                continue;
            }

            if(columnaNew.getNombreVariable().contains("id")) {
                claseFooter += "\t" + "//Use cualquiera de las relaciones @ManyToOne or @OneToMany or OneToOne" + System.lineSeparator();
                claseFooter += "\t" + "@JoinColumn(name = \"" + columnaNew.getNombreColumna() + "\", insertable = false, updatable = false)" + System.lineSeparator();
                claseFooter += "\t" + "private " +
                        columnaNew.getNombreVariable().replace("id", "")  + " " +
                        columnaNew.getNombreColumna().replace("id_", "") +
                        ";" + System.lineSeparator() + System.lineSeparator();
            }
        }

        claseFooter += "\t" + "public " + tablaByEntidad.getNombreClase() +"() {}" + System.lineSeparator();

        /*    GETTER AND SETTER     */
        /*--------------------------*/
        for (ColumnaTabla columna : tablaByEntidad.getColumnas()) {
            claseFooter += "\t" + "public " +
                columna.getTipoDeDato() + " get" + mayusculaPrimeraLetra(columna.getNombreVariable()) +
                "(){ return " + columna.getNombreVariable() + "; }" + System.lineSeparator() + System.lineSeparator();

            claseFooter += "\t" + "public void" + " set" + mayusculaPrimeraLetra(columna.getNombreVariable()) +
                    "("+ columna.getTipoDeDato() + " " + columna.getNombreVariable() +")" +
                    "{this."+ columna.getNombreVariable() + " = " + columna.getNombreVariable() + ";}" + System.lineSeparator() + System.lineSeparator();
        }

        claseFooter += "}";

        return  claseHeader + System.lineSeparator() +
                claseBody + System.lineSeparator() +
                claseFooter;
    }

    public static void getColumnasByEntidad(String input) {
        List<ColumnaTabla> columnasTabla = new ArrayList<>();
        try {
            // Encuentra la posición de la primera apertura de paréntesis
            int startIndex = input.indexOf("(") + 1;
            // Crea una subcadena a partir de esa posición
            String fieldsString = input.substring(startIndex);
            fieldsString = fieldsString.replace("NOT", "");
            fieldsString = fieldsString.replace("NULL", "");
            fieldsString = fieldsString.replace("PRIMARY", "");
            fieldsString = fieldsString.replace("KEY", "");
            fieldsString = fieldsString.replace("AUTO_INCREMENT", "");

            // Patrón para buscar el nombre de la columna
            Pattern columnPattern = Pattern.compile("([a-z_]+)\\s");

            // Patrón para buscar el tipo de dato de la columna
            Pattern dataTypePattern = Pattern.compile("(INT|VARCHAR|CHAR|DATE|BOOLEAN)");

            Matcher columnMatcher = columnPattern.matcher(fieldsString);
            Matcher dataTypeMatcher = dataTypePattern.matcher(fieldsString);

            while (columnMatcher.find() && dataTypeMatcher.find()) {
                String columnName = columnMatcher.group(1);

                String dataType = dataTypeMatcher.group(1);
                if(dataType.equals("INT"))      dataType = "Integer";
                if(dataType.equals("VARCHAR"))  dataType = "String";
                if(dataType.equals("CHAR"))     dataType = "String";
                if(dataType.equals("BOOLEAN"))  dataType = "Boolean";
                if(dataType.equals("DATE"))     dataType = "Date";

                ColumnaTabla columna = new ColumnaTabla();
                columna.setNombreColumna(columnName);
                columna.setNombreVariable(capitalizarTexto(columnName));
                columna.setTipoDeDato(dataType);

                columnasTabla.add(columna);
            }

            tablaByEntidad.setColumnas(columnasTabla);


        }catch (Exception e){
            System.out.println("ERROR getColumnas: " + e);
        }
    }





    /*---------------------------*/
    /*       REUTILIZABLES       */
    /*---------------------------*/
    public static String mayusculaPrimeraLetra(String texto){
        String originalString = "";

        try {
            originalString = texto;
            String modifiedString = originalString.substring(0, 1).toUpperCase() + originalString.substring(1);

            return modifiedString;
        }catch (Exception e){
            System.out.println("ERROR uppercaseTexto: " + e);
            return originalString;
        }
    }
    public static String minusculaPrimeraLetra(String texto){
        String originalString = "";

        try {
            originalString = texto;
            String modifiedString = originalString.substring(0, 1).toLowerCase() + originalString.substring(1);

            return modifiedString;
        }catch (Exception e){
            System.out.println("ERROR uppercaseTexto: " + e);
            return originalString;
        }
    }
    public static void getNombreTablaAndClass(String input) {
        String nombreTabla = "";
        try {
            String pattern = "CREATE TABLE (\\w+)";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(input);

            if(m.find())
                nombreTabla = m.group(1);

            tablaByEntidad.setNombreTabla(lowerCaseTexto(nombreTabla));
            tablaByEntidad.setNombreClase(formatTitle(nombreTabla));
        }catch (Exception e) {
            System.out.println("ERROR in getNombreTabla: " +  e);
        }
    }
    public static String capitalizarTexto(String texto){
        String originalString = "";

        try {
            originalString = texto;
            // Reemplaza "_" por " "
            String modifiedString = originalString.replace("_", " ");

            // Capitaliza la primera letra de cada palabra
            modifiedString = modifiedString.substring(0, 1) + modifiedString.substring(1);

            for (int i = 1; i < modifiedString.length(); i++) {
                if (modifiedString.charAt(i) == ' ') {
                    modifiedString =
                        modifiedString.substring(0, i) +
                        modifiedString.substring(i + 1, i + 2).toUpperCase() +
                        modifiedString.substring(i + 2);
                }
            }

            return modifiedString;
        }catch (Exception e){
            System.out.println("ERROR capitalizarTexto: " + e);
            return originalString;
        }
    }

    public static String uppercaseTexto(String texto){
        String originalString = "";

        try {
            originalString = texto;
            String modifiedString = originalString.substring(0, 1).toUpperCase() + originalString.substring(1).toLowerCase();

            return modifiedString;
        }catch (Exception e){
            System.out.println("ERROR uppercaseTexto: " + e);
            return originalString;
        }
    }


    public static String lowerCaseTexto(String texto){
        String originalString = "";
        try {
            originalString = texto;
            String modifiedString = originalString.toLowerCase();

            return modifiedString;
        }catch (Exception e){
            System.out.println("ERROR lowerCaseTexto" + e);
            return originalString;
        }
    }

    public static String formatTitle(String texto){
        if(texto.contains("_")) {
            String originalString = texto;
            String modifiedString = originalString.replace("_", " ");
            modifiedString = modifiedString.substring(0, 1).toUpperCase() + modifiedString.substring(1).toLowerCase();

            for (int i = 1; i < modifiedString.length(); i++) {
                if (modifiedString.charAt(i) == ' ') {
                    modifiedString =
                            modifiedString.substring(0, i) +
                            modifiedString.substring(i + 1, i + 2).toUpperCase() +
                            modifiedString.substring(i + 2);
                }
            }

            texto = modifiedString;
        } else {
            texto = uppercaseTexto(texto);
        }

        return texto;
    }
}