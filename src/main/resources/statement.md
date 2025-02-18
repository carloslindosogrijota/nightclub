**Proyecto: Gestión de una Discoteca**

**Descripción**:
Un sistema que simula la gestión de una discoteca, permitiendo administrar invitados, mesas VIP, reservas y consumo.

**Múltiples Modelos**:

1. **Guest (Invitado)**:
   - **Atributos**:
     - `guestId`
     - `name`
     - `age`
     - `hasReservation`
     - `reservedTables`

2. **Table (Mesa)**:
   - **Atributos**:
     - `tableId`
     - `capacity`
     - `isVIP`
     - `isAvailable`
     - `guestTablesReserved`
     - `ordersOfTable`

3. **Order (Pedido)**:
   - **Atributos**:
     - `orderId`
     - `items`
     - `totalPrice`

4. **NightClub (Discoteca)**:
   - **Atributos**:
     - `guests` (lista de invitados registrados)
     - `tables` (lista de mesas disponibles)
     - `orders` (lista de pedidos realizados)


**Funcionalidades**:
- Registrar nuevos invitados en la discoteca, verificando su edad.
- Mostrar mesas disponibles, clasificándolas como VIP o normales.
- Permitir reservas de mesas y liberar mesas cuando los invitados se van.
- Realizar pedidos asociados a mesas y calcular el costo total.
- Mostrar un resumen de las actividades de la noche, incluyendo invitados, pedidos y mesas ocupadas.

**Ejemplo de Ejecución**:
1. **Registrar Invitados**:Añadir a María (27 años) y a Juan (22 años). Verificar que ambos cumplen con la edad mínima.
2. **Gestionar Mesas**:Añadir mesas VIP para 4 personas y mesas normales para 6 personas. Mostrar mesas disponibles.
3. **Reservar Mesas**:María reserva una mesa VIP; Juan una mesa normal.
4. **Pedidos**:La mesa 2 pide "Botella de Champagne" (50€) y "Coctel" (10€).
5. **Finalizar**: Mostrar el total de ingresos de la noche, liberar mesas y listar los invitados que asistieron.