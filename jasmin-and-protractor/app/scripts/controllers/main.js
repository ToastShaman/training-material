'use strict';

angular.module('jasminAndProtractorApp')
.controller('MainCtrl', function () {
    this.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];

    this.counter = 0;

    this.linkClicked = function() {
      this.counter = this.counter + 1;
    }

  });
