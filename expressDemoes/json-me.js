var express=require('express');
const fs = require('fs');
var path=require('path');
var app=express();
app.get('/books',function(req,res){
  fs.readFile(process.argv[3],function(err,data){
    if(err){
        return err;
    }
    else{
    var object=JSON.parse(data);
    res.json(object);
    }
       })
 
});
app.listen(process.argv[2]);