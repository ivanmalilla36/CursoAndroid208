'use strict'

const express = require('express');
const bodyParser = require('body-parser')
const app = express();
const port = 3678;

var path = require("path")

app.use(bodyParser.urlencoded({extended:false}));
app.use(bodyParser.json());

app.get('/', (req, res) =>  {
	console.log("ya hizo la peticion: /")
	res.send("Hola Mundo")
})

app.get('/saludar/:nombre?/:apellido?', (req, res) =>  {
	console.log("ya hizo la peticion: saludar")

	const nombres = req.params.nombre;
	const apellidos = req.params.apellido; 

	res.send(`nombre ${nombres} apellido ${apellidos}`);
})

app.get('/sumar/:num1?/:num2?', (req, res) =>  {
	console.log("ya hizo la peticion: sumar")
	const numero1 = req.params.num1;
	const numero2 = req.params.num2;

	const resul = parseInt(numero1) + parseInt(numero2);

	res.send(`tu suma es de ${resul}`)
})

app.get('/restar/:num1?/:num2?', (req, res) =>  {
	console.log("ya hizo la peticion: resta")
	const numero1 = req.params.num1;
	const numero2 = req.params.num2;

	const resul = parseInt(numero1) - parseInt(numero2);

	res.send(`tu suma es de ${resul}`)
})

app.get('/dividir/:num1?/:num2?', (req, res) =>  {
	console.log("ya hizo la peticion: dividir")
	const numero1 = req.params.num1;
	const numero2 = req.params.num2;

	const resul = parseInt(numero1) / parseInt(numero2);

	res.send(`tu suma es de ${resul}`)
})

app.get('/multi/:num1?/:num2?', (req, res) =>  {
	console.log("ya hizo la peticion: multi")
	const numero1 = req.params.num1;
	const numero2 = req.params.num2;

	const resul = parseInt(numero1) * parseInt(numero2);

	res.send(`tu suma es de ${resul}`)
})

app.get('/prueba', (req, res) =>  {
	 res.sendFile(path.join(__dirname + '/views' + '/sumar.html'));
})

module.exports = app;