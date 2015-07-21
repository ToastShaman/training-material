import React from "react/addons";

import {
  Appear, BlockQuote, Cite, CodePane, Deck, Fill,
  Heading, Image, Layout, Link, ListItem, List, Quote, Slide, Text
} from "../src/spectacle";

import preloader from "../src/utils/preloader";

const images = {
  tdd: require("./tdd-cycle.png"),
  pyramid: require("./test-pyramid.png")
};

preloader([images.tdd, images.pyramid]);

export default class extends React.Component {
  render() {
    return (
      <Deck transition={["slide"]} bgColor="primary" textColor="secondary" transitionDuration={800}>
        <Slide>
          <Heading size={1} fit caps textColor="black">Testing</Heading>
          <Heading size={1} fit caps margin="-20px 0px">How to write good automated tests</Heading>
        </Slide>
        <Slide bgColor="black">
          <Heading size={1} fit caps textColor="white">Wait!</Heading>
          <Heading size={1} fit textColor="primary" textFont="secondary">Why are we writing tests?</Heading>
        </Slide>
        <Slide notes="http://www.onjava.com/pub/a/onjava/2003/04/02/javaxpckbk.html">
          <List>
            <ListItem>Tests reduce bugs in new features</ListItem>
            <ListItem>Tests reduce bugs in existing features</ListItem>
            <ListItem>Tests are good documentation</ListItem>
            <ListItem>Tests reduce the cost of change</ListItem>
            <ListItem>Tests improve design</ListItem>
            <ListItem>Tests allow refactoring</ListItem>
            <ListItem>Tests defend against other programmers</ListItem>
            <ListItem>Tests reduce fear</ListItem>
          </List>
        </Slide>
        <Slide bgColor="white">
          <Image src={images.tdd.replace('/','')} margin="0px auto 40px" height="600px"/>
        </Slide>
        <Slide bgColor="black">
          <BlockQuote>
            <Quote>Choose an appropriate type of test to exercise your functionality</Quote>
            <Cite>Kevin Denver</Cite>
          </BlockQuote>
        </Slide>
        <Slide>
        <Heading size={1} fit caps textColor="black">Acceptance</Heading>
        <Heading size={1} fit textColor="white">Does the whole system work?</Heading>
        </Slide>
        <Slide>
        <Heading size={1} fit caps textColor="black">Integration</Heading>
        <Heading size={1} fit textColor="white">Does our code work against code we can not change?</Heading>
        </Slide>
        <Slide>
          <Heading size={1} fit caps textColor="black">Unit</Heading>
          <Heading size={1} fit textColor="white">Do our objects do the right thing, are they convenient to work with?</Heading>
        </Slide>
        <Slide bgColor="white">
          <Image src={images.pyramid.replace('/','')} margin="0px auto 40px" height="640px"/>
        </Slide>
        <Slide>
          <Heading caps fit size={1} textColor="tertiary">Some rules of thumb</Heading>
          <Heading caps fit size={1} textColor="secondary">for writing good tests</Heading>
        </Slide>
        <Slide bgColor="black">
          <Heading size={1} fit caps textColor="white">Hang On!</Heading>
          <Heading size={1} fit textColor="primary" textFont="secondary">What would you consider a bad test?</Heading>
        </Slide>
        <Slide>
          <Text margin="-90px 0 0 0">Make sure a failing test tells you exactly why it is failing</Text>
          <CodePane lang="java" source={require("raw!./fail-with-reason.example")} margin="20px auto"/>
          <Text>Choose appropriate method names for your tests</Text>
          <CodePane lang="java" source={require("raw!./method-names.example")} margin="20px auto"/>
        </Slide>
        <Slide notes="http://stackoverflow.com/questions/61400/what-makes-a-good-unit-test">
          <Text margin="-90px 0 0 0" bold>Thorough</Text>
          <Text>Coverage; Ensure that you test all key paths and scenarios.</Text>
          <Text bold margin="40px 0 0 0">Repeatable</Text>
          <Text>Tests should produce the same results each time.. every time. Tests should not rely on uncontrollable parameters.</Text>
          <Text bold margin="40px 0 0 0">Independent</Text>
          <Text>Tests should test only one thing at a time. Multiple assertions are okay as long as they are all testing one feature/behavior. When a test fails, it should pinpoint the location of the problem.</Text>
          <Text bold margin="40px 0 0 0">Professional</Text>
          <Text>Follow the same standard of good-design for your test code.</Text>
        </Slide>
      </Deck>
    );
  }
}
