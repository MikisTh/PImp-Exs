var raio = prompt("Raio do circulo: ");
raio = parseFloat(raio);

var comprimento = 2 * Math.PI * raio;
var area = Math.PI * raio * raio;

document.write("Comprimento da circunferencia        = ", comprimento, "<br>");
document.write("Area da circunferencia               = ", area);

