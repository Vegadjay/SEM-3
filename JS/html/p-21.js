//  Demonstrate the spread operator. (A)

student = {
    fname:"ABC",
    age:30,
    enroll:23010102010
}

// Now i want to add some value in object
// Here is am adding mobile number

const updateStudent =  {...student, mobileNum:1223234123};

console.log(updateStudent);

