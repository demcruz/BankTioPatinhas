INSERT INTO CLIENTE (NOME, CPF, EMAIL, PASSWORD1) VALUES('Diego Cruz', '27370088081', 'diego@gmail.com', '12345678');
INSERT INTO CLIENTE (NOME, CPF, EMAIL, PASSWORD1) VALUES('Gei', '06828635051', 'gei@gmail.com', '12345678');
INSERT INTO CLIENTE (NOME, CPF, EMAIL, PASSWORD1) VALUES('Rafael Vitor', '72834545006', 'rafaelvitor@gmail.com', '12345678');
INSERT INTO CLIENTE (NOME, CPF, EMAIL, PASSWORD1) VALUES('Daniel', '45737155099', 'daniel@gmail.com', '12345678');

INSERT INTO CONTA (NUMERODACONTA, TIPODECONTA, SALDOCONTA, IDCLIENTE) VALUES(05654, 'CC', 30000.00, 1);
INSERT INTO CONTA (NUMERODACONTA, TIPODECONTA, SALDOCONTA, IDCLIENTE) VALUES(06653, 'CP', 2000.00, 2);
INSERT INTO CONTA (NUMERODACONTA, TIPODECONTA, SALDOCONTA, IDCLIENTE) VALUES(04652, 'CC', 20000.00, 3);
INSERT INTO CONTA (NUMERODACONTA, TIPODECONTA, SALDOCONTA, IDCLIENTE) VALUES(03651, 'CP', 300200.00, 4);


INSERT INTO TRANSACOES(CONTAORIGEM, CONTADESTINO, VALORTRANSACAO, DATATRANSACAO, IDCONTA) VALUES (
05654,
04652,
200.00,
parsedatetime('17-09-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 
2
);

INSERT INTO TRANSACOES(CONTAORIGEM, CONTADESTINO, VALORTRANSACAO, DATATRANSACAO, IDCONTA) VALUES (
04652, 
03651,
300.00,
parsedatetime('17-09-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS' ), 
3
);

INSERT INTO TRANSACOES(CONTAORIGEM, CONTADESTINO, VALORTRANSACAO, DATATRANSACAO, IDCONTA) VALUES (
04652,
05654,
400.00,
parsedatetime('17-09-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 
4
);

INSERT INTO TRANSACOES(CONTAORIGEM, CONTADESTINO, VALORTRANSACAO, DATATRANSACAO, IDCONTA) VALUES (
04652,
03651, 
400.00,
parsedatetime('17-09-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 
4
);

INSERT INTO TRANSACOES(CONTAORIGEM, CONTADESTINO, VALORTRANSACAO, DATATRANSACAO, IDCONTA) VALUES (
05654,
03651,
300.00, 
parsedatetime('17-09-2020 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 
3
);



 

