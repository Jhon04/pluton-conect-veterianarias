/*
drop database pluton;
*/

create database pluton;
use pluton;
/*---------------------------*/
/*    TABLAS @ChugnasIvan    */
/*---------------------------*/
CREATE TABLE CLIENTE (
	id_cliente INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_usuario INT NOT NULL,
    id_distrito INT NOT NULL,
    direccion_cli VARCHAR(255) NOT NULL,
	nombre_cli VARCHAR(255) NOT NULL,
	ape_paterno_cli VARCHAR(100) NOT NULL,
    ape_materno_cli VARCHAR(100) NOT NULL,
    ubicacion_cli VARCHAR(255) NOT NULL,
    email_cli VARCHAR(255) NOT NULL,
    celular_cli CHAR(9),
	img_cli VARCHAR(255) NOT NULL,
    img_back_cli VARCHAR(255) NOT NULL,

	estado BOOLEAN NOT NULL,
	fecha_mod DATE,
	user_mod INT
);

CREATE TABLE COMENTARIO (
    id_comentario INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_cliente INT NOT NULL,

    titulo_com varchar(120) NOT NULL,
    comentario TEXT NOT NULL,
    fecha_com DATE NOT NULL,
    calificacion_com CHAR(1) NOT NULL,

    estado BOOLEAN NOT NULL
);

CREATE TABLE DEPARTAMENTO(
    id_departamento INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre_dep VARCHAR(50) NOT NULL
);

CREATE TABLE PROVINCIA (
	id_provincia INT PRIMARY KEY NOT NULL AUTO_INCREMENT UNIQUE,
    id_departamento INT NOT NULL,
    nombre_pro VARCHAR(100) NOT NULL
);

CREATE TABLE DISTRITO (
	id_distrito INT PRIMARY KEY NOT NULL AUTO_INCREMENT UNIQUE,
	id_provincia INT NOT NULL,
    nombre_dis VARCHAR(100) NOT NULL
);

CREATE TABLE DET_EMPRESA_COMENTARIO (
	id_empresa INT NOT NULL,
    id_comentario INT NOT NULL
);

CREATE TABLE EMPRESA (
	id_empresa INT PRIMARY KEY NOT NULL AUTO_INCREMENT UNIQUE,
    id_usuario INT NOT NULL,
    id_distrito INT NOT NULL,

    nombre_emp VARCHAR(255) NOT NULL,
    descripcion_emp TEXT NOT NULL,
    email_emp VARCHAR(255),
    celular_emp CHAR(9),

    img_back_emp VARCHAR(255),
    img_emp VARCHAR(255) NOT NULL,

    direccion_emp VARCHAR(255) NOT NULL,
    ubicacion_emp VARCHAR(255) NOT NULL,

    calificacion_emp CHAR(1) NOT NULL,
    verificacion_emp BOOLEAN NOT NULL,

    estado BOOLEAN NOT NULL,
    fecha_mod DATE,
    user_mod INT
);


/*---------------------------*/
/*    TABLAS @RubiFalconi    */
/*---------------------------*/
CREATE TABLE USUARIO (
	id_usuario INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	id_tipo_usuario INT NOT NULL,
	email_usu VARCHAR(255) NOT NULL,
	password_usu VARCHAR(32) NOT NULL,

	estado BOOLEAN NOT NULL
);

CREATE TABLE TIPO_USUARIO (
    id_tipo_usuario INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre_tip_usu VARCHAR(255) NOT NULL,

    estado BOOLEAN NOT NULL
);

CREATE TABLE HISTORIAL_CLINICO (
	id_mascota INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	id_servicio INT NOT NULL,
	observacion_historial VARCHAR(255) NOT NULL,
	fecha_atencion DATE
);

CREATE TABLE SERVICIO (
	id_servicio INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	id_empresa INT NOT NULL,
	id_tipo_servicio INT NOT NULL,
	id_calendario INT NOT NULL,
	nombre_ser VARCHAR(255) NOT NULL,
	descripcion_ser VARCHAR(255) NOT NULL,
	icon_ser VARCHAR(50) NOT NULL,
	duracion_ser VARCHAR(10) NOT NULL,
	precio_ser DECIMAL(6,2) NOT NULL,

	estado BOOLEAN NOT NULL
);

CREATE TABLE DET_RESERVA_SERVICIO (
	id_det_reserva_servicio INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	id_cita_reserva_atencion INT NOT NULL,
	id_servicio INT NOT NULL
);

CREATE TABLE TIPO_SERVICIO (
	id_tipo_servicio INT PRIMARY KEY NOT NULL AUTO_INCREMENT UNIQUE,
	nombre_tip_serv VARCHAR(255) NOT NULL,

	estado BOOLEAN NOT NULL
);

CREATE TABLE CALENDARIO_SERVICIO (
	id_calendario INT PRIMARY KEY NOT NULL AUTO_INCREMENT UNIQUE,
	mes_ini CHAR(2) NOT NULL,
	mes_fin CHAR(2) NOT NULL,
	semana_ini CHAR(1) NOT NULL,
	semana_fin CHAR(1) NOT NULL,
	dia_ini CHAR(2) NOT NULL,
	dia_fin CHAR(2) NOT NULL,
	hora_ini CHAR(4) NOT NULL,
	hora_fin CHAR(4) NOT NULL,
	dias_semana_no_laborable_ini CHAR(2) NOT NULL,
	dias_semana_no_laborable_fin CHAR(2) NOT NULL,

	estado BOOLEAN NOT NULL
);

/*---------------------------*/
/*  TABLAS @RomarioDaSilva   */
/*---------------------------*/
CREATE TABLE MASCOTA (
    id_mascota INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_tipo_mascota INT NOT NULL,
    nombre_mas varchar(255) NOT NULL,
    edad_mas INT NOT NULL,
    peso_mas decimal(3.3) NOT NULL,
    size_mas decimal(3.3) NOT NULL,

    estado BOOLEAN NOT NULL
);

CREATE TABLE TIPO_MASCOTA (
    id_tipo_mascota INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_raza INT NOT NULL,
    nombre_tip_mas VARCHAR(255) NOT NULL,

    estado BOOLEAN NOT NULL
);

CREATE TABLE RAZA (
    id_raza INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre_raz VARCHAR(255) NOT NULL,

    estado BOOLEAN NOT NULL
);

CREATE TABLE RESERVA_ATENCION (
    id_cita_reserva_atencion INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_cliente INT NOT NULL,
    fecha_cit DATE NOT NULL,
    hora_ini_cit DATETIME NOT NULL,
    hora_fin_cit DATETIME NOT NULL,

    estado BOOLEAN NOT NULL
);

CREATE TABLE DET_CLIENTE_MASCOTA (
    id_mascota INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    id_cliente INT NOT NULL
);


/*----------------------------------*/
/*RELACIONES DE TABLAS @ChugnasIvan */
/*----------------------------------*/
ALTER TABLE CLIENTE
ADD CONSTRAINT FK_CLIENTE_DISTRITO
FOREIGN KEY (id_distrito) REFERENCES DISTRITO (id_distrito);

ALTER TABLE CLIENTE
ADD CONSTRAINT FK_CLIENTE_USUARIO
FOREIGN KEY (id_usuario) REFERENCES USUARIO (id_usuario);

ALTER TABLE COMENTARIO
ADD CONSTRAINT FK_COMENTARIO_CLIENTE
FOREIGN KEY (id_cliente) REFERENCES CLIENTE (id_cliente);

ALTER TABLE DISTRITO
ADD CONSTRAINT FK_DISTRITO_PROVINCIA
FOREIGN KEY (id_provincia) REFERENCES PROVINCIA (id_provincia);

ALTER TABLE PROVINCIA
ADD CONSTRAINT FK_PROVINCIA_DEPARTAMENTO
FOREIGN KEY (id_departamento) REFERENCES DEPARTAMENTO (id_departamento);

ALTER TABLE DET_EMPRESA_COMENTARIO
ADD CONSTRAINT FK_DET_EMPRESA_COMENTARIO_EMPRESA
FOREIGN KEY (id_empresa) REFERENCES EMPRESA (id_empresa);

ALTER TABLE DET_EMPRESA_COMENTARIO
ADD CONSTRAINT FK_DET_EMPRESA_COMENTARIO_COMENTARIO
FOREIGN KEY (id_comentario) REFERENCES COMENTARIO (id_comentario);

ALTER TABLE EMPRESA
ADD CONSTRAINT FK_EMPRESA_USUARIO
FOREIGN KEY (id_usuario) REFERENCES USUARIO (id_usuario);

ALTER TABLE EMPRESA
ADD CONSTRAINT FK_EMPRESA_DISTRITO
FOREIGN KEY (id_distrito) REFERENCES DISTRITO (id_distrito);

/*----------------------------------*/
/*RELACIONES DE TABLAS @RubiFalconi */
/*----------------------------------*/
ALTER TABLE USUARIO
ADD CONSTRAINT FK_USUARIO_TIPO_USUARIO
FOREIGN KEY (id_tipo_usuario) REFERENCES TIPO_USUARIO(id_tipo_usuario);

ALTER TABLE SERVICIO
ADD CONSTRAINT FK_SERVICIO_TIPO_EMPRESA
FOREIGN KEY (id_empresa) REFERENCES EMPRESA(id_empresa);

ALTER TABLE SERVICIO
ADD CONSTRAINT FK_SERVICIO_TIPO_SERVICIO
FOREIGN KEY (id_tipo_servicio) REFERENCES TIPO_SERVICIO (id_tipo_servicio);

ALTER TABLE SERVICIO
ADD CONSTRAINT FK_SERVICIO_CALENDARIO_SERVICIO
FOREIGN KEY (id_calendario) REFERENCES CALENDARIO_SERVICIO (id_calendario);

ALTER TABLE HISTORIAL_CLINICO
ADD CONSTRAINT FK_HISTORIAL_CLINICO_SERVICIO
FOREIGN KEY (id_servicio) REFERENCES SERVICIO (id_servicio);

ALTER TABLE HISTORIAL_CLINICO
ADD CONSTRAINT FK_HISTORIAL_CLINICO_MASCOTA
FOREIGN KEY (id_mascota) REFERENCES MASCOTA (id_mascota);

ALTER TABLE DET_RESERVA_SERVICIO
ADD CONSTRAINT FK_DET_RESERVA_SERVICIO_SERVICIO
FOREIGN KEY (id_servicio) REFERENCES SERVICIO (id_servicio);

ALTER TABLE DET_RESERVA_SERVICIO
ADD CONSTRAINT FK_DET_RESERVA_SERVICIO_RESERVA_ATENCION
FOREIGN KEY (id_cita_reserva_atencion) REFERENCES RESERVA_ATENCION (id_cita_reserva_atencion);

/*----------------------------------*/
/*RELACIONES DE TABLAS @RomaDaSilva */
/*----------------------------------*/
ALTER TABLE TIPO_MASCOTA
ADD CONSTRAINT FK_TIPO_MASCOTA_RAZA
FOREIGN KEY (id_raza) REFERENCES RAZA (id_raza);

ALTER TABLE MASCOTA
ADD CONSTRAINT FK_MASCOTA_TIPO_MASCOTA
FOREIGN KEY (id_tipo_mascota) REFERENCES TIPO_MASCOTA (id_tipo_mascota);

ALTER TABLE DET_CLIENTE_MASCOTA
ADD CONSTRAINT FK_DET_CLIENTE_MASCOTA_MASCOTA
FOREIGN KEY (id_mascota) REFERENCES MASCOTA (id_mascota);

ALTER TABLE DET_CLIENTE_MASCOTA
ADD CONSTRAINT FK_DET_CLIENTE_MASCOTA_CLIENTE
FOREIGN KEY (id_cliente) REFERENCES CLIENTE (id_cliente);

ALTER TABLE RESERVA_ATENCION
ADD CONSTRAINT FK_RESERVA_ATENCION_CLIENTE
FOREIGN KEY (id_cliente) REFERENCES CLIENTE (id_cliente);