'use strict';

angular.module('myApp.register', ['ngRoute'])

    .config(['$routeProvider', function($routeProvider) {
        $routeProvider.when('/register', {
            templateUrl: 'views/register/register.html',
            controller: 'RegisterController'
        });
    }])

    .controller('RegisterController', ['$scope','$rootScope','$http','$location', function($scope, $rootScope, $http, $location) {

        $scope.register = function () {
            $http.post('http://localhost:8080/register', {"userName" : $scope.username, "password" : $scope.password}).then(function (response) {

                var registeredSuccessfullly = response.data.succeed;

                if (registeredSuccessfullly){
                    $location.path("/login");
                }
            });
        };

    }]);