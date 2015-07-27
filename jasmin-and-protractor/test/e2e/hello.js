describe('Hello World Scenario', function() {

  it('should display the welcome screen', function() {
    browser.get('/');
    expect(element(by.css('h1')).getText()).toBe("'Allo, 'Allo!");
  });

  it('should display the about screen', function() {
    browser.get('/#/about');
    expect(element(by.css('.container > div > p')).getText()).toBe("This is the about view.");
  });

});
