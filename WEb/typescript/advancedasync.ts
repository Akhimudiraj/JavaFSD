function apiCall(): Promise<String> {
    return new Promise((resolve, reject) => {
        let success = false;
        success ? resolve("Success!") : reject("Failed!");
    });
 }
 apiCall()
    .then(res => console.log(res))
    .catch(err => console.error(err));

  //  then(res => ...) → runs when promise is resolved
//catch(err => ...) → runs when promise is rejected