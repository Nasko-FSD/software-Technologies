const Article = require('../models').Article;
const User = require('../models').User;

module.exports = {
    createGet: (req, res) => {
        res.render('article/create')
    },

    createPost: (req, res) => {
        // take values from request
        const title = req.body.title;
        const content = req.body.content;

        let errorMsg = false;

        // validate input
        if (!req.isAuthenticated()) {
            errorMsg = "You must be logged in before creating articles!";
        } else if (!title) {
            errorMsg = "Title cannot be empty";
        } else if (!content) {
            errorMsg = "Content cannot be empty";
        }

        if (errorMsg) {
            res.render('article/create', {error: errorMsg, title, content});
            return;
        }

        //find author
        const authorId = req.user.id;

        const article = {
            title,
            content,
            authorId
        };
        //record values in DB
        Article.create(article).then(article => {
            res.redirect('/');
        }).catch(e => {
            console.log(e.message);
            res.render('article/create', {error: e.message});
        });

        //redirect to / home

},

    details: (req, res) => {
        // get article ID
        const articleID = Number(req.params.id);
        // get from DB by ID
        Article.findByPk(articleID, {
            include: [{
                model: User
            }]
        }).then(article => {
            if (article === null) {
                throw new Error('Article not found: ' + articleID);
            }
            res.render('article/details', article.dataValues)
        }).catch(e => {
            console.log(e.message);
            res.redirect('/404');
        });
        // render template with data
    }

};