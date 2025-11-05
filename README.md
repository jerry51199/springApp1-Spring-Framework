# springApp1-Spring-Framework


## 📋 Descripción

Este proyecto tiene como objetivo demostrar la configuración inicial de una aplicación web con Spring MVC. Al acceder a la raíz del sitio, se muestra una página `index.jsp` con los siguientes datos:

- Nombre del estudiante
- Matrícula
- Escuela
- Materia
- Profesor

---

## 🧰 Tecnologías utilizadas

- Java 8+
- Spring Framework 4.3.30
- Maven
- GlassFish Server
- NetBeans IDE
- JSP

---

## 📁 Estructura del proyecto

springApp1/ 
├── src/ │ 
  └── main/ 
  │ ├── java/com/springapp1/controller/HomeController.java 
  │ ├── resources/applicationContext.xml 
  │ └── webapp/ 
  │ ├── index.jsp 
  │ └── WEB-INF/web.xml 
  ├── pom.xml └── README.md


---

## 🚀 Cómo ejecutar

1. Abre NetBeans
2. Ve a **Archivo > Abrir Proyecto** y selecciona `springApp1`
3. Asegúrate de tener **GlassFish Server** configurado
4. Haz clic derecho en el proyecto > **Ejecutar**
5. Accede en tu navegador a:  
   `http://localhost:8080/springApp1/`

---

## 👤 Información del estudiante

```text
Nombre: Gerardo Martínez
Matrícula: A01234567
Escuela: Universidad Tecmilenio
Materia: Computacion Avanzada en java
Profesor: Ing. Jose Alfredo Jimenez
