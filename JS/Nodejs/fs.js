const fs = require("fs");
// ! This method check if file is exsits than print true otherwise print else value

// fs.exists("index.js", (err) => {
//   if (err) {
//     console.log(err);
//   } else {
//     console.log("File Found");
//   }
// });

// ! This method write the file.

// fs.writeFile("test.txt", "Hello World", (err) => {
//   if (err) {
//     console.log(err);
//   } else {
//     console.log("file is done!");
//   }
// });

// ! This fn gives state of the file basically gives all the data related data..

// fs.stat("index.js", (err, data) => {
//   if (err) {
//     console.log("Error is occur");
//     console.log(err);
//   } else {
//     console.log(data);
//   }
// });

// ! This is the file reader and take two parameters and print it while it is not txt file than its print buffer of the file while we get original data than we use toString() method.

// fs.readFile("index.js", (err, data) => {
//   if (err) {
//     console.log("error is Occur");
//     console.log(err);
//   } else {
//     console.log(data.toString());
//   }
// });

// ! This is the rename file funtion and this funtion take two parameters as input, one is orignal file name and second is second file name and it is rename file

// fs.rename("test.txt", "abc.txt", (err) => {
//   if (err) console.log(err);
//   else console.log("File rename");
// });

fs.appendFile("abc.txt", "asdfhaslk;dfhlkasjdlfkjas;lkdjf", (err) => {
  if(err) throw err;
  console.log("File is append")
});
