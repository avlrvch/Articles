'use strict';

angular.module('myApp.articles', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/articles', {
    templateUrl: '/views/articles/articles.html',
    controller: 'ArticlesController'
  });
}])

.controller('ArticlesController', [function() {

}]);