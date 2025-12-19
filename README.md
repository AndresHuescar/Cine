GESTIÓN DE CINE
El programa debe gestionar una única sala de cine con 50 asientos. Las 
proyecciones se realizan los fines de semana en dos horarios: mañana y tarde. 
Existen dos tipos de proyección: Clásica y 3D, siendo esta última más cara por 
incluir un recargo sobre el precio base. El sistema debe permitir consultar 
disponibilidad de asientos, reservar un asiento indicando el horario y calcular el 
precio según el tipo de proyección.
La clase Proyeccion será la superclase con atributos como título y precio base, 
y dos subclases: ProyeccionClasica y Proyeccion3D, que sobrescriben el 
cálculo del precio (la segunda añade un recargo).
El flujo básico será:
 Inicializar la sala con sus 50 asientos libres.
 Registrar dos proyecciones (mañana y tarde), indicando título, precio 
base y tipo.
 Permitir al usuario elegir horario y asiento. Si el asiento está ocupado o 
el número es inválido, el sistema debe lanzar una excepción 
personalizada (por ejemplo, AsientoNoDisponibleException) y mostrar 
un mensaje claro
 Confirmar la reserva mostrando el precio.
