const express = require("express");
const mongoose = require("mongoose");
const bodyParser = require("body-parser")
const app = express();
mongoose.connect("mongodb+srv://Trial:Trial123@cluster0.i2xuta6.mongodb.net/");
app.use(bodyParser.json());
const User = mongoose.model("User",({email:String,password:String,}))

app.get("/",(req,res)=>{
    res.send("Hello world")
})

app.post("/login",(req,res)=>{
    const {email,password} = req.body;
    const user1 = new User({email,password})
    user1.save().then(()=>console.log("User saved succesfully"))
    res.send("Data saved")
})

app.get("/details", async (req,res)=>{
    try { 
        const user = await User.find();
        res.send(user);
    } catch(e) {
        console.log(e);
    }
})

app.get("/find/:email",(req,res)=>{
    try{
        User.findOne({email:req.params.email}).then((data)=>{
            res.status(200).json(data);
            console.log("Data founded")
        }).catch((e)=>{
            console.log(e);
        })
    } catch(e) {
        res.status(404).json({
            msg:"User not found"
        })
    }
})

app.listen(3000,()=>{
    console.log("Server is started");
});
