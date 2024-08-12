const express = require("express");
const bodyParser = require("body-parser");
const app = express();
app.use(bodyParser.json())
const student = [
    {
        name:"lajhsfd",
        id:1,
    },
    {
        name:"aljshd",
        id:2, 
    },
    {
        name:"ald",
        id:3
    }
]

app.get("/",(req,res)=>{
    res.send(student);
})

app.post("/adduser",(req,res)=>{
    const {name,id} = req.body;
    student.push({name,id});
    res.send("User added successfully");
})

app.put("/user:id",(req,res)=>{
     let found = student.find(function (item) {
        return item.id === parseInt(req.params.id);
    });
    if (found) {
        let updateData = {
            name:req.body.name,
            id:req.body.id,
        };

        let targetIndex = student.indexOf(found);

        student.splice(targetIndex, 1, updateData);

        res.status(201).json({ 'message': "data updated" });
    }
    else {
        res.send("id is not found")
    }
})

app.delete("/delete:id",(req,res)=>{
    let found = student.find(function (item) {
        return item.id === parseInt(req.params.id);
    });
    if (found) {
        let targetIndex = student.indexOf(found);

        student.splice(targetIndex, 1);

        res.send("User Deleted successfully");
    } else {
        res.send("User is not excists");
    }
});


app.listen(3000,()=>{
    console.log("Server is started")
})