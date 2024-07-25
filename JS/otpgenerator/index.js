const crypto = require("crypto");

for (i = 0; i < 100; i++) {
  var random = crypto.randomInt(0, 1000000);
  console.log(random);
}
