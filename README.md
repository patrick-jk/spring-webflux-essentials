# Spring WebFlux Essentials

Source code do Curso "Spring WebFlux Essentials - APIs reativas e escaláveis com Spring WebFlux"

Versão Original: [Spring WebFlux Essentials](https://youtube.com/playlist?list=PL62G310vn6nH5Tgcp5q2a1xCb6CsZJAi7&si=oCGvHRbbHJgbqXC)

### O que aprendi?
- Criação de APIs Reativas
- Pensar de forma funcional e declarativa
- Testes unitários e de integração para WebFlux
- R2DBC
- Reactive Spring Security
- WebFlux OpenAPI

### Minhas Alterações
Além da atualização para o Spring Boot 3, os testes de integração estavam utilizando o mesmo container da aplicação em execução. Para melhorar isso, adicionei a lib TestContainers junto com um script de SQL para inicializar a database.
Dessa forma, basta executar os testes de integração com o Docker engine ligado, que todo o resto da configuração será feito de forma automática;
