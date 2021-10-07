const express = require('express')
const app = express()
const port = 3000
const path=require('path')
app.use(express.static(path.join(__dirname,'public')))
app.get('/hello/:Name', (req, res) => {
  
  res.send('Hello '+req.params.Name)
})
app.get('/about', (req, res) => {
    //res.send('about')
    //res.sendFile(path.join(__dirname,'index.html'))
  })
app.listen(port, () => {
  console.log(`Example app listening at http://localhost:${port}`)
})