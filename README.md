# heranca-hibernate

Esse projeto tem o objetivo de demostra a herança do hibernate utilizando tilizando uma Super Classe @MappedSuperclass

O projeto cria duas tabelas Aluno e Projessor onde ambas são estendidas da super classe Pessoa, quando e realizado uma select all em Pessoa e recuperado a informação de ambas as classes.

O projeto foi criado com Srping 3, java 17, OpenApi 2.5.0, Spring security 6.2.4

Para acessar os serviços via Swagger
URL: http://localhost:8080/heranca/swagger-ui/index.html

Foi criado uma tela de login em html e um endpoint login que está comentado, porem não está funcionando.
Foi apenas um teste, porem resolvi deixar no código comentado para um implementação futura.
