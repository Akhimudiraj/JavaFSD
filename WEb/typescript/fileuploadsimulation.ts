async function uploadFile(file: string): Promise<string> {
    return new Promise(resolve => {
        setTimeout(() => resolve(file + " uploaded"), 2000);
    });
}

async function startUpload() {
    let result = await uploadFile("resume.pdf");
    console.log(result);
}

startUpload();
