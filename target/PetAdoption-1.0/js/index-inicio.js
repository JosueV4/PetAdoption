/*-------------------INICIO animacion barra nav--------------*/
window.addEventListener("scroll", function(){
    var header = document.querySelector("header");
    header.classList.toggle("abajo",window.scrollY>0);
});
/*-------------FIN ANIMACION BARRA---------------------------*/

