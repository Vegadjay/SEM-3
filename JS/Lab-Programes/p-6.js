arr = [10,30,20,70,40,100,50]
printArr = (arr) => {
    for(let i = 0;i<arr.length;i++) {
        console.log(arr[i])
    }
}
for(let i = 0;i<arr.length;i++) {
   for(let j = 0;j<arr.length-1;j++) {
       if(arr[j]>arr[j+1]) {
        arr[j] = arr[j] + arr[j+1];
        arr[j+1] = arr[j] - arr[j+1];
        arr[j] = arr[j] - arr[j+1];
    }
} 
printArr()
}