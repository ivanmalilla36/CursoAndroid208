'use strict'

const Favorito = require('../models/favorito')

function prueba (req, res)  {
	console.log("ya hizo la peticion: saludar")

	const nombres = req.params.nombre;
	const apellidos = req.params.apellido; 

	res.send(`nombre ${nombres} apellido ${apellidos}`);
}

function getFavorito(req,res){
	const favoritoID = req.params.id
	res.status(200).send({data: favoritoID})
}

function getFavoritos(req,res){
Favorito.find({}, {_id:0 ,__v: 0}).sort({ title : 1}).exec(function(err, favoritos){ 
		if (err) {
			throw err;
			res.status(500).send("error")
		}
		if(!favoritos){
			res.status(404).send("no ahi marcadores")
		}
		res.status(200).send({favoritos})
	});

	

}

function saveFavorito(req,res){
	const favorito = new Favorito()
	const params = req.body

	favorito.title = params.title
	favorito.description = params.description
	favorito.url = params.url

	favorito.save((err,favoritoStored) => {
		if (err) {
			throw err;
			res.send({message: "No se pudo guardar el registro"})
		}
		else {
			res.send({message:favoritoStored})
		}
	})
}

function updateFavorito(req,res){
	const params = req.body
	res.status(200).send({update: true, favorito: params})
}

function deleteFavorito(req,res){
	const params = req.body
	res.status(200).send({delete: true, favorito: params})
}

module.exports = {
	prueba,
	getFavorito,
	saveFavorito,
	updateFavorito,
	deleteFavorito,
	getFavoritos
}