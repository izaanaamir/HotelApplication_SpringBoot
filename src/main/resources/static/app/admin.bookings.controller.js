(function () {
    'use strict';

    angular
        .module('app')
        .controller('AdminBookingsController', AdminBookingsController);

    AdminBookingsController.$inject = ['$http'];

    function AdminBookingsController($http) {
        var vm = this;
        init();
        vm.bookings = [];
        vm.getAll = getAll;
        vm.deleteBooking = deleteBooking;


        function init() {
            getAll();
        }
        function getAll(){
            var url = "/admin/getAll/";
            var bookingPromise = $http.get(url);
            bookingPromise.then(function(response){
                vm.bookings = response.data;
            });
        }

        function getAll(){
            var url = "/admin/getAll/";
            var bookingPromise = $http.get(url);
            bookingPromise.then(function(response){
                vm.bookings = response.data;
            });
        }

        function deleteBooking(id){
            var url = "/admin/delete/" + id;
            $http.delete(url).then(function(response){
                vm.bookings = response.data;
            });
        }

    }
})();