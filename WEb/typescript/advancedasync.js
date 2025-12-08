function apiCall() {
    return new Promise(function (resolve, reject) {
        var success = false;
        success ? resolve("Success!") : reject("Failed!");
    });
}
apiCall()
    .then(function (res) { return console.log(res); })
    .catch(function (err) { return console.error(err); });
