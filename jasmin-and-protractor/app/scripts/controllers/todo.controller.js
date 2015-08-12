'use strict';
(function() {

  function TodoController(Todo) {
    this.items = [];

    this.addItem = function (description) {
      this.items.push(new Todo(description));
    }
  }

  angular.module('jasminAndProtractorApp').controller('TodoController', TodoController)
  .config(function($routeProvider){
    $routeProvider.when('/todo', {
      templateUrl: 'views/todo.html',
      controller: 'TodoController',
      controllerAs: 'todoCtrl'
    });
  })


})();
