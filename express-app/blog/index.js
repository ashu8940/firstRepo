const express = require('express')
const exphbs  = require('express-handlebars');
const app = express()
const port = 3000
const path=require('path')
app.engine('handlebars', exphbs());
app.set('view engine', 'handlebars');
app.use(express.static(path.join(__dirname,'public')))
app.use('/',require(path.join(__dirname,'routes/blog.js')))
app.listen(port, () => {
  console.log(`Example app listening at http://localhost:${port}`)
})