let a = 30;
var b = 1000;
function printVariableValue() {
    console.log(a);
    console.log("Function is called and let value is printed");
    console.log(b);
    console.log("B's Value is printed and var is printed")
    console.log("--------------------------------------------------------")
}

function printSecondVariableValue() {
    let a = 20;
    console.log(a)
    console.log("Second Function is called")
    console.log(b);
    console.log("B's Value is printed and var is printed");
    
}
function abc() {
    console.log(a);
}
printVariableValue();
printSecondVariableValue()