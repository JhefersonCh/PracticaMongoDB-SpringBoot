# 🚀 API REST de CRUD de Tareas con Java Spring Boot y MongoDB

Este es mi primer proyecto de **API REST** creada con [Java Spring Boot](https://spring.io/projects/spring-boot) y [MongoDB](https://www.mongodb.com/), implementando un CRUD básico para gestionar tareas. La API permite crear, leer, actualizar y eliminar tareas.

## 🎯 Funcionalidades

- ✅ Crear tareas
- 🔄 Leer tareas (todas o por ID)
- ✏️ Actualizar tareas
- ❌ Eliminar tareas
- 🚀 Conexión a base de datos MongoDB

## 🛠️ Tecnologías

- **Java 17**
- **Spring Boot 2.x**
- **MongoDB** como base de datos
- **Spring Data MongoDB** para manejar la base de datos

## 🏗️ Instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/JhefersonCh/PracticaMongoDB-SpringBoot.git
   cd PracticaMongoDB-SpringBoot

2. Asegúrate de tener MongoDB corriendo en tu máquina o usa un servicio en la nube (como MongoDB Atlas).

3. Abre el proyecto en tu IDE favorito (como IntelliJ IDEA o Eclipse).

4. Configura el archivo application.properties con las credenciales de tu base de datos:
   ```bash
   spring.data.mongodb.uri=mongodb://localhost:27017/{nombre de tu db}

5. Ejecuta la aplicación:
   ```bash
   ./mvnw spring-boot:run

6. La API estará disponible en > http://localhost:8080.
