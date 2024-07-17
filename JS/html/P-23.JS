// . Demonstrate the Array and Object Destructuring. (B)

arr = ["Suresh","Mukesh","Paresh","Ramesh"];

// Now Destructuring whole array
const [f,s,t,f1] = arr;

// console.log(t);

// Destructuring object

const student = {
    name:"abc",
    age:30,
}

var {name,age} = student;

console.log(name);