(function() {

  'use strict';

  function WeatherApi($http, Weather) {
    return {
      getFor: function(location) {
        return $http.get('https://george-vustrey-weather.p.mashape.com/api.php?location=' + location)
          .then(function(response) {
            var result = [];
            angular.forEach(response.data, function(item) {
              result.push(new Weather(item));
            });
            return result;
          });
      }
    }
  }

  function WeatherFactory() {
      function Weather(data) {
        this.dayOfWeek = data.day_of_week;
        this.condition = data.condition;
        this.high = data.high;
        this.low = data.low;
        this.highCelsius = data.high_celsius;
        this.lowCelsius = data.low_celsius;
        this.isFreezing = function() {
          return this.lowCelsius < 30;
        }
      }
      return Weather;
  }

  angular.module('myApp')
    .factory('WeatherApi', WeatherApi)
    .factory('Weather', WeatherFactory)
    .run(function($http) {
      $http.defaults.headers.common['X-Mashape-Key'] = 'EoMboIQlISmsh6nqgDgmY92xFd1jp1zlQdTjsn1bvpGyLDn6Zy'
    });

})();
