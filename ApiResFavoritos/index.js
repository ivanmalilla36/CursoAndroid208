'use strict'

const express = require('express');
const bodyParser = require('body-parser')
const app = express();
const port = 3678;

app.use(bodyParser.urlencoded({extended:false}));
app.use(bodyParser.json());

app.get('/', function (req, res) {
	console.log("ya hizo la peticion")
	res.send("Hola Mundo")
})

app.listen(port, () => {
	console.log(`API RES FAVORITOS funcionando en en http://localhost:${port}`);
});

console.log("hola!");