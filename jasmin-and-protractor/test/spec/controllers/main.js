'use strict';

describe('Controller: MainCtrl', function () {

  beforeEach(module('jasminAndProtractorApp'));

  var MainCtrl, scope;

  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    MainCtrl = $controller('MainCtrl', {
      $scope: scope
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(MainCtrl.awesomeThings.length).toBe(3);
  });

  it ('should click the link', function() {
    MainCtrl.linkClicked();
    expect(MainCtrl.count).toBe(1);
  });
  

});
