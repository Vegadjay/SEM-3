a = prompt("Enter your word:: ");
        arr = ["dog","cat","donkey","horse","monkey"]
        found = false;
        for(i=0;i<arr.length;i++) {
            if(a === arr[i]) {
                console.log(i);
                found = true;
            }
        }
        if(found == false) { 
            console.log("not found");
        }