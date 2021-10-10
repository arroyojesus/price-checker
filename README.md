# price-checker 
El apllicacion esta desarrollada para consultar precios segun el productId, brandId y fecha de aplicacion.

# Package Core
Applicativo SpringBoot 

 *Controllers
 *Exception
 *Componenet
 *Service
 *Repositoty
 *Model
 *Entity
 
# Endpoint
## GET consult/price (por JSON)

####Request:
 {
    "productId": "35455",
    "brandId": 1,
    "applicationDate": "2020-06-16 21:00:00"
}

####Response:
{
    "status": "OK",
    "code": "200",
    "message": "Data obtained",
    "data": {
        "productId": "35455",
        "brandId": 1,
        "priceId": 4,
        "applicationDate": "2020-06-16T21:00:00",
        "price": 38.95,
        "curr": "EUR"
    }
}

## GET consult/prices/{productId}/{brandId}/{appplicactionDate} (por URL)

#Instrucciones para desplegar y probar
Desplegar sobre un servidor tomcat 9x, con version jdk 1.8.


