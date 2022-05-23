# pub-database
database for a fictional pub

postman archive parancsok a fájlok között





Postman commands:

-POST
localhost:8080/saveBeer

{
    "name": "Borsodi",
    "alcPercent": 4.5,
    "atStock": 3
}

localhost:8080/saveSpirit

{
    "name": "Jaeger",
    "alcPercent": 39,
    "atStock": 2
}

localhost:8080/saveWineOrigin

{
    "id": 1,
    "name": "Tokaj"
}

localhost:8080/saveWine

{
    "name": "Aszú",
    "alcPercent": 12.5,
    "atStock": 4,
    "originId": 1
}

-GET
localhost:8080/getAllBeer

localhost:8080/getAllWine

localhost:8080/getAllSpirit

localhost:8080/getAllWineOrigin


-PUT
localhost:8080/getWineById

KEY id VALUE 3

localhost:8080/getSpiritById

id 2

localhost:8080/updateBeer

{
    "id": 1,
    "name": "Soproni",
    "alcPercent": 4.2,
    "atStock":7
}

localhost:8080/updateWine

{
    "id": 3,
    "name": "Hétputtonyos",
    "alcPercent": 12.5,
    "atStock": 4,
    "originId": 1
}

localhost:8080/updateSpirit

{
        "id": 2,
        "name": "Unicum",
        "alcPercent": 39.0,
        "atStock": 4
    }

localhost:8080/updateWineOrigin

{
    "id": 1,
    "name": "Eger"
}

-DELETE
localhost:8080/deleteBeer

id 1

localhost:8080/deleteWine

id 3

localhost:8080/deleteSpirit

id 2

localhost:8080/deleteWineOrigin

id 1
