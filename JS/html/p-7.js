arr = [30,20,50,60,70,100,5604,20,1]
        printArr = (arr) => {
            for(i = 0;i<arr.length;i++) {
                console.log(arr[i]);
            }
        }
        for(i = 0;i<arr.length-1;i++) {
            for(j = 0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArr(arr);