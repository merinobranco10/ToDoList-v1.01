# 📝 To-Do List

Aplicación de escritorio desarrollada en **Java** para la gestión y organización de tareas mediante una interfaz gráfica.

## 📌 Descripción

Este proyecto corresponde a una aplicación **To-Do List** que permite administrar tareas de forma sencilla desde una interfaz gráfica desarrollada en Java.

El proyecto está organizado mediante una clase principal y clases independientes para la configuración de distintos componentes de la interfaz.

## 🛠️ Tecnologías utilizadas

- **Java**
- **Java Swing** para la interfaz gráfica
- **Git** para el control de versiones
- **GitHub** para alojar el repositorio

## 📂 Estructura del proyecto

```text
To-Do-List/
│
├── src/
│   ├── App.java
│   ├── confBoton.java
│   ├── confCombo.java
│   ├── confLabel.java
│   └── confVentana.java
│
└── README.md
```

### Archivos principales

- **`App.java`**: contiene la clase principal y el punto de inicio de la aplicación.
- **`confBoton.java`**: contiene la configuración de los botones utilizados en la interfaz.
- **`confCombo.java`**: contiene la configuración de los componentes `JComboBox`.
- **`confLabel.java`**: contiene la configuración de las etiquetas (`JLabel`).
- **`confVentana.java`**: contiene la configuración de la ventana principal.

---

# 🚀 Instalación y ejecución

## 1. Requisitos previos

Antes de ejecutar el proyecto debes tener instalado:

- **Java JDK 8 o superior**
- **Git**
- Un IDE compatible con Java, como:
  - IntelliJ IDEA
  - Apache NetBeans
  - Eclipse
  - Visual Studio Code con soporte para Java

Puedes comprobar que Java está instalado ejecutando:

```bash
java -version
```

También puedes comprobar el compilador:

```bash
javac -version
```

Para comprobar Git:

```bash
git --version
```

---

## 2. Clonar el repositorio

Para obtener el proyecto desde GitHub, abre una terminal y ejecuta:

```bash
git clone https://github.com/USUARIO/NOMBRE-REPOSITORIO.git
```

Luego entra en la carpeta del proyecto:

```bash
cd NOMBRE-REPOSITORIO
```

> **Importante:** reemplaza `USUARIO/NOMBRE-REPOSITORIO` por la dirección real de tu repositorio.

---

## 3. Abrir el proyecto

Una vez clonado el repositorio, puedes abrir la carpeta del proyecto utilizando el IDE de tu preferencia.

### En NetBeans

1. Abrir **Apache NetBeans**.
2. Seleccionar **File → Open Project**.
3. Seleccionar la carpeta del proyecto.
4. Abrir el proyecto.
5. Buscar `App.java` dentro de `src`.
6. Ejecutar el archivo o el proyecto.

### En IntelliJ IDEA

1. Abrir **IntelliJ IDEA**.
2. Seleccionar **Open**.
3. Seleccionar la carpeta del proyecto.
4. Abrir `App.java`.
5. Ejecutar el método `main()`.

---

## 4. Ejecutar desde la terminal

Si el proyecto no utiliza paquetes ni dependencias externas, puede compilarse directamente desde la terminal.

Desde la carpeta raíz del proyecto:

```bash
javac -d out src/*.java
```

Esto generará los archivos compilados dentro de la carpeta `out`.

Después, ejecuta la aplicación con:

```bash
java -cp out App
```

Si `App.java` utiliza un paquete (`package`), el comando deberá adaptarse al nombre del paquete.

---

# 🔄 Uso del proyecto

Una vez ejecutada la aplicación:

1. Se inicia la ventana principal.
2. Se utiliza la interfaz gráfica para gestionar las tareas.
3. Los componentes disponibles permiten interactuar con la lista de tareas.

---

# 🌿 Contribución

Las contribuciones al proyecto pueden realizarse mediante Git y GitHub.

## 1. Crear un Fork

Desde GitHub, selecciona **Fork** para crear una copia del repositorio en tu propia cuenta.

## 2. Clonar el Fork

```bash
git clone https://github.com/TU-USUARIO/NOMBRE-REPOSITORIO.git
```

Después:

```bash
cd NOMBRE-REPOSITORIO
```

## 3. Crear una rama

Antes de realizar cambios, crea una rama nueva:

```bash
git checkout -b feature/nueva-funcionalidad
```

Ejemplo:

```bash
git checkout -b feature/mejorar-interfaz
```

## 4. Realizar los cambios

Realiza las modificaciones necesarias en el código.

Se recomienda mantener:

- Código ordenado.
- Nombres descriptivos.
- Estructura clara.
- Funcionalidades separadas correctamente.
- Cambios relacionados con el objetivo de la rama.

## 5. Comprobar los cambios

Puedes revisar el estado del repositorio con:

```bash
git status
```

Y revisar las diferencias mediante:

```bash
git diff
```

## 6. Guardar los cambios

Agrega los archivos modificados:

```bash
git add .
```

Luego crea un commit:

```bash
git commit -m "Agrega nueva funcionalidad"
```

## 7. Subir los cambios

```bash
git push origin feature/nueva-funcionalidad
```

## 8. Crear un Pull Request

Finalmente, desde GitHub:

1. Ingresa al repositorio.
2. Selecciona la opción para crear un **Pull Request**.
3. Selecciona la rama con tus cambios.
4. Describe brevemente las modificaciones realizadas.
5. Envía el Pull Request para revisión.

---

# 🐛 Reportar errores

Si encuentras un problema, puedes crear un **Issue** en GitHub.

Se recomienda incluir:

- Descripción del problema.
- Pasos para reproducirlo.
- Resultado esperado.
- Resultado obtenido.
- Versión de Java.
- Sistema operativo utilizado.

Ejemplo:

```text
### Descripción
La aplicación no inicia correctamente.

### Pasos para reproducir
1. Ejecutar App.java.
2. Esperar el inicio de la aplicación.
3. Se presenta el error.

### Resultado esperado
La ventana principal debería abrirse correctamente.

### Entorno
Java: JDK 17
Sistema operativo: Windows 11
```

---

# 📝 Convención de commits

Para mantener un historial organizado, se recomienda utilizar mensajes descriptivos.

Ejemplos:

```text
feat: agrega creación de tareas
fix: corrige error en la lista de tareas
style: mejora interfaz gráfica
refactor: reorganiza configuración de botones
docs: actualiza README
```

---

# 🔐 Buenas prácticas

- No subir contraseñas, claves ni información sensible.
- No subir archivos innecesarios generados por el IDE.
- Probar los cambios antes de realizar un `push`.
- Utilizar commits descriptivos.
- Crear ramas independientes para nuevas funcionalidades.
- Revisar los cambios antes de crear un Pull Request.
- Mantener actualizado el README cuando cambie la forma de instalar o ejecutar el proyecto.

---

# 📌 Estado del proyecto

**Estado:** En desarrollo 🚧

El proyecto puede recibir nuevas funcionalidades y mejoras relacionadas con la administración de tareas.

---

# 👨‍💻 Autor

Branco Merino

---

# 📄 Licencia

Este proyecto fue desarrollado con fines académicos y educativos.
