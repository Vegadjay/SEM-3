// Demonstrate the default parameter while using a function.

function sum(a,b,c) {
    console.log(a+b+c);
}

sum(10,20); // This function print NaN beacause last parameter is not given;

// Default parameter 

function sum1(a,b,c=5) {
    console.log("This is the default para");
    console.log(a+b+c);
}

sum1(20,30);
