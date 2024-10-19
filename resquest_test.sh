#!/bin/bash

# URL base da API
BASE_URL="http://localhost:8080/produto/api/produto"

# Função para testar cada endpoint

test_endpoints() {
  echo "Testando endpoint: GET /api/produto"
  curl -X GET "$BASE_URL" -H "Content-Type: application/json" -w "\n"

  echo "Testando endpoint: GET /api/produto/{id}"
  curl -X GET "$BASE_URL/1" -H "Content-Type: application/json" -w "\n"

  echo "Testando endpoint: POST /api/produto"
  curl -X POST "$BASE_URL" \
    -H "Content-Type: application/json" \
    -d '{
          "nome": "Produto Teste",
          "quantidade": 10,
          "preco": 29.99,
          "descricao": "Descrição do produto teste"
        }' -w "\n"

  echo "Testando endpoint: PUT /api/produto/{id}"
  curl -X PUT "$BASE_URL/11" \
    -H "Content-Type: application/json" \
    -d '{
          "nome": "Produto Teste Atualizado",
          "quantidade": 15,
          "preco": 39.99,
          "descricao": "Descrição atualizada do produto teste"
        }' -w "\n"

  echo "Testando endpoint: DELETE /api/produto/{id}"
  curl -X DELETE "$BASE_URL/11" -H "Content-Type: application/json" -w "\n"
}

# Executa a função para testar os endpoints
test_endpoints
