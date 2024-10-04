openapi: 3.0.0
info:
  version: '1.0'
  title: Job Aplication API
  description: 'API para cadastro de empresas e oportunidades de empregos abertas nelas, além da possibilidade de adicionar reviews das empresas'
  contact:
    name: Evylla
    url: ''
    email: evyllamaria@gmail.com
paths:
  /jobs:
    get:
      summary: Your GET endpoint
      tags: []
      responses:
        '200':
          description: OK
        '404':
          description: Not Found
      operationId: get-jobs
      description: Retorna todos os jobs cadastrados
    post:
      summary: Your POST endpoint
      tags: []
      responses:
        '200':
          description: OK
        '404':
          description: Not Found
      operationId: post-jobs
      description: Cria uma nova entrada de job
      requestBody:
        description: ''
        content:
          application/json:
            schema:
              type: object
              properties: {}
            examples:
              Example 1:
                value:
                  title: Software Engineer 1
                  description: Test description
                  minSalary: '30000'
                  maxSalary: '40000'
                  location: São Paulo
                  company:
                    id: 2
  '/jobs/{id}':
    parameters:
      - schema:
          type: integer
        name: id
        in: path
        required: true
    get:
      summary: Your GET endpoint
      tags: []
      responses:
        '200':
          description: OK
        '404':
          description: Not Found
      operationId: get-jobs-id
      description: Retorna a entrada com o ID fornecido
    put:
      summary: Your PUT endpoint
      tags: []
      responses:
        '200':
          description: OK
        '404':
          description: Not Found
      operationId: put-jobs-id
      description: Altera a entrada com o ID fornecido
      requestBody:
        content:
          application/json:
            schema:
              type: object
              properties: {}
            examples:
              Example 1:
                value:
                  id: 1
                  title: Software Engineer Updated
                  description: Test description
                  minSalary: '30000'
                  maxSalary: '40000'
                  location: São Paulo
    delete:
      summary: Your DELETE endpoint
      tags: []
      responses:
        '200':
          description: OK
        '404':
          description: Not Found
      operationId: delete-jobs-id
      description: Deleta a entrada com o ID fornecido
  /companies:
    get:
      summary: Your GET endpoint
      tags: []
      responses:
        '200':
          description: OK
        '404':
          description: Not Found
      operationId: get-companies
      description: Retorna todas as entradas de empresas
    post:
      summary: Your POST endpoint
      tags: []
      responses:
        '200':
          description: OK
        '404':
          description: Not Found
      operationId: post-companies
      description: Cria uma nova entrada de empresa
      requestBody:
        content:
          application/json:
            schema:
              type: object
              properties: {}
            examples:
              Example 1:
                value:
                  name: Company two
                  description: Test description
  '/companies/{id}':
    parameters:
      - schema:
          type: integer
        name: id
        in: path
        required: true
    get:
      summary: Your GET endpoint
      tags: []
      responses:
        '200':
          description: OK
        '404':
          description: Not Found
      operationId: get-companies-id
      description: Altera a entrada do ID informado
    put:
      summary: Your PUT endpoint
      tags: []
      responses:
        '200':
          description: OK
        '404':
          description: Not Found
      operationId: put-companies-id
      description: 'do '
      requestBody:
        content:
          application/json:
            schema:
              type: object
              properties: {}
            examples:
              Example 1:
                value:
                  name: Company ONE UPDATED
                  description: Test description
    delete:
      summary: Your DELETE endpoint
      tags: []
      responses:
        '200':
          description: OK
        '404':
          description: Not Found
      operationId: delete-companies-id
      description: Deleta a entrada do ID informado
  /reviews:
    get:
      summary: Your GET endpoint
      tags: []
      responses:
        '200':
          description: OK
        '404':
          description: Not Found
      operationId: get-reviews
      description: Retorna todas as entradas de comentários
    post:
      summary: Your POST endpoint
      tags: []
      responses:
        '200':
          description: OK
        '404':
          description: Not Found
      operationId: post-reviews
      description: Cria um novo comentário
      requestBody:
        content:
          application/json:
            schema:
              type: object
              properties: {}
            examples:
              Example 1:
                value:
                  title: Review 1
                  description: description 3
                  rating: 5
  '/reviews/{id}':
    parameters:
      - schema:
          type: integer
        name: id
        in: path
        required: true
    get:
      summary: Your GET endpoint
      tags: []
      responses:
        '200':
          description: OK
        '404':
          description: Not Found
      operationId: get-reviews-id
      description: Retorna a entrada do ID informado
    put:
      summary: Your PUT endpoint
      tags: []
      responses:
        '200':
          description: OK
        '404':
          description: Not Found
      operationId: put-reviews-id
      description: Altera a entrada do ID informado
      requestBody:
        content:
          application/json:
            schema:
              type: object
              properties: {}
            examples:
              Example 1:
                value:
                  title: Review 2 UPDATED
                  description: description 2 UPDATED
                  rating: 7
    delete:
      summary: Your DELETE endpoint
      tags: []
      responses:
        '200':
          description: OK
        '404':
          description: Not Found
      operationId: delete-reviews-id
      description: Deleta a entrada do ID informado
servers:
  # Added by API Auto Mocking Plugin
  - description: SwaggerHub API Auto Mocking
    url: 'https://virtserver.swaggerhub.com/EVYLLAMARIA/jobapp/1.0'
