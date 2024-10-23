const Calculator = require('../models/Calculator');

module.exports = {
    indexGet: (req, res) => {
        res.render('home/index');
    },
    indexPost: (req, res) => {
        const left = Number(req.body.calculator.leftOperand);
        const right = Number(req.body.calculator.rightOperand);
        const operator = req.body.calculator.operator;
        const myCalc = new Calculator(operator, left, right);
        const result = myCalc.calculate();

        res.render('home/index', {
            calculator: myCalc,
            result
        });
    }
};