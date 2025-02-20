const Task = require('../models').Task;

module.exports = {

    index: (req, res) => {

        let tasks = Task
            .findAll()
            .then(tasks => {

                let open = tasks.filter(t => t.status === "Open");
                let inProgress = tasks.filter(t => t.status === "In Progress");
                let finished = tasks.filter(t => t.status === "Finished");

                res.render("task/index", {
                    "openTasks": open,
                    "inProgressTasks": inProgress,
                    "finishedTasks": finished});
            })
    },

    createGet: (req, res) => {

        res.render("task/create");

    },

    createPost: (req, res) => {

        let args = req.body;

        Task.create(args).then(() => {
            res.redirect("/");
        });

    },

    editGet: (req, res) => {

        let id = req.params.id;

        Task.findById(id).then(task => {
            res.render("task/edit", task.dataValues);
        })
    },

    editPost: (req, res) => {

        let id = req.params.id;
        let args = req.body;

        Task.findById(id).then(task => {
            task.updateAttributes(args)
                .then(() => {
                    res.redirect("/");
                })
        })
    }
};