// ! Find GCD Number 
findGcd = (a,b) => {
    var result = Math.min(a,b);
    while(result > 0) {
        if(a % result == 0 && b % result == 0) {
            break;
        }
        result--;
    }
    return result;
}

console.log(findGcd(56,98))