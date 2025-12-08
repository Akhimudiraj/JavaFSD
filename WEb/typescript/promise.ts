function fetchData(): Promise<string> {
    return new Promise((resolve) => {
        setTimeout(() => resolve("data received"), 1500);
    });
}

fetchData().then((data) => console.log(data));
