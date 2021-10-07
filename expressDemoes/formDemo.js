var express=require('express');
var app=express();
const bodyparser = require('body-parser')
app.use(bodyparser.urlencoded({extended:false}))
app.post('/form',function(req,res){
    var str = req.body.str;
    var strReversed = str.split('').reverse().join('');
    res.send(strReversed);
})
app.listen(process.argv[2]);