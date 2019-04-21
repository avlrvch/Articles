'use strict';

angular.module('myApp.login', ['ngRoute'])

    .config(['$routeProvider', function($routeProvider) {
        $routeProvider.when('/login', {
            templateUrl: 'views/login/login.html',
            controller: 'LoginController'
        });
    }])

    .controller('LoginController', ['$scope','$rootScope','$http','$location', function($scope, $rootScope, $http, $location) {

        $scope.login = function () {
            $http.post('http://localhost:8080/login', {"userName" : $scope.username, "password" : $scope.password})
                .then(function (response) {

                var isLoggedIn = response.data.succeed;

                if (isLoggedIn){
                    $rootScope.isLoggedIn = isLoggedIn;
                    $location.path("/articles");
                }
            });
        };

    }]);