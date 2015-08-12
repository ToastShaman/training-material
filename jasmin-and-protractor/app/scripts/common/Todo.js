'use strict';
(function() {
  function TodoFactory($http) {
    function Todo() {
      this.isDone = false;
      this.markAsDone = function() {
        this.isDone = true;
      }

      this.save = function() {
        $http.post
      }
    }
    return Todo;
  }
  angular.module('jasminAndProtractorApp').factory('Todo', TodoFactory);
})();
