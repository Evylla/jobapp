Job Aplication API
==================

API para cadastro de empresas e oportunidades de empregos abertas nelas, além da possibilidade de adicionar reviews das empresas.

Métodos
-------

### Table of Contents

*   [`delete /companies/{id}`](#deleteCompaniesId)
*   [`delete /jobs/{id}`](#deleteJobsId)
*   [`delete /reviews/{id}`](#deleteReviewsId)
*   [`get /companies`](#getCompanies)
*   [`get /companies/{id}`](#getCompaniesId)
*   [`get /jobs`](#getJobs)
*   [`get /jobs/{id}`](#getJobsId)
*   [`get /reviews`](#getReviews)
*   [`get /reviews/{id}`](#getReviewsId)
*   [`post /companies`](#postCompanies)
*   [`post /jobs`](#postJobs)
*   [`post /reviews`](#postReviews)
*   [`put /companies/{id}`](#putCompaniesId)
*   [`put /jobs/{id}`](#putJobsId)
*   [`put /reviews/{id}`](#putReviewsId)

Default
=======


    delete /companies/{id}

Your DELETE endpoint (deleteCompaniesId)

Deleta a entrada do ID informado

### Path parameters

id (required)

Path Parameter —

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *


    delete /jobs/{id}

Your DELETE endpoint (deleteJobsId)

Deleta a entrada com o ID fornecido

### Path parameters

id (required)

Path Parameter —

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *


    delete /reviews/{id}

Your DELETE endpoint (deleteReviewsId)

Deleta a entrada do ID informado

### Path parameters

id (required)

Path Parameter —

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *


    get /companies

Your GET endpoint (getCompanies)

Retorna todas as entradas de empresas

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *


    get /companies/{id}

Your GET endpoint (getCompaniesId)

Altera a entrada do ID informado

### Path parameters

id (required)

Path Parameter —

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *


    get /jobs

Your GET endpoint (getJobs)

Retorna todos os jobs cadastrados

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *


    get /jobs/{id}

Your GET endpoint (getJobsId)

Retorna a entrada com o ID fornecido

### Path parameters

id (required)

Path Parameter —

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *


    get /reviews

Your GET endpoint (getReviews)

Retorna todas as entradas de comentários

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *


    get /reviews/{id}

Your GET endpoint (getReviewsId)

Retorna a entrada do ID informado

### Path parameters

id (required)

Path Parameter —

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *


    post /companies

Your POST endpoint (postCompanies)

Cria uma nova entrada de empresa

### Consumes

This API call consumes the following media types via the Content-Type request header:

*   `application/json`

### Request body

body [object](#object) (optional)

Body Parameter —

example: ```.json
    Body Parameter —
        example: {
          "value" : {
            "name" : "Company two",
            "description" : "Test description"
          }
        }
```

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *


    post /jobs

Your POST endpoint (postJobs)

Cria uma nova entrada de job

### Consumes

This API call consumes the following media types via the Content-Type request header:

*   `application/json`

### Request body

body [object](#object) (optional)

Body Parameter —

example: `
    Body Parameter —
        example: {
          "value" : {
            "title" : "Software Engineer 1",
            "description" : "Test description",
            "minSalary" : "30000",
            "maxSalary" : "40000",
            "location" : "São Paulo",
            "company" : {
              "id" : 2
            }
          }
        }
`

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *


    post /reviews

Your POST endpoint (postReviews)

Cria um novo comentário

### Consumes

This API call consumes the following media types via the Content-Type request header:

*   `application/json`

### Request body

body [object](#object) (optional)

Body Parameter —

example: `
    Body Parameter —
        example: {
          "value" : {
            "title" : "Review 1",
            "description" : "description 3",
            "rating" : 5
          }
        }
`

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *


    put /companies/{id}

Your PUT endpoint (putCompaniesId)

do

### Path parameters

id (required)

Path Parameter —

### Consumes

This API call consumes the following media types via the Content-Type request header:

*   `application/json`

### Request body

body [object](#object) (optional)

Body Parameter —

example: `
    Body Parameter —
        example: {
          "value" : {
            "name" : "Company ONE UPDATED",
            "description" : "Test description"
          }
        }
`

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *


    put /jobs/{id}

Your PUT endpoint (putJobsId)

Altera a entrada com o ID fornecido

### Path parameters

id (required)

Path Parameter —

### Consumes

This API call consumes the following media types via the Content-Type request header:

*   `application/json`

### Request body

body [object](#object) (optional)

Body Parameter —

example: `
    Body Parameter —
        example: {
          "value" : {
            "id" : 1,
            "title" : "Software Engineer Updated",
            "description" : "Test description",
            "minSalary" : "30000",
            "maxSalary" : "40000",
            "location" : "São Paulo"
          }
        }
`

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *


    put /reviews/{id}

Your PUT endpoint (putReviewsId)

Altera a entrada do ID informado

### Path parameters

id (required)

Path Parameter —

### Consumes

This API call consumes the following media types via the Content-Type request header:

*   `application/json`

### Request body

body [object](#object) (optional)

Body Parameter —

example: `
    Body Parameter —
        example: {
          "value" : {
            "title" : "Review 2 UPDATED",
            "description" : "description 2 UPDATED",
            "rating" : 7
          }
        }
`

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *

Models
------

\[ Jump to [Methods](#__Methods) \]

### Table of Contents
