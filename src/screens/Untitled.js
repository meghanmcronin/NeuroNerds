import React, { Component } from "react";
import styled, { css } from "styled-components";

function Untitled(props) {
  return (
    <Stack>
      <Image
        src={require("../assets/images/Screenshot_1614821420.png")}
      ></Image>
      <Image2
        src={require("../assets/images/Screenshot_1614821446.png")}
      ></Image2>
    </Stack>
  );
}

const Stack = styled.div`
  width: 689px;
  height: 322px;
  margin-top: 56px;
  margin-left: 344px;
  position: relative;
  display: flex;
`;

const Image = styled.img`
  top: 0px;
  left: 0px;
  width: 434px;
  height: 322px;
  position: absolute;
  object-fit: contain;
`;

const Image2 = styled.img`
  top: 0px;
  left: 298px;
  width: 391px;
  height: 322px;
  position: absolute;
  object-fit: contain;
`;

export default Untitled;
