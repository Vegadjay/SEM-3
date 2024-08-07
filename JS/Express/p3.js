const express = require("express");
const app = express();

const checkData = (req, res, next) => {
    req.dataChecked = true;
    res.send("ASDF")
    next();   
}

app.get("/home", checkData, (req, res) => {
    if (req.dataChecked) {
        res.send("Login Successful");
    } else {
        res.send("Sorry data is wrong");
    }
});

app.listen(3000, () => {
    console.log("Server is started");
});