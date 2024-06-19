# Jakarta JPA e Hibernate

En este proyecto se recopilan todos los ejemplos de uso de JPA e Hibernate en Jakarta en Java.

## Contenidos

Cada paquete representa una sección dentro del master:

- Jakarta JPA e Hibernate:
  - Introducción
  - Creando proyecto y configuraciones JPA persistence.xml
  - Creando la clase entity de persistencia
  - Sentencia HQL select y configurando el EntityManagerFactory
  - Clausula where HQL
  - Métodos SingleResult vs ResultList
  - Crear registros con el método persist del EntityManager
  - Actualizar registros con el método merge del EntityManager
  - Eliminar registros con el método remove
  - El componente crud repositorio
  - El componente service
  - Probando el service en una clase cliente con el método main

- Jakarta JPA e Hibernate consultas JPQL: 
  - JPQL campos personalizados
  - JPQL instanciación dinámica de clase personalizada
  - Usando DISTINCT palabra clave de JPQL / HQL
  - Funciones JPQL concat, upper, lower y operador like
  - Usando palabras claves between y order by de JPQL
  - Funciones JPQL de agregación count, sum, max, min, avg
  - Subquery o subconsulta en JPQL

- Jakarta JPA e Hibernate API Criteria: 
  - El API Criteria
  - Operadores in, gt (mayor que), ge (mayor que o igual), lt (menor que) y le
  - Predicados conjunción and y disyunción or
  - Clausula order by, ejemplo con single result por id, distinct nombre y upper
  - Funciones de expresión concat, upper y lower
  - Cláusula multiselect para campos personalizados
  - Funciones de agregación count, sum, max, min
  - Búsqueda dinámica con el API Criteria

- Jakarta JPA e Hibernate evento del ciclo de vida: 
  - Eventos del Ciclo de Vida @PrePersist y @PreUpdate
  - Anotaciones @Embeddable y @Embedded
  - Generación Automática de las tablas con schema generation drop-and-create