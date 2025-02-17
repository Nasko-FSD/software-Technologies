const Film = require('../models').Film;

module.exports = {
	index: (req, res) => {

		let allFilms = Film.findAll().then(allFilms => {

		res.render("film/index", {"films": allFilms})

		});

	},

	createGet: (req, res) => {

		res.render("film/create")

	},

	createPost: (req, res) => {

		let args = req.body;
		console.log(args);

		Film.create(args).then(() => {
			res.redirect("/");
		})
			.catch(err => {
				console.log(err.message);
			})
	},

	editGet: (req, res) => {

		let id = req.params.id;

		Film.findById(id).then(film => {

        res.render("film/edit", {"name": film.name,
		"genre": film.genre,
		"director": film.director,
		"year": film.year,
		"id": id});

		}).catch(err => {
			console.log(err.message);
		})
	},

	editPost: (req, res) => {
        let id = req.params.id;
		let args = req.body;

		Film.findById(id).then(film => {
			film.updateAttributes(args).then(() => {
				res.redirect("/");
			});
		})
	},

	deleteGet: (req, res) => {
        let id = req.params.id;

		Film.findById(id).then(film => {
			res.render("film/delete", {"name": film.name,
				"genre": film.genre,
				"director": film.director,
				"year": film.year,
				"id": id});
		}).catch(err => {
			console.log(err.message);
		})
	},

	deletePost: (req, res) => {
        let id = req.params.id;

		Film.findById(id).then(film => {
			film.destroy().then(() => {
				res.redirect("/");
			})
		})
	}
};