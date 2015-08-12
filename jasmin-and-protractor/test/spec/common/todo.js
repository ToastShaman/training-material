describe('The Todo thingy', function() {

  beforeEach(module('jasminAndProtractorApp'));

  var Todo, $httpBackend;

  beforeEach(inject(function ($injector) {
    Todo = $injector.get('Todo');
    $httpBackend = $injector.get('$httpBackend');
  }));

  it('should mark itself as done', function() {
      var item = new Todo();
      item.markAsDone();
      expect(item.isDone).toBeTruthy();
  });

  it('saves it', function() {
    $httpBackend.expectPOST('/', { myContent: 'fooBar' }).respond(201, {id: '12344'});

    var item = new Todo();
    item.save();

    $httpBackend.flush();
  });

      

});
