Job Aplication API body { font-family: Trebuchet MS, sans-serif; font-size: 15px; color: #444; margin-right: 24px; } h1 { font-size: 25px; } h2 { font-size: 20px; } h3 { font-size: 16px; font-weight: bold; } hr { height: 1px; border: 0; color: #ddd; background-color: #ddd; } .app-desc { clear: both; margin-left: 20px; } .param-name { width: 100%; } .license-info { margin-left: 20px; } .license-url { margin-left: 20px; } .model { margin: 0 0 0px 20px; } .method { margin-left: 20px; } .method-notes { margin: 10px 0 20px 0; font-size: 90%; color: #555; } pre { padding: 10px; margin-bottom: 2px; } .http-method { text-transform: uppercase; } pre.get { background-color: #0f6ab4; } pre.post { background-color: #10a54a; } pre.put { background-color: #c5862b; } pre.delete { background-color: #a41e22; } .huge { color: #fff; } pre.example { background-color: #f3f3f3; padding: 10px; border: 1px solid #ddd; } code { white-space: pre; } .nickname { font-weight: bold; } .method-path { font-size: 1.5em; background-color: #0f6ab4; } .up { float:right; } .parameter { width: 500px; } .param { width: 500px; padding: 10px 0 0 20px; font-weight: bold; } .param-desc { width: 700px; padding: 0 0 0 20px; color: #777; } .param-type { font-style: italic; } .param-enum-header { width: 700px; padding: 0 0 0 60px; color: #777; font-weight: bold; } .param-enum { width: 700px; padding: 0 0 0 80px; color: #777; font-style: italic; } .field-label { padding: 0; margin: 0; clear: both; } .field-items { padding: 0 0 15px 0; margin-bottom: 15px; } .return-type { clear: both; padding-bottom: 10px; } .param-header { font-weight: bold; } .method-tags { text-align: right; } .method-tag { background: none repeat scroll 0% 0% #24A600; border-radius: 3px; padding: 2px 10px; margin: 2px; color: #FFF; display: inline-block; text-decoration: none; }

Job Aplication API
==================

API para cadastro de empresas e oportunidades de empregos abertas nelas, além da possibilidade de adicionar reviews das empresas

Contact Info: [evyllamaria@gmail.com](evyllamaria@gmail.com)

Version: 1.0

BasePath:/EVYLLAMARIA/jobapp/1.0

All rights reserved

http://apache.org/licenses/LICENSE-2.0.html

Access
------

Methods
-------

\[ Jump to [Models](#__Models) \]

### Table of Contents

#### [Default](#Default)

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

[Up](#__Methods)

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

[Up](#__Methods)

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

[Up](#__Methods)

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

[Up](#__Methods)

    get /companies

Your GET endpoint (getCompanies)

Retorna todas as entradas de empresas

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *

[Up](#__Methods)

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

[Up](#__Methods)

    get /jobs

Your GET endpoint (getJobs)

Retorna todos os jobs cadastrados

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *

[Up](#__Methods)

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

[Up](#__Methods)

    get /reviews

Your GET endpoint (getReviews)

Retorna todas as entradas de comentários

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *

[Up](#__Methods)

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

[Up](#__Methods)

    post /companies

Your POST endpoint (postCompanies)

Cria uma nova entrada de empresa

### Consumes

This API call consumes the following media types via the Content-Type request header:

*   `application/json`

### Request body

body [object](#object) (optional)

Body Parameter —

example: `{ "value" : { "name" : "Company two", "description" : "Test description" } }`

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *

[Up](#__Methods)

    post /jobs

Your POST endpoint (postJobs)

Cria uma nova entrada de job

### Consumes

This API call consumes the following media types via the Content-Type request header:

*   `application/json`

### Request body

body [object](#object) (optional)

Body Parameter —

example: `{ "value" : { "title" : "Software Engineer 1", "description" : "Test description", "minSalary" : "30000", "maxSalary" : "40000", "location" : "São Paulo", "company" : { "id" : 2 } } }`

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *

[Up](#__Methods)

    post /reviews

Your POST endpoint (postReviews)

Cria um novo comentário

### Consumes

This API call consumes the following media types via the Content-Type request header:

*   `application/json`

### Request body

body [object](#object) (optional)

Body Parameter —

example: `{ "value" : { "title" : "Review 1", "description" : "description 3", "rating" : 5 } }`

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *

[Up](#__Methods)

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

example: `{ "value" : { "name" : "Company ONE UPDATED", "description" : "Test description" } }`

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *

[Up](#__Methods)

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

example: `{ "value" : { "id" : 1, "title" : "Software Engineer Updated", "description" : "Test description", "minSalary" : "30000", "maxSalary" : "40000", "location" : "São Paulo" } }`

### Responses

#### 200

OK[](#)

#### 404

Not Found[](#)

* * *

[Up](#__Methods)

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

example: `{ "value" : { "title" : "Review 2 UPDATED", "description" : "description 2 UPDATED", "rating" : 7 } }`

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
