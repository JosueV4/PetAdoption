var username = new URL(location.href).searchParams.get("username");
var user;

$(document).ready(function () {

    $(function () {
        $('[data-toggle="tooltip"]').tooltip();
    });

    getUsuario().then(function () {

        $("#mi-perfil-btn").attr("href", "profile.html?username=" + username);

        $("#user-petcoin").html(user.petcoin.toFixed(2) + "$");

        getMascotas(false, "ASC");

    });
});


async function getUsuario() {

    await $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioPedir",
        data: $.param({
            username: username
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);

            if (parsedResult != false) {
                user = parsedResult;
            } else {
                console.log("Error recuperando los datos del usuario");
            }
        }
    });
}



function getMascotas(ordenar, orden) {

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletMascotaListar",
        data: $.param({
            ordenar: ordenar,
            orden: orden
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);

            if (parsedResult != false) {
                mostrarMascotas(parsedResult);
            } else {
                console.log("Error recuperando los datos de las mascotas");
            }
        }
    });
}





function mostrarMascotas(mascotas) {

    let contenido = "";

    $.each(mascotas, function (index, mascota) {

        mascota = JSON.parse(mascota);
        let precio;

        if (mascota.edad > 0) {

            if (user.contribuyente) {

                if (mascota.disponible) {
                    precio = (2 - (2 * 0.1));
                } else {
                    precio = (1 - (1 * 0.1));
                }
            } else {
                if (mascota.disponible) {
                    precio = 2;
                } else {
                    precio = 1;
                }
            }

            contenido += '<tr><th scope="row">' + mascota.id + '</th>' +
                    '<td>' + mascota.nombremascota + '</td>' +
                    '<td>' + mascota.genero + '</td>' +
                    '<td>' + mascota.especie + '</td>' +
                    '<td>' + mascota.ubicacion + '</td>' +
                    '<td>' + mascota.raza + '</td>' +
                    '<td>' + mascota.edad + '</td>' +
                    '<td><input type="checkbox" name="disponible" id="disponible' + mascota.id + '" disabled ';
            if (mascota.disponible) {
                contenido += 'checked';
            }
            contenido += '></td>' +
                    '<td>' + precio + '</td>' +
                    '<td><button onclick="alquilarMascota(' + mascota.id + ',' + precio + ');" class="btn btn-success" ';
            if (user.petcoin < precio) {
                contenido += ' disabled ';
            }

            contenido += '>Adoptar</button></td></tr>'

        }
    });
    $("#mascotas-tbody").html(contenido);
}


