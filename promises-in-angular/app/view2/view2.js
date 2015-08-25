(function() {

  'use strict';

  function View2Ctrl($http, $routeParams, WeatherApi) {
    var self = this;

    this.loading = true;
    this.location = $routeParams.location || 'London';

    this.initialise = function() {
      return $http.get('https://george-vustrey-weather.p.mashape.com/api.php?location=' + this.location)
        .then(function(response) {
          self.weather = response.data;
        });
    }

    this.initialise().then(function() {
      self.loading = false;
    });
  }

  angular.module('myApp.view2', ['ngRoute'])
    .config(function($routeProvider) {
      $routeProvider.when('/view2', {
        templateUrl: 'view2/view2.html',
        controller: 'View2Ctrl',
        controllerAs: 'controller'
      });
    })
    .controller('View2Ctrl', View2Ctrl)
    .run(function($http) {
      $http.defaults.headers.common['X-Mashape-Key'] = 'EoMboIQlISmsh6nqgDgmY92xFd1jp1zlQdTjsn1bvpGyLDn6Zy'
    });

})();
