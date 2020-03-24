# blog
Desafio Blog Framework

Instruções de uso para execução do sistema Back-End (O front é incorporado no back-end na pasta static ou pode ser executado no VSCODE)

1 - Cirar uma tabela no Postgres com o mesmo nome, usuario e senha que está no application.properties

2 - Abrir o back-ens do blog no IntelliJ ou na sua IDE de preferência

3 - Compilar e executar

4 - Executar a Query contida no data.sql do projeto (resources) em um ambinte de banco de dados de preferência (pgAdmin 4 por exemplo) para popular o banco

5 - Executar no navegador a aplicação pelo endereço htt://localhost:8084 (padrão usado no sistema ou a porta que for configurada no application.properties)

6 - Logar no sistema usando o email e senha da Query que foi usada para popular o banco (cleber@email.com com a senha 123456)

----------------------------------------//---------------------------------------------
Documentação e Testes:
Foi usado o Spring Fox para criar a documentação e pode ser visualizada pelo Swagger.
O back-end possui configurado Swagger para testar os endpoints da aplicação java.
O endereço: http://localhost:8084/swagger-ui.html  (padrão usado no sistema ou a porta que for configurada no application.properties)

Monitoramento:
Caso desejar monitorar o desempenho e diversas outras métricas da aplicação também é possivel habilitar o Actuador no application.properties e no pom.xml onde possui comentarios de moniotramento e descomentar no POM e no application.properties
OBS:
Compilar e executar no IntelliJ o exemplo do link: https://github.com/cleberleao/monitoramento
Que dara acesso ao monitoramento codecentric com um ambiente web.
Entrar no navegador no endereço: http://localhost:8081
----------------------------------------//---------------------------------------------

Instruções de uso para execução do Front-End no VSCODE (necessário ter NODE versão 10 em diante já configurado) 

1 - Abrir o VSCODE

2 - Abrir a aplicação front-end

3 - executar na pasta do projeto front para poder rodar a aplicação
npm install -g angular/cli

4 - executar o projeto: ng serve

5 - abrir o navegador no endereço: http://localhost:4200
