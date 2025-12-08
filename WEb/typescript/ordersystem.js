//orderservice
var service = /** @class */ (function () {
    function service() {
        this.items = [];
    }
    //add items
    service.prototype.additem = function (item) {
        this.items.push(item);
    };
    service.prototype.totalamount = function () {
        return this.items
            .map(function (a) { return a.quantity * a.price; })
            .reduce(function (a, b) { return a + b; }, 0);
    };
    return service;
}());
var ss = new service();
ss.additem({ name: "pizza", price: 200, quantity: 2 });
console.log("total bill", ss.totalamount());
