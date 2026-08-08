# Parte 4. Cuestionario Teórico

## 01. ¿Cuál es la diferencia entre git merge y git rebase?

**Git merge** combina dos ramas creando un nuevo commit de fusión (*merge commit*), conservando el historial completo de ambas ramas.

**Git rebase** toma los commits de una rama y los reaplica sobre otra, generando un historial más limpio y lineal.

**Diferencia principal:** `merge` conserva la historia original del proyecto, mientras que `rebase` reorganiza los commits para simplificar el historial.


## 02. Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?

Se produce un **conflicto de merge**. Git no puede determinar automáticamente qué cambio debe conservar, por lo que marca el archivo afectado y solicita la intervención del desarrollador para resolver el conflicto. Después de solucionarlo, se realiza un commit para completar la fusión.


## 03. ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?

Se puede utilizar el siguiente comando:

```bash
git log --oneline --graph --all
```

Este comando muestra los commits, ramas y merges mediante un gráfico en texto, permitiendo visualizar claramente la estructura del repositorio y las fusiones realizadas.


## 04. Explica la diferencia entre un commit y un push.

Un **commit** guarda los cambios realizados en el repositorio local junto con un mensaje descriptivo.

```bash
git commit -m "Reto1 culminado"
```

Un **push** envía esos commits locales al repositorio remoto, por ejemplo GitHub.

```bash
git push
```

## 05. ¿Para qué sirven git stash y git stash pop?

**git stash** permite guardar temporalmente cambios que aún no han sido confirmados mediante un commit.

```bash
git stash
```

**git stash pop** recupera los cambios almacenados previamente y elimina ese respaldo temporal.

```bash
git stash pop
```

Estos comandos son útiles cuando se necesita cambiar de rama o actualizar el repositorio sin perder el trabajo que se está realizando.


## 06. ¿Qué diferencia hay entre HashMap y HashTable?

**HashMap** y **Hashtable** son estructuras de datos que almacenan pares clave-valor, pero presentan diferencias importantes:

- **HashMap** no es sincronizado, tiene mejor rendimiento y permite claves y valores `null`.
- **Hashtable** es sincronizado, tiene un rendimiento ligeramente menor y no permite claves ni valores `null`.