import React, { Component } from "react";
import styled, { css } from "styled-components";

function CupertinoButtonInfo1(props) {
  return (
    <Container {...props}>
      <Login>LOGIN</Login>
    </Container>
  );
}

const Container = styled.div`
  display: flex;
  background-color: #007AFF;
  justify-content: center;
  align-items: center;
  flex-direction: row;
  border-radius: 5px;
  padding-left: 16px;
  padding-right: 16px;
`;

const Login = styled.span`
  font-family: Roboto;
  color: #fff;
  font-size: 30px;
  font-weight: 500;
`;

export default CupertinoButtonInfo1;
