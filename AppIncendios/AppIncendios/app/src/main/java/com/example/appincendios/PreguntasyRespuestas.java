package com.example.appincendios;

public class PreguntasyRespuestas {
    public static String[] Preguntas ={
            "Los incendios forestales por lo general:",
            "Los factores de “El triángulo del comportamiento del fuego” incluyen:",
            "Según la “regla de los 30”, existe peligros de incendio en condiciones de:",
            "Al estar en una zona amenazada por un incendio hay que:",
            "Ante un caso de quemaduras graves tenemos que:"
    };
    public static String[][] Respuestas ={
            {"Ocurren espontáneamente","Son causados intencionalmente","Son causados accidentalmente"},
            {"Condiciones meteorológicas, acciones antropomórficas y disponibilidad de combustible",
                    "Meteorología, disponibilidad de combustible y falta de agua en la zona","Combustible, meteorología y topografía"},
            {"Temperatura mayor a 30ºC, humedad menor al 30% y un AQI superior a 30",
                    "Temperatura mayor a 30ºC, humedad menor al 30% y velocidad del viento menor a 30 m/s",
                    "Temperatura mayor a 30ºC, humedad menor al 30% y velocidad del viento superior a 30 km/h"},
            {"Evacuar inmediatamente y llamar a las autoridades","Esperar al personal de rescate",
                    "Llamar a los bomberos y ayudar a combatir el incendio"},
            {"Correr agua tibia sobre la herida y aplicar pomada suavemente","Aplicar hielo durante 15/20 minutos para calmar el dolor",
                    "Usar agua fria y vendar holgadamente"}
    };
    public static String[] OpcionCorrecta ={
            "Son causados accidentalmente",
            "Combustible, meteorología y topografía",
            "Temperatura mayor a 30ºC, humedad menor al 30% y velocidad del viento superior a 30 km/h",
            "Evacuar inmediatamente y llamar a las autoridades",
            "Usar agua fria y vendar holgadamente"
    };
}
