# routemaps ( Java, Spring Boot, PostgreSQL )
## api de rotas para empresa de logística
### Esta api permite o amarzenamento de informações de uma rota com n pontos de entregas utilizando Java com spring boot e Banco de dados relacional PostgreSQL, e um endpoint coonectado a um web wesocket para acompanhamento da rota em tempo real utilizando a localização do entregador.

## POST 
### Exemplo de persistencia de uma rota:

###{
    "userName": "Jhon",
    "userCurrier": "pocurando...",
    "price": 20.00,
    "distance": 16.3255,
    "deliveries":[
        {
            "andress": "Rua 02",
            "complement": "lote 02",
            "instruction": "Buscar um envelope",
            "latitude": 21.343434,
            "longitude": 32.000565
        },
        {
            "andress": "Rua 03",
            "complement": "lote 03",
            "instruction": "Entregar um envelope",
            "latitude": 21.343434,
            "longitude": 32.000565
        },
         {
            "andress": "Rua 04",
            "complement": "lote 04",
            "instruction": "Entregar um envelope",
            "latitude": 21.343434,
            "longitude": 32.000565
        }
    ]
}

