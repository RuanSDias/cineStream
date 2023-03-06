# cineStream

Uma API para simular a navegação em uma plataforma de streaming.

## Endpoints

  - Usuario
    - [cadastrar](#cadastrar-usuario)
    - apagar
    - listar todos
    - alterar
    - [mostrar detalhes](#detalhes-do-usuario)
   
   -Filmes
    - [cadastrar](#cadastrar-filme)
    - apagar
    - listar todos
    - alterar
    - [mostrar detalhes](#detalhes-do-filme)
    
   - Categoria
    - [cadastrar](#cadastrar-Categoria)
    - apagar
    - listar todas
    - alterar
    - listar filmes da categoria

---

### Cadastrar Usuario

`POST` /cinestream/api/usuario

**Campos da Requisição**

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|---
|nome | texto | sim | o nome do usuário
|data de nascimento | data | sim | a data de nascimento do usuário
|cpf | texto | sim | o numero de cpf do usuário
|usuario_id| int | sim | o id do filme previamente cadastrado

```js
{
    nome: "Filomeu Alberto",
    dataDeLancamento: '1991-08-19',
    cpf: "123.456.789-10",
    usuario_id: 1,
    descricao: "Frankie Quatro-Dedos (Benicio Del Toro) é um ladrão de diamantes que também faz o trabalho de intermediário de peças roubadas"
}
```

**Códigos de Respostas**

| código | descrição
|-|-
| 201 | usuario cadastrado com sucesso
| 400 | campos inválidos

----

### Detalhes do Usuário

`GET` /cinestream/api/usuario/{id}

```js
{
    nome: "Filomeu Alberto",
    dataDeLancamento: '1991-08-19',
    cpf: "123.456.789-10"
    usuario {
        usuario_id: 1,
        nome: "Filomeu Alberto"
    }
}
```

| código | descrição
|-|-
| 200 | dados do usuário retornados
| 404 | não existe usuaário com o id informado

### Cadastrar Filmes

`POST` /cinestream/api/filme

**Campos da Requisição**

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|---
|nome | texto | sim | o nome do filme
|data de lançamento | data | sim | a data de lançamento do filme
|categoria | texto | sim | a categoria ao qual o filme se enquadra
|filme_id| int | sim | o id do filme previamente cadastrado
|categoria_id | int | sim | o id de uma categoria previamente cadastrada
| descricao | texto | sim | um texto sobre o filme

```js
{
    nome: "Snatch, porcos e diamantes",
    dataDeLancamento: '2001-05-11',
    categoria: "Ação",
    conta_id: 1,
    categoria_id: 1,
    descricao: "Frankie Quatro-Dedos (Benicio Del Toro) é um ladrão de diamantes que também faz o trabalho de intermediário de peças roubadas"
}
```

**Códigos de Respostas**

| código | descrição
|-|-
| 201 | filme cadastrado com sucesso
| 400 | campos inválidos

----

### Detalhes do Filme

`GET` /cinestream/api/filme/{id}

```js
{
    nome: "Snatch, porcos e diamantes",
    dataDeLancamento: '2001-05-11',
    filme {
        filme_id: 1,
        nome: "Snatch, porcos e diamantes"
    },
    categoria: {
        categoria_id: 1,
        nome: "Ação",
    }
    descricao: "Frankie Quatro-Dedos (Benicio Del Toro) é um ladrão de diamantes que também faz o trabalho de intermediário de peças roubadas"
}
```

| código | descrição
|-|-
| 200 | dados do filme retornados
| 404 | não existe despesa com o id informado

### Cadastrar Categoria

`POST` /cinestream/api/categoria

**Campos da Requisição**

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|---
|nome | texto | sim | o nome d categoria
|categoria_id | int | sim | o id de uma categoria previamente cadastrada

```js
{
    nome: "Ação",
    categoria_id: 1,
}
```

**Códigos de Respostas**

| código | descrição
|-|-
| 201 | categoria cadastrada com sucesso
| 400 | campos inválidos

----

### Detalhes do Filme

`GET` /cinestream/api/categoria/{id}

```js
{
    nome: "Ação",
    categoria {
        categoria_id: 1,
        nome: "Ação"
    }
}
```

| código | descrição
|-|-
| 200 | dados da categoria retornados
| 404 | não existe categoria com o id informado
