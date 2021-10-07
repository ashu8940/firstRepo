const express = require('express')
const app = express()
const port = 3000
const path=require('path')
const blogs=require('../Data/blogs')
const router=express.Router();
router.get('/',(req,res)=>{
   res.render('home');
    //res.sendFile(path.join(__dirname,'../templates/index.html'))
})
router.get('/blog',(req,res)=>{
    res.render('blogHome',{
        blogs:blogs
    });
    //res.sendFile(path.join(__dirname,'../templates/bloghome.html'))
})
router.get('/blogpost/:slug',(req,res)=>{
   myblog= blogs.filter(e=>{
  return e.slug==req.params.slug
    })
    res.render('blogPage',{
        title:myblog[0].title,
        content:myblog[0].content
    })
    
    
})


module.exports= router