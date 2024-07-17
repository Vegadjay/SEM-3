// Making Path using path
// ! Make sure add path inside reqire
const path = require("path");

// baseline path

const basename = path.basename("D:/CODING/JAVA/Lab/SEM-3/JS/Nodejs");
console.log("basename: ", basename);

//! In this fn we can get the base root file name and must write root method otherwise this occur error;

const parsePath = path.parse("D:/CODING/JAVA/Lab/SEM-3/JS/Nodejs");
console.log("parsePath: ", parsePath.root);

//! This file return last portion of the file and print it.

const dirname = path.dirname("D:/CODING/JAVA/Lab/SEM-3/JS/Nodejs");
console.log("dirname : ", dirname);

// ! This path file return extention or last name after . of the file

const extName = path.extname("D:/CODING/JAVA/Lab/SEM-3/JS/Nodejs/index.js");
console.log("extName: ", extName);

// ! This is the join method and this is method join the path

const joinpath = path.join(
  "D:/CODING/JAVA/Lab/SEM-3/JS/Nodejs/index.js",
  "new.txt"
);
console.log("Join", joinpath);

// ! This method give normalize path to the given path

const normalize = path.normalize("D:/CODING/JAVA/Lab/SEM-3/JS/Nodejs/index.js");
console.log("Normalize: ", normalize);

// ! This method give us absolute path

const absolute = path.isAbsolute("D:/CODING/JAVA/Lab/SEM-3/JS/Nodejs/index.js");
console.log("absolute: ", absolute);
