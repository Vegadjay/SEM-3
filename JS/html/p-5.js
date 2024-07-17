arr = [10,20,30,10,30,50,60];
        max = arr[0];
        for(let i = 1;i<arr.length;i++) {
            if(arr[i] > arr[i-1]) {
                max = arr[i];
            }
        }
        console.log(max)