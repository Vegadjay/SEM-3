const express = require("express");
const path = require("path");
const app = express();

app.get('/home/:name',(req,res)=>{
    const user_name = req.params.name;
    res.send(`Welcome home, ${user_name}`)
})

app.get("/home",(req,res)=>{
    res.sendFile(path.join(__dirname,"index.html"))
})

app.listen(3000,()=>{
    console.log("Server is started")
})