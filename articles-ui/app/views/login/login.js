'use strict';

angular.module('myApp.login', ['ngRoute'])

    .config(['$routeProvider', function($routeProvider) {
        $routeProvider.when('/login', {
            templateUrl: 'views/login/login.html',
            controller: 'LoginController'
        });
    }])

    .controller('LoginController', ['$scope','$rootScope','$http', function($scope, $rootScope, $http) {

        $scope.login = function () {
            $http.post('http://localhost:8080/test', "adasd").then(function (value) {
               console.log(value);
            });
            $rootScope.isLoggedIn = true;
        };

    }]);