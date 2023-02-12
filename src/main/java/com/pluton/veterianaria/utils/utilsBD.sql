drop database pluton;
create database pluton;


use pluton;

INSERT INTO EMPRESA ( 	id_usuario, id_distrito, id_estado, nombre_emp, descripcion_emp, 
						email_emp, celular_emp, img_back_emp, img_emp, direccion_emp, 
                        ubicacion_emp, calificacion_emp, verificacion_emp, fecha_mod, user_mod) 
	VALUES(
    2, 
    1, 
    1,
    'SEGURITY APOSTOL SANTIAGO SOCIEDAD ANONIMA CERRADA',
    'EMPRESA DE NO SE QUE...',
    'empresaAnonima@gmail.com',
    999333555,
    'http:/imgempresa01.png',
    'http:/imgempresa02.png',
    'AV. LAS CASUARINAS MZA. G3 LOTE. 10 URB. SAN ANTONIO DE CARABAYLLO (AV. TRES CON AV. LAS CASUARINAS) LIMA - LIMA - CARABAYLLO', 
    'X:6548798855498878,Y:6548798855498878', 
    3,
    false,
    '2023-01-20 03:11:36', 
    1);

INSERT INTO CLIENTE ( id_usuario, id_distrito, id_estado, direccion_cli, nombre_cli, ape_paterno_cli, ape_materno_cli, ubicacion_cli, email_cli, celular_cli, img_cli, img_back_cli, fecha_mod, user_mod) 
	VALUES(1,1, 1,'AV.SIMPRE VIVA 506', 'JUAN', 'PEREZ', 'SOZA', 'X:4568455485,Y:245456215425452', 'jpaz@gmail.com', 987654321, 'http:/img01.jpg', 'http:/img02.jpg', '2023-01-20 03:11:36', 1);
    
SELECT * FROM EMPRESA;
SELECT * FROM CLIENTE;
SELECT * FROM USUARIO; /*W$74573306_*/
SELECT * FROM COMENTARIO;
SELECT * FROM DET_EMPRESA_COMENTARIO;
/*------------------------*/
/*------------------------*/
INSERT INTO DISTRITO(id_provincia, id_estado, nombre_dis)
	VALUES(1, 1, 'SAN MARTIN');

INSERT INTO PROVINCIA(id_departamento, id_estado, nombre_pro)
	VALUES(1, 1, 'LIMA');

INSERT INTO DEPARTAMENTO(id_estado, nombre_dep)
	VALUES(1, 'LIMA');

/*--------------------------*/
/*--------------------------*/
INSERT INTO USUARIO(id_tipo_usuario, id_estado, email_usu, password_usu)
	VALUES(1, 1, 'jpaz@gmail.com', '123456');

INSERT INTO USUARIO(id_tipo_usuario, id_estado, email_usu, password_usu)
	VALUES(2, 1, 'empresaAnonima@gmail.com', '123456');

INSERT INTO TIPO_USUARIO(id_estado, nombre_tip_usu)
	VALUES(1, 'CLIENTE');

INSERT INTO TIPO_USUARIO(id_estado, nombre_tip_usu)
	VALUES(1, 'EMPRESA');

/*--------------------------*/
/*--------------------------*/
INSERT INTO ESTADO(descripcion_estado)
	VALUES('activo');




