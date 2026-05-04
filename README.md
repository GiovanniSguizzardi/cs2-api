# cs2-api

API de modos de jogo do CS2 feita em Spring Boot com MySQL.

---

## Como rodar

### 1. Subir o banco de dados com Docker

```bash
docker-compose up -d
```

Ou sem o docker-compose:

```bash
docker run -d --name mysql -e MYSQL_ROOT_PASSWORD=root_pwd -e MYSQL_DATABASE=api -e MYSQL_USER=new_user -e MYSQL_PASSWORD=my_pwd -p 3306:3306 mysql
```

### 2. Rodar a aplicação

```bash
./mvnw spring-boot:run
```

A aplicação sobe na porta **8080**.

---

## Swagger

Acesse a documentação em: `http://localhost:8080/`

---

## Rotas

- `GET /api/v1/competitivo`          - lista todos
- `GET /api/v1/competitivo/{id}`     - busca por id
- `POST /api/v1/competitivo`         - cria novo
- `PUT /api/v1/competitivo/{id}`     - atualiza
- `DELETE /api/v1/competitivo/{id}`  - deleta

---

- `GET /api/v1/casual`               - lista todos
- `GET /api/v1/casual/{id}`          - busca por id
- `POST /api/v1/casual`              - cria novo
- `PUT /api/v1/casual/{id}`          - atualiza
- `DELETE /api/v1/casual/{id}`       - deleta
