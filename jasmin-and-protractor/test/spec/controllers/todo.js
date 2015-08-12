'use strict';

describe('Controller: Todo', function () {

  beforeEach(module('jasminAndProtractorApp'));

  var controller, $scope;

  beforeEach(inject(function ($controller, $rootScope) {
    $scope = $rootScope.$new();
    controller = $controller('TodoController');
  }));

  it('should add a new todo item', function () {
    controller.addItem('Hello World');
    expect(controller.items.length).toBe(1);
  });
});
