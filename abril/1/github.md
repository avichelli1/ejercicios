* Deberán [crearse una cuenta](https://help.github.com/es/github/getting-started-with-github/signing-up-for-a-new-github-account).

* Cuando la tengan creada, deben [crear un repositorio privado](https://help.github.com/es/github/getting-started-with-github/create-a-repo) donde subirán todos sus proyectos y tareas resueltas.

* Para que yo pueda ver, corregir o hacer comentarios, deberán [agregarme como colaborador](https://help.github.com/es/github/setting-up-and-managing-your-github-user-account/inviting-collaborators-to-a-personal-repository). Mi nombre de usuario 
de github es "labopoo".

* Deberán instalar [git](https://git-scm.com/book/es/v2/Inicio---Sobre-el-Control-de-Versiones-Instalaci%C3%B3n-de-Git) en sus computadoras.

* Cuando me agreguen como colaborador, me llegará una notificación con su nombre de usuario. Si su nombre de usuario no contiene su nombre y apellido, les pido por favor que me avisen para saber quién es el autor de los trabajos que se subirán.


#### Comandos  frecuentes:

* ``` git clone urlAPaginaPrincipalDeRepositorio ```
Este comando nos permite crear una copia/clon del repositorio que tenemos creado en la página de github. Dicha copia 
o clon será creada en la carpeta donde se encuentra ubicada la consola.

##### Etapa 1: registro de cambios
* ``` git add nombreArchivo.extensión ```
Este comando nos permite seleccionar los cambios que queremos confirmas para luego subir al repositorio que tenemos
alojado en la página de github. 

* ``` git add . ```
Este comando sirve para registrar todos los cambios correspondientes a todos los archivos de la copia o clon que fueron modificados.

##### Etapa 2: confirmación con declaración sobre cambios realizados
* ``` git commit -m "mensaje declarativo sobre el cambio que se realizó"
Este comando indica que confirmamos todos los cambios que elegimos en la epara anterior.
El mensaje entre comillas proporcionará información sobre los cambios que se hicieron 
dentro del proyecto en cuestión. Esta información resultará útil tanto para nosotros mismos 
como para otros programadores que también colaboran o colaborarán en el proyecto.

##### Etapa 3: envio de cambios
* ``` git push origin master ``
Este comando sirve para enviar los nuevos cambios realizados hacia el repositorio alojado
en la página de github. Luego de ejecutar este comando, el repositorio copia/clon estará
sincronizado con el repositorio presentae en la página de github. Es decir, tendrán exactamente
la misma información y cambios.

##### Obtener cambios 

Hasta ahora hemos visto como enviar cambios desde el repositorio copia/clon que tenemos en nuestra 
computadora hacia el repositorio alojado en la página de github. Ahora veremos cómo realizar el 
camino inverso, es decir, cómo traer los cambios realizados en la página de github hacia el 
repositorio que tenemos en nuestra computadora.

Para realizar tal acción, basta con ejecutar el siguiente comando:
 ``` git pull ```

Luego de ejcutarlo, tanto el repostorio copia/clon como el repositorio alijado en la página de 
github, tendrán la misma información.

##### Recomendaciones
Con el objetivo de evitar conflictos entre el repositorio clonado y el de la página de github,
antes de comenzar a trabajar en algún proyecto, es recomandable asegurarse de que los repositorios
se encuentren sincronizados. 

En caso de que no lo estén, asegurarse de traer los cambios o enviarlos, según corresponda.
