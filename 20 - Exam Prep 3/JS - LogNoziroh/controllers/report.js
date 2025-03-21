const Report = require('../models').Report;

module.exports = {
    index: (req, res) => {
        let allReports = Report.findAll().then(allReports =>
            res.render("report/index", {"reports": allReports}));
    },
    createGet: (req, res) => {
        res.render("report/create");
    },
    createPost: (req, res) => {
        let args = req.body;

        Report.create(args).then(() =>
            res.redirect("/"));
    },
    detailsGet: (req, res) => {
        let id = req.params.id;

        Report.findById(id).then(report =>

        res.render("report/details", report.dataValues));
    },
    deleteGet: (req, res) => {
        let id = req.params.id;

        Report.findById(id).then(report => {
            res.render("report/delete", report.dataValues);
        })

    },
    deletePost: (req, res) => {
        let id = req.params.id;

        Report.findById(id).then(report => {
            report.destroy().then(() => {
                res.redirect("/");
            })
        })
    }
};