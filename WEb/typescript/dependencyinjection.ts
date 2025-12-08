//This code shows Dependency Injection (DI) — meaning a class (UserService) receives another class (Logger) from outside instead of creating it by itself.

class Logger {
    log(msg: string) {
        console.log("LOG:", msg);
    }
 }
 class UserService {
    constructor(private logger: Logger) {}
    saveUser() {
        this.logger.log("User saved");
    }
 }
 let service = new UserService(new Logger());
 service.saveUser();

 //UserService depends on Logger to work.

//The constructor expects a Logger object.

//TypeScript automatically creates a property this.logger because of private.