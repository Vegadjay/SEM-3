// Demonstrate the ‘for of’ loop. (A)

const frutis = ["Apple","Banana","cherry","watermelon","dragonfruis"];

for(const i of frutis) {
    console.log(i);
    // This loop print values
}
for(const i of frutis) {
    console.log(frutis[i]);
    // This loop print whole array for five times
}
for(const i of frutis) {
    console.log(frutis[i]);
    //! This loop gives us UNDEFINED
}

// ! IGNORE ALL THE SPELING MISTAKES