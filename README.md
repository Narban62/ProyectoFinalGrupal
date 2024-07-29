# ProyectoFinalGrupal
Autores: Paul Cueva, Belén Paca, Luis Perenguez

# PAULIBEL - Sistema de Gestión de Tienda de Ropa, el nombre del sistema salió de la combinación de los nombres de los Autores del código.

PAULIBEL es una aplicación de gestión para una tienda de ropa de telas, diseñada para ofrecer una experiencia fluida tanto para clientes como para administradores. El sistema está estructurado en paquetes separados: `Model`, `Controller`, `Service`, `View`, y `Repository`, para asegurar una arquitectura limpia y organizada.

## Funcionalidades

### Para Clientes
- **Inicio de Sesión y Registro:**
  - Los clientes pueden iniciar sesión si ya están registrados en la base de datos.
  - Si no están registrados, deberán registrarse proporcionando su nombre, apellido, correo electrónico y contraseña.
- **Selección de Productos:**
  - Los clientes pueden elegir entre diversas prendas de vestir y productos.
  - Deben seleccionar la prenda y la cantidad deseada.
- **Autorización del Administrador:**
  - Antes de que se inicie la fabricación de los productos, los clientes recibirán un mensaje indicando que necesitan la autorización del administrador.
- **Proceso de Compra:**
  - Una vez que el administrador apruebe la fabricación, el cliente puede añadir los productos al carrito.
  - El cliente tiene la opción de repetir el proceso para añadir más productos o proceder al pago.
- **Métodos de Pago:**
  - El cliente puede pagar en efectivo o con tarjeta.
  - Al finalizar, se mostrará una descripción de los productos adquiridos y una factura final.

### Para Administradores
- **Inicio de Sesión y Registro:**
  - Los administradores pueden acceder al sistema si están registrados en la base de datos.
  - También tienen la opción de crear nuevas cuentas de administrador a partir de la cuenta de otro administrador.
- **Gestión de Pedidos:**
  - Los administradores pueden ver la fila de clientes, aprobar o rechazar productos, y gestionar el estado de las órdenes.
- **Creación de Productos:**
  - Los administradores pueden agregar nuevos productos al sistema con sus precios.
- **Revisión de Productos:**
  - La ventana del administrador muestra los productos aprobados y rechazados para su fácil seguimiento.

## Estructura del Proyecto

- **Model:** Define las clases y estructuras de datos utilizadas en el sistema.
- **Controller:** Maneja la lógica de negocio y las interacciones entre el modelo y la vista.
- **Service:** Contiene la lógica del negocio y los servicios utilizados por los controladores.
- **View:** Define la interfaz gráfica del usuario.
- **Repository:** Gestiona la persistencia de datos en la base de datos.

## Requisitos

- Java 21
- Bases de Datos MySQL 
- 

