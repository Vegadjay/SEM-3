const express = require("express");

const app = express();

app.get("/home",(req,res)=>{
    res.send("Home page")
})


app.get("/about",(req,res)=>{
    res.send("About page")
})


app.get("/projects",(req,res)=>{
    res.send("Project page")
})


app.get("/help",(req,res)=>{
    res.send("Help page")
})


app.listen(3000,()=>{   
    console.log("Server is started")
});