🎯 Reto Práctico Nº 1 - Ventana de Bienvenida en Swing
📝 Descripción

Este proyecto consiste en una pequeña aplicación en Java Swing que muestra una ventana de bienvenida con un botón.
Al presionarlo, se despliega un mensaje emergente de saludo.

El reto incluye tres niveles de dificultad:

✅ Básico: Ventana con botón que muestra saludo fijo.

🔹 Intermedio: Solicita el nombre del usuario, valida el ingreso y personaliza el saludo.

🔸 Avanzado: Personalización con íconos, colores, estilos (Look & Feel) e internacionalización.

⚙️ Requisitos

Java SE 8 o superior

Librería Swing (incluida en Java SE)

🚀 Ejecución

Compila y ejecuta desde terminal:

javac VentanaBasica.java
java VentanaBasica

javac VentanaIntermedia.java
java VentanaIntermedia

javac VentanaAvanzada.java
java VentanaAvanzada

📂 Estructura del proyecto
/src
   VentanaBasica.java
   VentanaIntermedia.java
   VentanaAvanzada.java
/resources
   mensajes.properties
   mensajes_en.properties
/screenshots
   ventana_inicial.png
   input_nombre.png
   saludo.png
README.md

✨ Funcionalidades
✅ Nivel Básico

Ventana con título "Bienvenid@"

Botón "Mostrar saludo"

Mensaje emergente: "¡Hola, buen trabajo Valery!"

🔹 Nivel Intermedio

Solicita nombre con JOptionPane.showInputDialog

Valida que no esté vacío o cancelado

Personaliza saludo con el nombre ingresado

Colores aplicados a ventana y botón

🔸 Nivel Avanzado

Ícono personalizado con setIconImage()

Separación de interfaz y lógica (principio de responsabilidad única)

Estilos gráficos con UIManager (Look & Feel)

Internacionalización con Locale (mensajes.properties en varios idiomas)

📷 Capturas (ejemplo de lo que debes adjuntar en /screenshots)

🖼️ Ventana inicial con título e ícono
<img width="283" height="190" alt="image" src="https://github.com/user-attachments/assets/ebc8434d-b805-45f9-9461-1ca854f2cce9" />

🖼️ Input dialog pidiendo nombre
<img width="297" height="195" alt="image" src="https://github.com/user-attachments/assets/d4bc1c00-e27e-499b-96f5-a14ebe7886e0" />

🖼️ Mensaje emergente con saludo personalizado
<img width="278" height="189" alt="image" src="https://github.com/user-attachments/assets/cfd81224-8262-48ea-83fa-5a027bf0f074" />

🛠️ Tecnologías usadas

Java SE

Swing (javax.swing)

Clases: JFrame, JButton, JOptionPane, JPanel, UIManager, Locale

👩‍💻 Autor

Gimena Ccoracc✍️
