function validar(forma){
   var usuario =  forma.usuario;
   // validacion de usuario
   if(usuario.value =="" || usuario.value == "Escribir usuario"){
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;         
   }
   // validacion de password
   var password = forma.password;
   if(usuario.value =="" | usuario.value.length<3){
        alert("Debe proporcionar un password al menor de 3 caracteres");
        password.focus();
        password.select();
        return false;         
   }
   
    // validacion de check tenologias 
   var tecnologia = forma.tecnologia;
   var checkseleccionado = false;
   
    for (var i = 0; i < tecnologia.length; i++) {
        if(tecnologia[i].check){
            checkseleccionado = true;
        }
    }
    
    if(!checkseleccionado){
        alert("Debe seleccionar una tenologia")
        return false;
    }  
    
    
 }
   
   