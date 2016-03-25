describe("Eagle", function() {
  var eagle;

  beforeEach(function() {
    eagle = new EagleSearch();
  });

  it("should solve correctly", function() {
    expect(eagle.solve('219.45.143.143')==('27.38cm')).toBe(true);
  });
  it("It wont pass every time", function() {
    expect(eagle.solve('219.45.143.143')==('22.38cm')).toBe(false);
  });
});
