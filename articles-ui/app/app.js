'use strict';

// Declare app level module which depends on views, and core components
angular.module('myApp', [
    'ngRoute',
    'myApp.articles',
    'myApp.login',
    'myApp.register'
])
    .config(['$locationProvider', '$routeProvider', function ($locationProvider, $routeProvider) {
        $locationProvider.hashPrefix('!');

        $routeProvider.otherwise({redirectTo: '/articles'});

    }])
    .run(['$rootScope', '$location', '$http', function ($rootScope, $location, $http) {

        $rootScope.$on('$locationChangeStart', function (event, next, current) {
            // redirect to login page if not logged in and trying to access a restricted page
            // var restrictedPage = $.inArray($location.path(), ['/login', '/register']) === -1;
            // var loggedIn = $rootScope.globals.currentUser;

            var restrictedPage = true;
            console.log($location.url());

            if ($location.url() === '/login' || $location.url() === '/register') {
                restrictedPage = false;
            }
            var loggedIn = $rootScope.isLoggedIn;
            console.log(restrictedPage);

            if (restrictedPage) {
                if (!loggedIn){
                    $location.path('/login');
                }
            }
        });
    }]);

