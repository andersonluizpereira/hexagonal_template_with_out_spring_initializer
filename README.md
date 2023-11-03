﻿# hexagonal_template_with_out_spring_initializer

A arquitetura hexagonal é um estilo de arquitetura de software que organiza o código de forma que isola as regras de negócio do sistema das camadas de interface com o usuário e de acesso a dados. Isso torna o código mais flexível, testável e independente de detalhes de implementação. É como organizar à casa com quartos separados para diferentes funções, mantendo a privacidade e a modularidade.

##Baixe as dependencias, rodando o comando abaixo
gradle build --refresh-dependencies

##Rode o docker-compose
docker-compose up

## **APPLICATION**

Core da aplicacao regra de negocio, todo o código que nao deve ter acesso ao mundo externo, livre frameworks ficando totalmente isolado

Dentro da APPLICATION, criamos a pasta core e outra chama ports

Na pasta
core
domain - classes de dominio
usecase - ficam os casos de uso

	ports - Nada mais é do que interface (contendo as entradas e as saidas)
		in - Ele vai ter todas as portas de entrada para acessar o core da aplicacao
		out -  Vai a porta de saida para saida de dados do core


## **ADAPTERS**

Nada mais é do que as implementacoes da portas de entreda e saida

Dentro da ADAPTERS, criamos a pasta core e outra chama ports

Na pasta

	ports - Nada mais é do que interface (contendo as entradas e as saidas com as implementacoes)	
			in - consumer - topico, fila, grpc,controller - api, grapql
			out - client - api, grpc, rpc, repository - base de dados	

CONFIG

Nada mais e do que todas as configuracoes do projeto

**Rodando o projeto**
gradle bootRun

````
curl --request GET \
  --url http://localhost:8080/api/v1/peoples/2 \
  --header 'User-Agent: insomnia/8.3.0'
````
