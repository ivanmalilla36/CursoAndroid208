'use strict'

const app = require('./app');
const port = 3678;

app.listen(port, () => {
	console.log(`API RES FAVORITOS funcionando en en http://localhost:${port}`);
});

