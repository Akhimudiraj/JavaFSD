var Logger = /** @class */ (function () {
    function Logger() {
    }
    Logger.prototype.log = function (msg) {
        console.log("LOG:", msg);
    };
    return Logger;
}());
var UserService = /** @class */ (function () {
    function UserService(logger) {
        this.logger = logger;
    }
    UserService.prototype.saveUser = function () {
        this.logger.log("User saved");
    };
    return UserService;
}());
var service = new UserService(new Logger());
service.saveUser();
