(function () {
    'use strict';

    angular
        .module('app')
        .controller('BookingsController', BookingsController);

    BookingsController.$inject = ['$http'];

    function BookingsController($http) {
        var vm = this;
        init();
        vm.bookings = [];
        vm.getAll = getAll;
        vm.deleteBooking = deleteBooking;


        function init() {
           getAll();
    }
    function getAll(){
        var url = "/all/getAll/";
        var bookingPromise = $http.get(url);
        bookingPromise.then(function(response){
            vm.bookings = response.data;
        });
    }
        function deleteBooking(id){
            var url = "all/delete/" + id;
            $http.delete(url).then(function(response){
                vm.bookings = response.data;
            });
        }

    }
})();