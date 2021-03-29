import React, { Component } from "react";
import styled, { css } from "styled-components";

function CupertinoSegmentWithThreeTabs1(props) {
  return (
    <Container {...props}>
      <TextWrapper>
        <SegmentTextWrapper1>
          <ButtonOverlay>
            <Login>Login</Login>
          </ButtonOverlay>
        </SegmentTextWrapper1>
        <SegmentTextWrapper2>
          <ButtonOverlay>
            <Home>Home</Home>
          </ButtonOverlay>
        </SegmentTextWrapper2>
        <SegmentTextWrapper3>
          <ButtonOverlay>
            <ContactUs>Contact Us</ContactUs>
          </ButtonOverlay>
        </SegmentTextWrapper3>
      </TextWrapper>
    </Container>
  );
}

const Container = styled.div`
  display: flex;
  flex-direction: row;
  align-items: center;
  background-color: #FFF;
`;

const ButtonOverlay = styled.button`
 display: block;
 background: none;
 height: 100%;
 width: 100%;
 border:none
 `;
const TextWrapper = styled.div`
  height: 40px;
  flex: 1 1 0%;
  padding-left: 30px;
  padding-right: 30px;
  flex-direction: row;
  display: flex;
`;

const SegmentTextWrapper1 = styled.div`
  flex: 1 1 0%;
  align-items: center;
  background-color: rgba(255,255,255,1);
  padding: 6px;
  border-width: 1px;
  border-color: #007AFF;
  border-bottom-left-radius: 5px;
  border-top-left-radius: 5px;
  flex-direction: column;
  display: flex;
  border-style: solid;
`;

const Login = styled.span`
  font-family: Roboto;
  font-size: 18px;
  color: rgba(0,122,255,1);
`;

const SegmentTextWrapper2 = styled.div`
  flex: 1 1 0%;
  align-items: center;
  background-color: #FFFFFF;
  padding: 6px;
  border-width: 1px;
  border-color: #007AFF;
  border-right-width: 0px;
  border-left-width: 0px;
  flex-direction: column;
  display: flex;
  border-style: solid;
`;

const Home = styled.span`
  font-family: Roboto;
  font-size: 18px;
  color: #007AFF;
`;

const SegmentTextWrapper3 = styled.div`
  flex: 1 1 0%;
  align-items: center;
  background-color: rgba(0,122,255,1);
  padding: 6px;
  border-width: 1px;
  border-color: #007AFF;
  border-bottom-right-radius: 5px;
  border-top-right-radius: 5px;
  flex-direction: column;
  display: flex;
  border-style: solid;
`;

const ContactUs = styled.span`
  font-family: Roboto;
  font-size: 18px;
  color: rgba(255,255,255,1);
`;

export default CupertinoSegmentWithThreeTabs1;
