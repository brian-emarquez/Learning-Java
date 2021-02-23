### Condiciones

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