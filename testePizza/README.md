# Pizza UDS


Configuração BD

mysql> create database db_example;
mysql> create user 'springuser'@'%' identified by 'ThePassword'; 
mysql> grant all on db_example.* to 'springuser'@'%'; 

Executar com gradle

sudo ./gradlew bootRun


*Endpoints configurados no arquivo Pizza.postman_collection.json para Postman*