var username = new URL(location.href).searchParams.get("username");
var user;

$(document).ready(function () {


    fillUsuario().then(function () {

        $("#user-petcoin").html("$" + user.petcoin.toFixed());

        getAdoptados(user.username);
    });

    $("#adoptar-btn").attr("href", `home.html?username=${username}`);

    $("#form-modificar").on("submit", function (event) {

        event.preventDefault();
        modificarUsuario();
    });

    $("#aceptar-eliminar-cuenta-btn").click(function () {

        eliminarCuenta().then(function () {
            location.href = "index.html";
        })
    })

});

async function fillUsuario() {
    await $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioPedir",
        data: $.param({
            username: username,
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);

            if (parsedResult != false) {
                user = parsedResult;

                $("#input-username").val(parsedResult.username);
                $("#input-contrasena").val(parsedResult.contrasena);
                $("#input-nombre").val(parsedResult.nombre);
                $("#input-apellidos").val(parsedResult.apellido);
                $("#input-email").val(parsedResult.email);
                $("#input-petcoin").val(parsedResult.petcoin.toFixed(2));
                $("#input-contribuyente").prop("checked", parsedResult.contribuyente);

            } else {
                console.log("Error recuperando los datos del usuario");
            }
        }
    });
}

function getAdoptados(username) {


    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletAdoptadosListar",
        data: $.param({
            username: username,
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);

            if (parsedResult != false) {

                mostrarHistorial(parsedResult)

            } else {
                console.log("Error recuperando los datos de las adopciones");
            }
        }
    });
}


function mostrarHistorial(mascotas) {
    let contenido = "";
    if (mascotas.length >= 1) {
        $.each(mascotas, function (index, mascota) {
            pelicula = JSON.parse(mascota);

            contenido += '<tr><th scope="row">' + mascota.id + '</th>' +
                    '<td>' + mascota.titulo + '</td>' +
                    '<td>' + mascota.genero + '</td>' +
                    '<td><input type="checkbox" name="novedad" id="novedad' + mascota.id 
                    + '" disabled ';
            if (mascota.novedad) {
                contenido += 'checked'
            }
            contenido += '></td><td>' + mascota.fechaAdopcion + '</td>' +
                    '<td><button id="devolver-btn" onclick= "devolvermascota(' + mascota.id 
                    + ');" class="btn btn-danger">Devolver mascota</button></td></tr>';

        });
        $("#historial-tbody").html(contenido);
        $("#historial-table").removeClass("d-none");
        $("#historial-vacio").addClass("d-none");

    } else {
        $("#historial-vacio").removeClass("d-none");
        $("#historial-table").addClass("d-none");
    }
}


function devolvermascota(id) {

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletMascotaDevolver",
        data: $.param({
            username: username,
            id: id,
        }),
        success: function (result) {

            if (result != false) {

                location.reload();

            } else {
                console.log("Error devolviendo el mascota");
            }
        }
    });

}

function modificarUsuario() {

    let username = $("#input-username").val();
    let contrasena = $("#input-contrasena").val();
    let nombre = $("#input-nombre").val();
    let apellidos = $("#input-apellidos").val();
    let email = $("#input-email").val();
    let petcoin = $("#input-petcoin").val();
    let contribuyente = $("#input-contribuyente").prop('checked');
    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioModificar",
        data: $.param({
            username: username,
            contrasena: contrasena,
            nombre: nombre,
            apellidos: apellidos,
            email: email,
            petcoin: petcoin,
            contribuyente: contribuyente,
        }),
        success: function (result) {

            if (result != false) {
                $("#modificar-error").addClass("d-none");
                $("#modificar-exito").removeClass("d-none");
            } else {
                $("#modificar-error").removeClass("d-none");
                $("#modificar-exito").addClass("d-none");
            }

            setTimeout(function () {
                location.reload();
            }, 3000);

        }
    });

}

async function eliminarCuenta() {

    await $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioEliminar",
        data: $.param({
            username: username
        }),
        success: function (result) {

            if (result != false) {

                console.log("Usuario eliminado")

            } else {
                console.log("Error eliminando el usuario");
            }
        }
    });
}


