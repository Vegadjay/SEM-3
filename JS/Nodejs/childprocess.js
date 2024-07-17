const child_process = require("child_process");

child_process.exec("cls", (err, stdout, stdin) => {
  if (err) {
    console.log(err);
  } else {
    console.log(stdout);
  }
});
