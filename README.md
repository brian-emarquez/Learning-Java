<h2 align="center">  Java ☕ | POO, JDBC, Servlets, JavaEE, Web Services, JSF, EJB, JPA, PrimeFaces, Hibernate, Spring, Struts </h2>


<p align="center">
  
  <a href="https://github.com/BrianMarquez3/Learnig-Java/tags">
    <img src="https://img.shields.io/github/tag/BrianMarquez3/Learnig-Java.svg?label=version&style=flat" alt="Version">
  </a>
  <a href="https://github.com/BrianMarquez3/Learnig-Java/stargazers">
    <img src="https://img.shields.io/github/stars/BrianMarquez3/Learnig-Java.svg?style=flat" alt="Stars">
  </a>
  <a href="https://github.com/BrianMarquez3/Learnig-Java/network">
    <img src="https://img.shields.io/github/forks/BrianMarquez3/Learnig-Java.svg?style=flat" alt="Forks">
  </a>
  <a href="https://github.com/BrianMarquez3/Learnig-Java/network">
    <img src="https://img.shields.io/badge/coverage-80%25-yellowgreen">
  </a>
   </a>
   <a href="https://github.com/BrianMarquez3/Learnig-Java/network">
    <img src="https://img.shields.io/badge/Plataform-Windows-blue">
  </a>
  
  ![java](./images/mega.jpg)


## Tabla de contenidos

| Numeration   | Check  |Topic          |
| ------------ |--------|-------------- |
|  001   |✔️ | [Que es java](#Que-es-java)   |  
|  002   |✔️ | [Instalacion](#instalacion)  |
|  003   |✔️ | [Hola Java](#Hola-Java)  |  
|  004   |✔️ | [Variables](#variables)  |  
|  005   |✔️ | [Variables-II](#Variables-II)  |  
|  006   |✔️ | [Constantes](#Constantes)  |  
|  007   |✔️ | [Ingresar Datos Consola](#Ingresar-Datos-Consola)  |  
|  008   |✔️ | [Ingresar Dato ViaShow InputDialog](#Ingresa-Dato-ViaShow-InputDialog)  |  
|  009   |✔️ | [Operadores Matematicos](#Operadores-Matematicos)  |  
|  010   |✔️ | [Operadores Matematicos Cortos](#operadores-Matematicos-Cortos)  |  
|  011  |✔️ | [Operador Incremental Decremental](#Operador-Incremental-Decremental)  |    
|  012   |✔️ | [Operaciones Matematicas Math](#Operaciones-Matematicas-Math)  | 
|  013   |✔️ | [Calcular volumen de un cilindro](#Calcular-volumen-de-un-cilindro)  
|  014   |✔️ | [Manejo de Fechas](#Manejo-de-Fechas)  
|  015   |✔️ | [Condicionales](#Condicionales)  



## Ques es Java 

La plataforma Java es el nombre de un entorno o plataforma de computación originaria de Sun Microsystems, capaz de ejecutar aplicaciones desarrolladas usando el lenguaje de programación Java u otros lenguajes que compilen a bytecode y un conjunto de herramientas de desarrollo. En este caso, la plataforma no es un hardware específico o un sistema operativo, sino más bien una máquina virtual encargada de la ejecución de las aplicaciones, y un conjunto de bibliotecas estándar que ofrecen una funcionalidad común. [Wikipedia](https://es.wikipedia.org/wiki/Plataforma_Java)<br>

### Incluye

- Plataforma Java, Edición Estándar (Java Platform, Standard Edition), o Java SE (antes J2SE).
- Plataforma Java, Edición Empresa (Java Platform, Enterprise Edition), o Java EE (antes J2EE).
- Plataforma Java, Edición Micro (Java Platform, Micro Edition), o Java ME (antes J2ME).

### Caracteristicas

- Lenguaje java fuertemente tipado
- Lenguaje Orientao a Objeto (POO)
- Esta en todas partes
- Poupular

### Popularidad a Nivel Nacional 2021

  ![java](./images/popularidad.png)

### Ejemplo

  ![java](./images/ejemplo.png)

---
## Instalacion

📦 [Instalar JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) Intalador Oracle JDK Java SE Development ☕
📦 [Instalar Netbeans 12](https://netbeans.org/) Intalador Apache NetBeans


 ![java](./images/Install.png)

---


## Hola Java 

  | Carpeta                    | Link |     
|----------------------------|:-----------:|
| [Hola Java](https://github.com/BrianMarquez3/Learning-Java/tree/main/holaMundo)          |      ✔️     | 

---

## Variables

### Variables
   
```java
    byte - 8 bits
    short - 16 bit
    int - 32 bits
    long - 64 bits
    float  -32 bits
    double  -64 bits
    char - 16 bits
    boolean - 1 bits
```

###  Tipos de Datos Primitivos en Java   

<strong>1. byte</strong>

  Representa un tipo de dato de 8 bits con signo. De tal manera que puede almacenar los valores numéricos de -128 a 127 (ambos inclusive).

<strong2. >short</strong>

  Representa un tipo de dato de 16 bits con signo. De esta manera almacena valores numéricos de -32.768 a 32.767.

<strong>3. int </strong>

  Es un tipo de dato de 32 bits con signo para almacenar valores numéricos. Cuyo valor mínimo es -2^31 y el valor máximo 2^31-1.

<strong>4. float </strong>

  Es un tipo dato para almacenar números en coma flotante con precisión simple de 32 bits.

<strong>5. double </strong>

  Es un tipo de dato para almacenar números en coma flotante con doble precisión de 64 bits.

<strong>6. boolean </strong>

  Sirve para definir tipos de datos booleanos. Es decir, aquellos que tienen un valor de true o false. Ocupa 1 bit de información.

<strong>7. char </strong>
  Es un tipo de datos que representa a un carácter Unicode sencillo de 16 bits.

### Valores por defecto de los tipos de datos primitivos

<table>

  <tr>
    <td>Dato Primitivo</td>
    <td>Valor por Defecto</td>
  </tr>

  <tr>
    <td>byte</td>
    <td>0</td>
  </tr>

   <tr>
    <td>short</td>
    <td>0</td>
  </tr>

  <tr>
    <td>int</td>
    <td>0</td>
  </tr>

   <tr>
    <td>long</td>
    <td>0L</td>
  </tr>

   <tr>
    <td>float</td>
    <td>0.0f</td>
  </tr>

  <tr>
    <td>double</td>
    <td>0.0d</td>
  </tr>

  <tr>
    <td>char</td>
    <td>‘u0000’</td>
  </tr>

  <tr>
    <td>String</td>
    <td>null</td>
  </tr>

   <tr>
    <td>boolean</td>
    <td>false</td>
  </tr>
  

  | Carpeta                    | Link |     
|----------------------------|:-----------:|
| [Variables I Datos Primitivos](https://github.com/BrianMarquez3/Learnig-Java/tree/main/variables)          |      ✔️     | 

---

## Variables-II

  | Carpeta                    | Link |     
|----------------------------|:-----------:|
| [Variables II Datos Envoltorio](https://github.com/BrianMarquez3/Learnig-Java/tree/main/variables_II_Datos_Envoltorio)          |      ✔️     | 

---

## Constantes

  | Carpeta                    | Link |     
|----------------------------|:-----------:|
| [Constantes](https://github.com/BrianMarquez3/Learnig-Java/tree/main/contantes)          |      ✔️     | 

---

## Ingresar Datos Consola

  | Carpeta                    | Link |     
|----------------------------|:-----------:|
| [Ingresar Datos Consola ](https://github.com/BrianMarquez3/Learning-Java/tree/main/IngresarDatosConsola)          |      ✔️     | 

---

## Ingresar Dato ViaShow InputDialog

  | Carpeta                    | Link |     
|----------------------------|:-----------:|
| [Ingresar Dato ViaShow InputDialog ](https://github.com/BrianMarquez3/Learning-Java/tree/main/IngresarDatosViaShowInputDialog)          |      ✔️     | 

---

## Operadores Matematicos

  | Carpeta                    | Link |     
|----------------------------|:-----------:|
| [Operadores Matematicos ](https://github.com/BrianMarquez3/Learning-Java/tree/main/operadoresMatematicos)          |      ✔️     |

---

## Operadores Matematicos Cortos

  | Carpeta                    | Link |     
|----------------------------|:-----------:|
| [Operadores Matematicos Cortos ](https://github.com/BrianMarquez3/Learning-Java/tree/main/operadoresMatematicosCortos)          |      ✔️     |

---

## Operador Incremental Decremental

  | Carpeta                    | Link |     
|----------------------------|:-----------:|
| [Operador Incremental Decremental ](https://github.com/BrianMarquez3/Learning-Java/tree/main/operadorIncrementalDecremental)          |      ✔️     |

---

## Operaciones Matematicas Math

  | Carpeta                    | Link |     
|----------------------------|:-----------:|
| [Operaciones Matematicas Math ](https://github.com/BrianMarquez3/Learning-Java/tree/main/operacionesMatematicasMath)          |      ✔️     |

---

## Calcular volumen de un cilindro

  | Carpeta                    | Link |     
|----------------------------|:-----------:|
| [Calcular volumen de un cilindro ](https://github.com/BrianMarquez3/Learning-Java/tree/main/calcularvolumendeuncilindro)          |      ✔️     |

---

## Manejo de Fechas

  | Carpeta                    | Link |     
|----------------------------|:-----------:|
| [Manejo de fechas ](https://github.com/BrianMarquez3/Learning-Java/tree/main/fechas)          |      ✔️     |

---

## Condicionales

_Ejemplo de Condiciones_

```java
public static void main(String[] args) {
        // condicionales (Sentencia IF, Else)
        Scanner entra= new Scanner(System.in);
        int numUser, numSis;
        numSis = (int) (Math.random()*10);
        System.out.println("Ingresa este numero "+numSis+": ");
        numUser = entra.nextInt();
        
        if(numUser == numSis){
            System.out.println("Coinciden ");
        }else{
            System.out.println("no coinciden ");
        }
    }
```

  | Carpeta                    | Link |     
|----------------------------|:-----------:|
| [Condicionales](https://github.com/BrianMarquez3/Learning-Java/tree/main/condicionales)          |      ✔️     |

---

## Paypal
🩸 Hacer una donación [PAYPAL](https://www.paypal.com/donate?hosted_button_id=98U3T62494H9Y) 🍵
