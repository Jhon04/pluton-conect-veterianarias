use pluton;

INSERT INTO CLIENTE ( id_usuario, id_distrito, direccion_cli, nombre_cli, ape_paterno_cli, ape_materno_cli, ubicacion_cli, email_cli, celular_cli, estado, img_cli, img_back_cli, fecha_mod, user_mod)
	VALUES(1,1, 'AV.SIMPRE VIVA 506', 'JUAN', 'PEREZ', 'SOZA', 'X:4568455485,Y:245456215425452', 'jpaz@gmail.com', 987654321, true, 'http:/img01.jpg', 'http:/img02.jpg', '2023-01-20 03:11:36', 1);

/*------------------------*/
/*------------------------*/
INSERT INTO DISTRITO(id_provincia, nombre_dis)
	VALUES(1, 'SAN MARTIN');

INSERT INTO PROVINCIA(id_departamento, nombre_pro)
	VALUES(1, 'LIMA');

INSERT INTO DEPARTAMENTO(nombre_dep)
	VALUES('LIMA');

SELECT * FROM DISTRITO;
SELECT * FROM CLIENTE;
/*--------------------------*/
/*--------------------------*/
INSERT INTO USUARIO(id_tipo_usuario, email_usu, password_usu, estado)
	VALUES(1, 'jpaz@gmail.com', '123456', true);

INSERT INTO TIPO_USUARIO(nombre_tip_usu, estado)
	VALUES('CLIENTE', true);