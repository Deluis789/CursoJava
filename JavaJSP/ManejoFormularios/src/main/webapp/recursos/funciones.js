function validarForma(fo){
    var usuario = fo.usuario;
    if(usuario.value == "" || usuario.value == "Escribir Usuario"){
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    var password = fo.password;
    if(password.value == "" || password.value.length < 3){
        alert("Debe proporcionar un password el menos de 3 caracteres");
        password.focus();
        password.select();
        return false;
    }
    var tecnologias = fo.tecnologia;
    var checkSeleccionado = false;
    
    for(var i = 0 ; i < tecnologias.length ; i++){
        if(tecnologias[i].checked){
            checkSeleccionado = true;
        }
    }
    if(!checkSeleccionado){
        alert("Debe seleccionar una tecnologia");
        return false;
    }
    var generos = fo.genero;
    var radioSeleccionado = false;
    
    for(var i = 0 ; i<generos.length ; i++){
        if(generos[i].checked){
            radioSeleccionado = true;
        }
    }
    if(!radioSeleccionado){
        alert("Debe seleccionar un genero");
        return false;
    }
    
    var ocupacion = fo.ocupacion;
    
    if(ocupacion.value == ""){
        alert("Debe seleccionar una ocupacion");
        return false
    }
    
    //Formulario valido
    alert("Formulario valido, enviando datos al servidor");
    return true;
}

