var http=require('http')
var map = require('through2-map')
var createServer=http.createServer(function(req,res){
req.pipe(map(function (chunk) {
       return chunk.toString().toUpperCase()
     })).pipe(res)
}).listen(process.argv[2])