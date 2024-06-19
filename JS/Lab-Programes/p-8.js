arr = [10,20,30,40,50,60]
        result = 50;
        found = false;
        for(i = 0; i<arr.length;i++) {
            if(arr[i] == result) {
                console.log(i);
                found = true;
                break;
            }
        }
        if(found == false) {
            console.log("not found");
        }