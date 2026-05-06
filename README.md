# Citas Médicas API

API REST para gestión de citas médicas desarrollada con Spring Boot.

## Tecnologías
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL

## Endpoints

### Usuarios
- POST /usuarios — crear usuario
- GET /usuarios — listar usuarios
- GET /usuarios/{id} — buscar usuario por id

### Citas
- POST /citas — crear cita
- GET /citas — listar citas
- GET /citas/{id} — buscar cita por id
- DELETE /citas/{id} — eliminar cita

## Cómo correr el proyecto
1. Crear base de datos en MySQL: `CREATE DATABASE citas_medicas;`
2. Configurar credenciales en `application.properties`
3. Correr desde IntelliJ
