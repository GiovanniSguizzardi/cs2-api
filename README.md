# cs2-api

API feita em Spring Boot com MySQL para gerenciar modos de jogo do jogo-virtual "CS2".

---

## Como rodar

### 1. Subir o banco com Docker

```bash
docker compose up -d
```

Ou sem o docker-compose:

```bash
docker run -d --name cs2-api-mysql -e MYSQL_ROOT_PASSWORD=root_pwd -e MYSQL_DATABASE=api -p 3306:3306 mysql:8.0
```

### 2. Rodar a aplicação

```bash
./mvnw spring-boot:run
```

A aplicação sobe em `http://localhost:8080`

---

## Swagger

Acesse a documentação em: `http://localhost:8080/`

---

## Rotas

- `GET /api/v1/competitivo` - lista todos
- `GET /api/v1/competitivo/{id}` - busca por id
- `POST /api/v1/competitivo` - cria novo
- `PUT /api/v1/competitivo/{id}` - atualiza
- `DELETE /api/v1/competitivo/{id}` - deleta

---

- `GET /api/v1/casual` - lista todos
- `GET /api/v1/casual/{id}` - busca por id
- `POST /api/v1/casual` - cria novo
- `PUT /api/v1/casual/{id}` - atualiza
- `DELETE /api/v1/casual/{id}` - deleta
