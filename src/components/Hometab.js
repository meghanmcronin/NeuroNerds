import React, { Component } from "react";
import styled, { css } from "styled-components";

function Hometab(props) {
  return (
    <Container {...props}>
      <Home>Home</Home>
    </Container>
  );
}

const Container = styled.div`
  display: flex;
  align-items: center;
  background-color: #FFFFFF;
  padding: 6px;
  border-width: 1px;
  border-color: #007AFF;
  border-right-width: 0px;
  border-left-width: 0px;
  flex-direction: column;
  border-style: solid;
`;

const Home = styled.span`
  font-family: Roboto;
  font-size: 18px;
  color: rgba(255,255,255,1);
`;

export default Hometab;
