'use strict'

const mongoose = require('mongoose');

mongoose.connect('mongodb://localhost:27017/cursofavoritos',(err,res)=>{
	console.log("base de datos iniciada")

	if (err) {
		// throw err;
		console.log("Este es un error")
	}
	else{
		app.listen(port, () => {
		console.log(`API RES FAVORITOS funcionando en en http://localhost:${port}`);
	});
	}

})

const app = require('./app');
const port = 3678;


